package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Transferberhasil {
    @FXML
    private Button backbutton;

    public void gotohome(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("homepage.fxml");
    }
}
