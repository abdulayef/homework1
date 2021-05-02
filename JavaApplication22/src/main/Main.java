package main;

import users.Instructor;
import users.Student;
import users.User;
import util.UserManager;

public class Main {

    public static void main(String[] args) {
        User s1 = new Student();
        s1.firstName = "Mahammad";
        s1.lastName = "Abdullayev";
        User s2 = new Student();
        s2.firstName = "Ali";
        s2.lastName = "Valiyev";
        User t1 = new Instructor();
        t1.firstName = "Sarkhan";
        t1.lastName = "Rasullu";
        User t2 = new Instructor();
        t1.firstName = "Engin ";
        t1.lastName = "Demirog";

        UserManager u = new UserManager();
        u.add(s1);
        u.add(s2);
        u.add(t1);
        u.add(t2);
    }

}
