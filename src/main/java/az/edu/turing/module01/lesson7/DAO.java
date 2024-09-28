package az.edu.turing.module01.lesson7;

import java.util.List;

public interface DAO <T> {
    T get(int id);

    List<T> getAll();

    void save (T t);

    void update(T t, String [] params);

    void delete (T t);
}
