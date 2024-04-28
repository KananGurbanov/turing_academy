package az.edu.turing.MyApps.HappyFamily;

import az.edu.turing.MyApps.HappyFamily.Exceptions.FamilyOverFlowException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsFamilyDAO implements FamilyDAO{

    private static final String RESOURCE = "src/main/java/az/edu/turing/MyApps/HappyFamily/RESOURCE/";

    private static final String DATABASE = RESOURCE + "database.txt";

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
        return getAllFamilies().stream().filter(x->x.countFamily()>numberOfPeople).collect(Collectors.toList());
    }

    @Override
    public List<Family> getFamiliesLessThan(int numberOfPeople) {
        return getAllFamilies().stream().filter(x->x.countFamily() < numberOfPeople).collect(Collectors.toList());
    }

    @Override
    public int countFamiliesWithMemberNumber(int numberOfPeople) {
        return (int) getAllFamilies().stream().filter(x->x.countFamily() == numberOfPeople).count();
    }

    @Override
    public Family createNewFamily(Human mother, Human father) {

        Family f = new Family((Man) father, (Woman) mother);
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
        if(family.countFamily() >= 5){
            throw new FamilyOverFlowException("Family size exceeded!");
        }
        family.addChild(child);
        return family;
    }

    @Override
    public void deleteAllChildrenOlderThan(int age) {
        getAllFamilies().stream().forEach(x->x.getChildren().removeIf(child->child.getBirthYear() > age));
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

    @Override
    public void loadData(List<Family> families) {
        File file = new File(DATABASE);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DATABASE));){

            getAllFamilies().forEach(x-> {
                String string = x.toString();
                try {
                    bw.write(string+"\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (BufferedReader br = new BufferedReader(new FileReader(DATABASE));){

            String s = "";
            StringBuilder sb = new StringBuilder();
            while((s = br.readLine())!=null){
                sb.append(s+"\n");
            }
            System.out.println(sb);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
