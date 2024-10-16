package az.edu.turing.module1.lesson5;

public class NewClass {
    int age;

    String name;

    public NewClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public <R,E> E get(R data){
        E e = (E) data;

        return e;
    }

    public static void main(String[] args) {
        NewClass n = new NewClass(23,"Umid");

        System.out.println(n.<Integer, String>get(n.age));


    }


}
