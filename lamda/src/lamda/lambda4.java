package lamda;

import java.util.function.Predicate;
import java.util.*;

class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class lambda4 {
    public static void main(String args[]) {
        Predicate<User> p = u -> u.username.equals("jai") && u.password.equals("tf123");
        System.out.println("Enter the username and password");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String username = sc.next();
        System.out.println("Enter the password: ");
        String password = sc.next();
        User user = new User(username, password);
        if (p.test(user)) {
            System.out.println("Welcome to TF");
        } else {
            System.out.println("Recheck");
        }
    }
}

