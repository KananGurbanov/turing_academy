package az.edu.turing.MyApps.HappyFamilyProjectNew;

import java.util.Random;

public class Woman extends Human{
    public void makeUp(){}

    public Human bornChild(){
        int probability = new Random().nextInt(2);
        if(probability == 0){
            return new Man();
        }


        return new Woman();


    }
}
