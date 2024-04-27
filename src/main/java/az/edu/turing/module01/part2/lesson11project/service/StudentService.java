package az.edu.turing.module01.part2.lesson11project.service;

import az.edu.turing.module01.part2.lesson11project.dao.Student;
import az.edu.turing.module01.part2.lesson11project.dto.StudentDTO;

public interface StudentService {

    StudentDTO createStudent(StudentDTO studentDTO);

}
