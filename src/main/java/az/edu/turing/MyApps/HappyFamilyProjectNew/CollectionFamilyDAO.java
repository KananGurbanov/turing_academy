package az.edu.turing.MyApps.HappyFamilyProjectNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class CollectionFamilyDAO implements FamilyDAO {
    List<Family> families;

    public CollectionFamilyDAO() {
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
        if(index>=families.size() || index < 0){
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

    @Override
    public void displayAllFamilies() {
        for (int i = 0; i < families.size(); i++){
            System.out.println("Father : " + families.get(i).getFather());
            System.out.println("Mother : " + families.get(i).getMother());
            System.out.println("Children : " + families.get(i).getChildren());
            System.out.println("---------------------------------------------");
        }
    }

    @Override
    public void getFamiliesBiggerThan(int number) {
        for (int i = 0; i < families.size(); i++){
            if(families.get(i).countFamily() > number){
                System.out.println(families.get(i));
            }
        }
    }

    @Override
    public void getFamiliesLessThan(int num) {
        for (int i = 0; i < families.size(); i++){
            if(families.get(i).countFamily() > num){
                System.out.println(families.get(i));
            }
        }
    }

    @Override
    public int countFamiliesWithMemberNumber(int num) {
        int count = 0;
        for (Family f: families){
            if(f.countFamily() == num){
                count++;
            }
        }

        return count;
    }



    @Override
    public void createNewFamily(Man f, Woman m) {
        families.add(new Family(f,m));
    }

    @Override
    public Family bornChild(Family f, String sex) {
        if("masculine".equalsIgnoreCase(sex)){
            System.out.println("It is a boy give a name:");
            String name = new Scanner(System.in).next();
            Man m = new Man(name, f.getFather().getSurname(),f);
            f.getChildren().add(m);
        }
        else if("feminine".equalsIgnoreCase(sex)){
            System.out.println("It is a girl give a name:");
            String name = new Scanner(System.in).next();
            Woman w = new Woman(name, f.getFather().getSurname() +"a" , f);
            f.getChildren().add(w);
        }

        return f;
    }
}
