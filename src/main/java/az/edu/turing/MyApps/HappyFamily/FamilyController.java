package az.edu.turing.MyApps.HappyFamily;

import java.util.List;
import java.util.Set;

public class FamilyController {
    final FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }


    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int numberOfPeople) {
        return familyService.getFamiliesBiggerThan(numberOfPeople);
    }

    public List<Family> getFamiliesLessThan(int numberOfPeople) {
        return familyService.getFamiliesLessThan(numberOfPeople);
    }

    public int countFamiliesWithMemberNumber(int numberOfPeople) {
        return familyService.countFamiliesWithMemberNumber(numberOfPeople);
    }

    public Family createNewFamily(Human mother, Human father) {
        return familyService.createNewFamily(mother, father);
    }



    public Family bornChild(Family family, String name, String gender) {
        return familyService.bornChild(family, name, gender);
    }

    public Family adoptChild(Family family, Human child) {
        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyService.deleteAllChildrenOlderThan(age);
    }

    public int count() {
        return familyService.count();
    }



    public Set<Pet> getPets(int familyIndex) {
        return familyService.getPets(familyIndex);
    }

    public void addPet(int familyIndex, Pet pet) {
        familyService.addPet(familyIndex, pet);

    }

}
