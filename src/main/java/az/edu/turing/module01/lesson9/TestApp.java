package az.edu.turing.module01.lesson9;

public class TestApp {
    public static void main(String[] args) {
        func("qebul");
    }

    public static void func(String str){
        if(str.equals("qebul")){
            System.out.println("Sifaris qebul olundu");
        }
        else if(str.equals("gelir")){
            System.out.println("Sifaris yoldadir");
        }
        else if (str.equals("catdirildi")){
            System.out.println("Sifaris catdirildi");
        } else if (str.equals("legv")) {
            System.out.println("Sifaris legv olundu");
        }

    }


}
