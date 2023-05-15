package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Minfomutasi {
    @FXML
    private Button keminfobutton;
    @FXML
    private Button pinbutton;

    public void gotopin(ActionEvent event) throws IOException {
        Main m = new Main();
        Data.afterpin = "minfomutasi";
        m.changescene("pincontrol.fxml");
    }

    public void gotominfo(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changescene("minfo.fxml");
    }
}
