package az.edu.turing.MyApps.HappyFamilyProjectNew;

import java.util.List;

public interface FamilyDAO {
    List<Family> getAllFamilies();

    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(Family t);

    void saveFamily(Family t);

    void displayAllFamilies();

    void getFamiliesBiggerThan(int num);

    void getFamiliesLessThan(int num);

    int countFamiliesWithMemberNumber(int num);

    void createNewFamily(Man f, Woman m);

    Family bornChild(Family f, String sex);







}
