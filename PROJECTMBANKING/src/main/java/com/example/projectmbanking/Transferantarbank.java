package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Transferantarbank {
    @FXML
    private Button kemtransferbutton;
    @FXML
    private Button pinokbutton;

    public void gotopin(ActionEvent event) throws IOException {
        Main m = new Main();
        Data.afterpin = "transferantarbank";
        m.changescene("pincontrol.fxml");
    }
    public void gotomtransfer(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("mtransfer.fxml");
    }
}
