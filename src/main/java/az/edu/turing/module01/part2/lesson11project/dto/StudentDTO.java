package az.edu.turing.module01.part2.lesson11project.dto;

import az.edu.turing.module01.part2.lesson11project.dao.Student;

import java.util.Objects;

public class StudentDTO {

    private final String pin;

    private final String password;

    private final double grade;

    private final int age;

    private int studentId;

    public StudentDTO(String pin, String password, double grade, int age) {
        this.pin = pin;
        this.password = password;
        this.grade = grade;
        this.age = age;
    }

    public StudentDTO(String pin, String password, double grade, int age, int studentId) {
        this.pin = pin;
        this.password = password;
        this.grade = grade;
        this.age = age;
        this.studentId = studentId;
    }

    public String getPin() {
        return pin;
    }

    public String getPassword() {
        return password;
    }

    public double getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "StudentDTO{" +
                "pin='" + pin + '\'' +
                ", password='" + password + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                ", studentId=" + studentId +
                '}';
    }


}
