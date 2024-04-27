package az.edu.turing.MyApps.HappyFamily;

import java.util.List;
import java.util.Set;

public interface FamilyDAO {

    List<Family> getAllFamilies();

    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family f);

    void saveFamily(Family f);

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
