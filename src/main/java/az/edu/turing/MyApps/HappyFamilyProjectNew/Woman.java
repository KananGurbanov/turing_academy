package az.edu.turing.MyApps.HappyFamilyProjectNew;

import java.text.ParseException;
import java.util.Map;
import java.util.Random;

public final class Woman extends Human{

    public Woman(String name, String surname, long year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, String birthDate, int iq) throws ParseException {
        super(name, surname, birthDate, iq);
    }

    public Woman(String name, String surname, long year, int iq, Map<DayofWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public Woman(String name, String surname, long year, Family family) {
        super(name, surname, year, family);
    }

    public Woman(String name, String surname, Family family) {
        super(name, surname, family);
    }

    public Woman() {
    }

    public void makeUp(){}

    public Human bornChild(){
        int probability = new Random().nextInt(2);
        if(probability == 0){
            return new Man();
        }
        return new Woman();


    }
}
