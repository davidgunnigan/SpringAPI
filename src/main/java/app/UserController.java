package app;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class UserController {

    ///temporary database
    private Set<User> db;
    private int nextUserId;

    public UserController() {
        db = new HashSet<>();
        nextUserId = 1;
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable("userId") int id) {
        return getUserFromDb(id);
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.PUT)
    public User updateUser(@PathVariable("userId") int id,
                           @RequestParam("firstName") String firstName) {
        User user = getUserFromDb(id);
        user.setFirstName(firstName);
        return user;
    }

    public User getUserFromDb(int id) {
        for (User user : db) {

            if (user.getId() == id) {
                return user;
            }
        }
        throw new IllegalArgumentException("Not found");
    }

    @RequestMapping(value="/user",method = RequestMethod.POST)
    public User createUser(@RequestBody CreateUserRequest createUserRequest) {
        User user = new User(nextUserId++, createUserRequest.getFirstName(), createUserRequest.getLastName());
        db.add(user);
        return user;
    }

    @RequestMapping(value="/user/{userId}" ,method = RequestMethod.DELETE)
    public User deleteUser(@PathVariable("userId") int id) {
        User user = getUserFromDb(id);
        db.remove(user);
        return user;
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public Set<User> allUsersInDb(){
        Set<User> users = new HashSet<>();
        for (User user : db) {
            users.add(user);
        }
        return users;
    }
}