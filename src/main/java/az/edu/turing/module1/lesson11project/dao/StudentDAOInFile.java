package az.edu.turing.module1.lesson11project.dao;

import java.io.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StudentDAOInFile extends StudentDAO{
    private static final String RESOURCE_PATH = "src/main/java/az/edu/turing/module01/part2/lesson11project/resource/";
    private static final String STUDENTS_FILE_PATH = RESOURCE_PATH.concat("students.txt");

    @Override
    public Student save(Student student) {

        File file1 = new File(STUDENTS_FILE_PATH);

        try(FileWriter fr = new FileWriter(file1);
            BufferedWriter bw = new BufferedWriter(fr);) {

            bw.write(student + "\n");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(BufferedReader br = new BufferedReader(new FileReader(file1));){
            String str = "";
            StringBuilder sb = new StringBuilder();
            while((str = br.readLine()) != null){
                sb.append(str);
            }
            System.out.println(sb);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return student;
    }

    @Override
    public Collection<Student> getAll() {
        Set<Student> students = new HashSet<>();
        File file = new File(STUDENTS_FILE_PATH);

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String str;
            while((str = br.readLine())!=null){
                String [] parts;
                parts = str.split(",");

                if (parts.length != 5) {
                    System.err.println("Invalid line format: " + str);
                    continue; // Skip processing this line
                }

                String pin  = parts[0].substring(parts[0].indexOf("=") + 1).trim();
                String password = parts[1].substring(parts[1].indexOf("=") + 1).trim();
                double grade = Double.parseDouble(parts[2].substring(parts[2].indexOf("=") + 1).trim());
                int age = Integer.parseInt(parts[3].substring(parts[3].indexOf("=") + 1).trim());
                int studentId = Integer.parseInt(parts[4].substring(parts[4].indexOf("=") + 1, parts[4].length() - 2).trim());

                students.add(new Student(pin, password, grade, age, studentId));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;


    }
}
