package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Login {
    public Login() {
        userDatabase = new DataAkun();
    }
    private DataAkun userDatabase;

    @FXML
    private Button loginbutton;
    @FXML
    private Label wronglogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void userlogin(ActionEvent event) throws IOException {
        checklogin();
    }

    private void checklogin() throws IOException {
        Main m = new Main();
        User user = userDatabase.getUserByUsername(username.getText());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        if (user != null && user.getPassword().equals(password.getText())) {
            System.out.println("Login successful.");
            Data.user = user;
            System.out.println(user);
            m.changescene("homepage.fxml");
        } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wronglogin.setText("Masukkan userid atau password anda");
        } else {
            wronglogin.setText("userid atau password salah");
        }
    }
}

