package az.edu.turing.MyApps.HappyFamily;
import java.util.Map;
import java.util.Random;

public final class Woman extends Human {

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Woman(String name, String surname, int year, int iq, Map<DayofWeek, String> schedule, Family family) {
        super(name, surname, year, iq, schedule, family);
    }

    public Woman(String name, String surname, int year, Family family) {
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

    @Override
    public String toString() {
        return "{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", year=" + getYear() +
                ", iq=" + getIq() +
                ", schedule=" + getSchedule() +
                ", gender='woman'" +
                '}';
    }
}
