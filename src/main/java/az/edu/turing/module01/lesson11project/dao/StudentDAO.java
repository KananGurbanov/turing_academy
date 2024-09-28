package az.edu.turing.module01.lesson11project.dao;

public abstract class StudentDAO implements DAO<Student>{
    public boolean existsByPin(Student given){
        for(Student i : getAll()){
            if(given.getPin().equals(i.getPin())){
                return true;
            }
        }

        return false;
    }

    public boolean existsByPassword(Student given){

        for(Student i : getAll()){
            if(given.getPassword().equals(i.getPassword())){
                return true;
            }
        }

        return false;


    }

    public boolean existsByStudentID(Student given){
        for(Student i : getAll()){
            if(given.getStudentId() == (i.getStudentId())){
                return true;
            }
        }

        return false;
    }

}
