package az.edu.turing.MyApps.HappyFamily;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionsFamilyDAO implements FamilyDAO{
    List<Family> families = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return families.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        if(index <= getAllFamilies().size() && index >= 0){
            getAllFamilies().remove(index);
            return true;
        }

        return false;

    }



    @Override
    public boolean deleteFamily(Family f) {
        if(getAllFamilies().contains(f)){
            getAllFamilies().remove(f);
            return true;
        }

        return false;
    }

    @Override
    public void saveFamily(Family f) {
        getAllFamilies().add(f);
    }

    @Override
    public List<Family> getFamiliesBiggerThan(int numberOfPeople) {
        List<Family> f = new ArrayList<>();

        for(Family family : getAllFamilies()){
            if(family.countFamily() > numberOfPeople){
                f.add(family);
            }
        }
        return f;
    }

    @Override
    public List<Family> getFamiliesLessThan(int numberOfPeople) {
        List<Family> f = new ArrayList<>();

        for(Family family : getAllFamilies()){
            if(family.countFamily() < numberOfPeople){
                f.add(family);
            }
        }
        return f;
    }

    @Override
    public int countFamiliesWithMemberNumber(int numberOfPeople) {
        int count = 0;

        for( Family f : getAllFamilies()){
            if(f.countFamily() == numberOfPeople){
                count++;
            }
        }

        return count;
    }

    @Override
    public Family createNewFamily(Human mother, Human father) {
        Family f = createNewFamily(mother, father);
        saveFamily(f);
        return f;
    }

    @Override
    public Family bornChild(Family family, String name, String gender) {
        if("woman".equalsIgnoreCase(gender)){
            family.addChild(new Woman(name,family.getFather().getSurname()+"a",family));
        }
        else if("man".equalsIgnoreCase(gender)){
            family.addChild(new Man(name, family.getFather().getSurname(),family));
        }

        return family;
    }

    @Override
    public Family adoptChild(Family family, Human child) {
        family.addChild(child);
        return family;
    }

    @Override
    public void deleteAllChildrenOlderThan(int age) {
        for(Family f : getAllFamilies()){
            for(Human child : f.getChildren()){
                if(child.getYear() > age){
                    f.getChildren().remove(child);
                }
            }
        }
    }

    @Override
    public int count() {
        return getAllFamilies().size();
    }

    @Override
    public Set<Pet> getPets(int familyIndex) {
        return getAllFamilies().get(familyIndex).getPets();
    }

    @Override
    public void addPet(int familyIndex, Pet pet) {
        getAllFamilies().get(familyIndex).getPets().add(pet);
    }
}
