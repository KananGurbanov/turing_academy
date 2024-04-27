package az.edu.turing.module01.part2.lesson11project.service;

import az.edu.turing.module01.part2.lesson11project.dao.Student;
import az.edu.turing.module01.part2.lesson11project.dao.StudentDAO;
import az.edu.turing.module01.part2.lesson11project.dto.StudentDTO;
import az.edu.turing.module01.part2.lesson11project.exception.DuplicateEntryException;
import az.edu.turing.module01.part2.lesson11project.exception.StudentException;

import java.util.Random;

public class StudentServiceImpl1 implements StudentService{
    public StudentDAO studentDAO;

    public StudentServiceImpl1(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO) {


        Student student = new Student(studentDTO.getPin(),
                studentDTO.getPassword(),
                studentDTO.getGrade(),
                studentDTO.getAge(),
                (int) (Math.random() * 1000000));

        if(studentDAO.existsByPin(student)){
            throw new DuplicateEntryException("Pin is duplicate!");
        }
        if(studentDAO.existsByPassword(student)){
            throw new DuplicateEntryException("Password is duplicate!");
        }
        if(studentDAO.existsByStudentID(student)){
            throw new DuplicateEntryException("StudentID is duplicate!");
        }
        Student savedStudent = studentDAO.save(student);

        return new StudentDTO(savedStudent.getPin(),
                savedStudent.getPassword(),
                savedStudent.getGrade(),
                savedStudent.getAge(),
                savedStudent.getStudentId());
    }

}
