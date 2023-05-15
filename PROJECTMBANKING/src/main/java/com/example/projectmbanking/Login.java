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

    }

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
        if (username.getText().toString().equals("") && password.getText().toString().equals("")) {
            wronglogin.setText("login berhasil");

            m.changescene("homepage.fxml");
        } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wronglogin.setText("Masukkan userid atau password anda");
        } else {
            wronglogin.setText("userid atau password salah");

        }
    }
}

