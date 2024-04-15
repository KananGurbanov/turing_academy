package az.edu.turing.MyApps.HappyFamilyProjectNew;

import java.util.List;

public interface DAO <T> {
    List<T> getAllFamilies();

    T getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    boolean deleteFamily(T t);

    void saveFamily(T t);
}
