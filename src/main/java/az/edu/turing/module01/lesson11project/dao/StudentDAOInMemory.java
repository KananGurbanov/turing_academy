package az.edu.turing.module01.lesson11project.dao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StudentDAOInMemory extends StudentDAO{

    private static final Set<Student> STUDENTS = new HashSet();

    @Override
    public Student save(Student student) {
        STUDENTS.add(student);
        return student;
    }

    @Override
    public Collection<Student> getAll() {
        return STUDENTS;
    }
}
