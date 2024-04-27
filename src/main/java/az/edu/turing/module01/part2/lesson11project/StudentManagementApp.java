package az.edu.turing.module01.part2.lesson11project;

import az.edu.turing.module01.part2.lesson11project.controller.StudentController;
import az.edu.turing.module01.part2.lesson11project.dao.StudentDAO;
import az.edu.turing.module01.part2.lesson11project.dao.StudentDAOInFile;
import az.edu.turing.module01.part2.lesson11project.dao.StudentDAOInMemory;
import az.edu.turing.module01.part2.lesson11project.dto.StudentDTO;
import az.edu.turing.module01.part2.lesson11project.service.StudentService;
import az.edu.turing.module01.part2.lesson11project.service.StudentServiceImpl1;

public class StudentManagementApp {
    public static void main(String[] args) {
        StudentDAO dao =
                //new StudentDAOInMemory();
                new StudentDAOInFile();

        StudentService studentService =
                new StudentServiceImpl1(dao);

        StudentController studentController =
                new StudentController(studentService);

        StudentDTO studentDTO = studentController.createStudent(new StudentDTO("1234567","kenan123",100,19));

        StudentDTO studentDTO1 = studentController.createStudent(new StudentDTO("1245567", "xanim123", 100, 19));

        //System.out.println(dao.getAll());

    }
}
