package az.edu.turing.module01.part2.lesson10.StudentApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentFileApp {

    static final String RESOURCE_FOLDER = "src/main/java/az/edu/turing/module01/part2/lesson10/StudentApplication/resource/";

    static List<Student> database = new ArrayList<>();


    public static void main(String[] args) {
        Student kanan = new Student("Kanan", 100);
        addStudent(kanan);



    }

    private static void addStudent(Student kanan) {
        database.add(kanan);
        File file1 = new File(RESOURCE_FOLDER + "database1.txt");


        try {
            FileWriter fw = new FileWriter(file1);
            fw.write(kanan + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            FileReader fr = new FileReader(file1);
            int c;
            StringBuilder sb = new StringBuilder();
            while((c = fr.read()) != -1){
                sb.append((char) c);
            }
            System.out.println(sb);
        }catch(FileNotFoundException f){
            System.out.println("File not found!");
            f.printStackTrace();
        }catch(IOException e){
            System.out.println("Were not able to read file!");
            e.printStackTrace();
        }



    }

    static final class Student{
        private static int MAX_ID = 0;
        private final int id;

        private final String name;

        private double grade;

        public Student(String name, double grade) {
            this.id = ++MAX_ID;
            this.name = name;
            this.grade = grade;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id && Double.compare(grade, student.grade) == 0 && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, grade);
        }

        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }
    }


}
