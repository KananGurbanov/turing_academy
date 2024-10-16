package az.edu.turing.module1.lesson10.StudentApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentBufferedFileApp {

    static final String RESOURCE_FOLDER = "src/main/java/az/edu/turing/module01/part2/lesson10/StudentApplication/resource/";

    private static final List<Student> database = new ArrayList<>();

    public static void main(String[] args) {
        Student kanan2 = new Student("Kanan", 99);
        addStudent(kanan2);

    }

    private static void addStudent(Student kanan) {

        File file1 = new File(RESOURCE_FOLDER + "database2.txt");
        database.add(kanan);


        try {
            FileWriter fw = new FileWriter(file1);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(kanan + "\n");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            FileReader fr = new FileReader(file1);
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            StringBuilder sb = new StringBuilder();

            while((line = br.readLine()) != null){
                sb.append(line);
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

    private static final class Student{
        private static int MAX_ID = 0;
        private final int id;

        private final String name;

        private final double grade;

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
