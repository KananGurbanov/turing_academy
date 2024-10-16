package az.edu.turing.module1.lesson11project.dao;

import java.util.Objects;

public final class Student {
    private final String pin;

    private final String password;

    private final double grade;

    private final int age;

    private int studentId;

    public Student(String pin, String password, double grade, int age, int studentId) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(grade, student.grade) == 0 && age == student.age && Objects.equals(pin, student.pin) && Objects.equals(password, student.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pin, password, grade, age);
    }

    @Override
    public String toString() {
        return "{" +
                " pin=" + pin +
                " , password=" + password +
                " , grade=" + grade +
                " , age=" + age +
                " , studentId=" + studentId +
                " }";
    }
}
