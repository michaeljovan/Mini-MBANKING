package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Minfo {
    @FXML
    private Button backbutton;
    @FXML
    private Button mutasibutton;
    @FXML
    private Button ceksaldobutton;
    @FXML
    private  Button pinbutton;

    public void gotohome(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("homepage.fxml");
    }

    public void gotomutasirekening(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("minfomutasi.fxml");
    }


    public void gotopin(ActionEvent event) throws IOException {
        Main m = new Main();
        Data.afterpin = "ceksaldo";
        m.changescene("pincontrol.fxml");
    }

}
