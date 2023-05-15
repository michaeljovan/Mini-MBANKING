package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Mpaymentpublikutilitas {
    @FXML
    private Button kempaymentbutton;
    @FXML
    private Button pinbutton;

    public void gotompayment(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("mpayment.fxml");
    }
    public void gotopin(ActionEvent event) throws IOException {
        Main m = new Main();
        Data.afterpin = "mpaymentpublikutilitas";
        m.changescene("pincontrol.fxml");
    }
}
