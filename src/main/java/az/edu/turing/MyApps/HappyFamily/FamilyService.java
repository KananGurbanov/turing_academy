package az.edu.turing.MyApps.HappyFamily;

import java.util.List;
import java.util.Set;

public class FamilyService {
    final FamilyDAO familyDAO;

    public FamilyService(FamilyDAO familyDAO) {
        this.familyDAO = familyDAO;
    }

    void displayAllFamilies(){
//        int i = 0;
//        for (Family f : familyDAO.getAllFamilies()){
//            System.out.println("Family " + (++i) + " :");
//            System.out.println("Mother : " + f.getMother());
//            System.out.println("Father : " + f.getFather());
//            System.out.println("Children :");
//            for(Human child : f.getChildren()){
//                if(child instanceof Man){
//                    child = (Man) child;
//                    System.out.println(child);
//                }
//            }
//        }
        familyDAO.getAllFamilies().forEach(System.out::println);
    }

    List<Family> getFamiliesBiggerThan(int numberOfPeople){
        return familyDAO.getFamiliesBiggerThan(numberOfPeople);
    }

    List<Family> getFamiliesLessThan(int numberOfPeople){
        return familyDAO.getFamiliesLessThan(numberOfPeople);
    }

    int countFamiliesWithMemberNumber(int numberOfPeople){
        return familyDAO.countFamiliesWithMemberNumber(numberOfPeople);
    }

    Family createNewFamily(Human mother, Human father){
        return familyDAO.createNewFamily(mother, father);
    }

    Family bornChild(Family family, String name, String gender){
        return familyDAO.bornChild(family, name, gender);
    }

    Family adoptChild(Family family, Human child) {
        return familyDAO.adoptChild(family, child);
    }

    void deleteAllChildrenOlderThan(int age) {
        familyDAO.deleteAllChildrenOlderThan(age);
    }

    int count() {
        return familyDAO.count();
    }

    Set<Pet> getPets(int familyIndex) {
        return familyDAO.getPets(familyIndex);
    }

    void addPet(int familyIndex, Pet pet) {
        familyDAO.addPet(familyIndex, pet);
    }
}
