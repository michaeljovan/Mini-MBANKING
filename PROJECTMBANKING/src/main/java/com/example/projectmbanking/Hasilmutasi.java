package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Hasilmutasi {
    @FXML
    private Button keminfobutton;

    public void gotominfo(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("minfo.fxml");
    }
}
