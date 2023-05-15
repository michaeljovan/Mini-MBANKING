package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Daftartransferantarbank {
    @FXML
    private Button kemtransferbutton;

    public void gotomtransfer(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("mtransfer.fxml");
    }
}
