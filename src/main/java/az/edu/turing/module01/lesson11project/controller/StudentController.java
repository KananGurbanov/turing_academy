package az.edu.turing.module01.lesson11project.controller;

import az.edu.turing.module01.lesson11project.dto.StudentDTO;
import az.edu.turing.module01.lesson11project.exception.StudentException;
import az.edu.turing.module01.lesson11project.service.StudentService;

public class StudentController {
    public StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public StudentDTO createStudent(StudentDTO studentDTO){
        if(studentDTO.getPin() == null || studentDTO.getPin().length() != 7){
            throw new StudentException("Pin is not valid!");
        }

        if(studentDTO.getAge()<16){
            throw new StudentException("Above 16 are allowed!");
        }

        if(studentDTO.getGrade()<=0 || studentDTO.getGrade()>100){
            throw new StudentException("Illegal number!");
        }

        return studentService.createStudent(studentDTO);
    }
}
