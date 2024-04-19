package az.edu.turing.MyApps.HappyFamilyProjectNew;

import java.util.List;
import java.util.Set;

public interface FamilyDaoNew {
        List<Family> getAllFamilies();
        Family getFamilyByIndex(int id);
        boolean deleteFamily(int id);
        boolean deleteFamily(Family family);
        void  saveFamily(Family family);
        List<Family> getFamiliesBiggerThan(int numberOfPeople);
        List<Family> getFamiliesLessThan(int numberOfPeople);
        int countFamiliesWithMemberNumber(int numberOfPeople);
        Family createNewFamily(Human mother, Human father);
        Family bornChild(Family family, String name, String gender);
        Family adoptChild(Family family, Human child);
        void deleteAllChildrenOlderThan(int age);
        int count();
        Set<Pet> getPets(int familyIndex);
        void addPet(int familyIndex,Pet pet);


}
