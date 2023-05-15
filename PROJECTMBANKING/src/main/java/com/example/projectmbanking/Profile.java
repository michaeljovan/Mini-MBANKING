package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Profile {
    @FXML
    private Button backbutton;
    @FXML
    private Button lihatkartubutton;
    @FXML
    private Button aturlimitbutton;
    @FXML
    private Button gantipasswordbutton;


    public void gotohome(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("homepage.fxml");
    }

    public void gotolihatkartu(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("profiledetailkartu.fxml");
    }

    public void gotoaturlimit(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("profilaturlimit.fxml");
    }

    public void gotogantipassword(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("profilegantipassword.fxml");
    }
}
