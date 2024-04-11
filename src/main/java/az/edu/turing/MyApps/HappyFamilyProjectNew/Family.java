package az.edu.turing.MyApps.HappyFamilyProjectNew;

import java.util.ArrayList;

public class Family {
    private Human father;

    private Human mother;

    private ArrayList<Human> children = new ArrayList<>();

    private Pet pet;

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
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

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }
}
