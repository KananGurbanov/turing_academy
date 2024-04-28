package az.edu.turing.MyApps.HappyFamily;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Family {
    private Man father;

    private Woman mother;

    private ArrayList<Human> children = new ArrayList<>();

    private Set<Pet> pets = new HashSet<>();

    public Family(Man father, Woman mother, ArrayList<Human> children, Set<Pet> pets) {
        this.father = father;
        this.mother = mother;
        this.children = children;
        this.pets = pets;
    }

    public Family(Man father, Woman mother) {
        this.father = father;
        this.mother = mother;
    }

    public Man getFather() {
        return father;
    }

    public void setFather(Man father) {
        this.father = father;
    }

    public Woman getMother() {
        return mother;
    }

    public void setMother(Woman mother) {
        this.mother = mother;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public void addChild(Human child){
        this.getChildren().add(child);
    }

    public boolean deleteChild(int index){
        if(index < this.getChildren().size()){
            this.getChildren().remove(index);
            return true;

        }

        else{
            return false;
        }

    }

    public boolean deleteChild(Human child){
        for (Human c : this.getChildren()){
            if(c.hashCode() == child.hashCode()){
                this.getChildren().remove(c);
                return true;
            }
        }
        return false;
    }

    public int countFamily(){
        return this.getChildren().size() + 2;
    }

    String prettyFormat(){
        StringBuilder sb = new StringBuilder();

        sb.append("family :\n\t\t");
        sb.append( "mother : " + mother + "\n\t\t");
        sb.append("father : " + getFather() + "\n\t\t");
        sb.append("children :\n\t\t\t\t");
        getChildren().stream().filter(x->x instanceof Man).forEach(child->sb.append("boy : " + child + "\n\t\t\t\t"));
        getChildren().stream().filter(x->x instanceof Woman).forEach(child->sb.append("girl : " +child +"\n\t\t\t\t"));

        sb.append("\n\t\tpets : " + getPets());

        return sb.toString();

    }

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                ", pets=" + pets +
                '}';
    }
}
