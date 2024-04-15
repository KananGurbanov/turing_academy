package az.edu.turing.MyApps.HappyFamilyProjectNew;

import az.edu.turing.module01.part2.lesson7.User;

import java.util.ArrayList;
import java.util.List;

public class FamilyDAO implements DAO<Family> {

    List<Family> families;

    public FamilyDAO() {
        families = new ArrayList<>();
    }

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
        if(index>=families.size()){
            return false;
        }
        else{
            families.remove(index);
            return true;

        }


    }

    @Override
    public boolean deleteFamily(Family family) {
        for(int i = 0;i<families.size();i++){
            if (family == families.get(i)){
                families.remove(family);
                return true;
            }
        }

        return false;
    }

    @Override
    public void saveFamily(Family family) {
        families.add(family);
    }
}
