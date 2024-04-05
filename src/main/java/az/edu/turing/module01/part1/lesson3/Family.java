package az.edu.turing.module01.part1.lesson3;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;

    private Human father;

    private Human [] children;

    private Pet pet;

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }





    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public boolean deleteChild (int index){

        Human [] n = new Human [this.children.length - 1];

        for (int i = 0; i< this.children.length - 1;i++){
            if(i<index){
                n[i] = this.children[i];
            }
            else{
                n[i] = this.children[i+1];
                this.children[i+1] = null;

            }


        }

        this.children = n;

        return true;
    }

    public void addchild(Human child){

        boolean flag = true;

        for (int i = 0; i<this.children.length;i++){
            if(this.children[i].hashCode()== child.hashCode()){
                flag = false;
                System.out.println("Already exist in the array");
            }
        }

        if (flag){
            Human [] n = new Human [this.children.length + 1];

            for (int i = 0; i< children.length;i++){
                n[i] = children[i];
            }

            n[n.length-1] = child;
            children = n;

        }





    }

    public int countFamily(){return 0;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
