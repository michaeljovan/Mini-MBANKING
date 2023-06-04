package com.example.projectmbanking;

import java.util.ArrayList;
import java.util.List;

public class DataAkun {
    private static List<User> users = new ArrayList<>();

    public DataAkun() {
    }

    public void addUser(String username, String password,String pin, String noKartu, String cvv, String jenisKartu,String date,long saldo, String noRek) {
        User user = new User(username, password, pin, noKartu, cvv, jenisKartu,date, saldo, noRek);
        users.add(user);
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
