package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Ceksaldo implements Initializable {
    @FXML
    private Button keminfo;
    @FXML
    private TextField ceksaldo;

    public void gotominfo(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("minfo.fxml");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ceksaldo.setText(String.valueOf(Data.user.getSaldo()));
    }
}
