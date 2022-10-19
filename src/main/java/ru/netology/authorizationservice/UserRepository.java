package ru.netology.authorizationservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    private Map<User, List<Authorities>> authorities;

    public UserRepository() {
        authorities = new HashMap<>();
        List<Authorities> userAthourities = new ArrayList<>();
        userAthourities.add(Authorities.DELETE);
        userAthourities.add(Authorities.WRITE);
        authorities.put(new User("test", "test"), userAthourities);
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        for (Map.Entry<User, List<Authorities>> element : authorities.entrySet()) {
            if (element.getKey().getName().equals(user) && element.getKey().getPassword().equals(password)) {
                return element.getValue();
            }
        }
        return null;
    }
}
