package az.edu.turing.module1.lesson7;

import java.util.ArrayList;
import java.util.List;

public class UserDAO implements DAO<User>{
    private List<User> users;

    public UserDAO() {
        users = new ArrayList<>();
    }

    @Override
    public User get(int id) {

        for(int i = 0;i<users.size();i++){
            if (id == users.get(i).getId()){
                return users.get(i);
            }
        }

        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(User user, String[] params) {


    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }


}
