package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Profiledetailkartu implements Initializable {
    @FXML
    private Button keprofilebutton;
    @FXML
    private TextField nomorkartu;
    @FXML
    private TextField kodecvv;
    @FXML
    private TextField jeniskartu;
    @FXML
    private TextField date;
    @FXML
    private Label noRek;


    public void gotoprofile(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changescene("profile.fxml");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nomorkartu.setText(String.valueOf(Data.user.getNoKartu()));
        jeniskartu.setText(Data.user.getJenisKartu());
        kodecvv.setText(String.valueOf(Data.user.getCvv()));
        date.setText(Data.user.getDate());
        noRek.setText(Data.user.getNoRek());
    }
}
