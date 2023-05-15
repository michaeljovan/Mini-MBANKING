package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Mtransfer {
    @FXML
    private Button backbutton;
    @FXML
    private Button transferantarbankbutton;
    @FXML
    private Button transferantarrekeningbutton;
    @FXML
    private Button dtantarbankbutton;
    @FXML
    private Button dtantarrekeningbutton;



    public void gotohome(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("homepage.fxml");
    }

    public void gototransferantarbank(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("transferantarbank.fxml");
    }

    public void gototransferantarrekening(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("transferantarrekening.fxml");
    }

    public void gotodtantarbank(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("daftartransferantarbank.fxml");
    }

    public void gotodtantarrekening(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("daftartransferantarrekening.fxml");
    }


}
