package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class Profiledetailkartu {
    private Button keprofilebutton;

    public void gotoprofile(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("profile.fxml");
    }
}
