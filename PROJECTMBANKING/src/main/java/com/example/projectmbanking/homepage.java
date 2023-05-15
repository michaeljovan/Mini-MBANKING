package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class homepage {
    @FXML
    private Button logoutbutton;
    @FXML
    private Button minfobutton;
    @FXML
    private Button mpaymentbutton;
    @FXML
    private Button mtransferbutton;
    @FXML
    private Button profilebutton;
    @FXML
    private Button pinbutton;

    public void userlogout(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changescene("main.fxml");
    }

    public void gotominfo(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changescene("minfo.fxml");
    }

    public void gotompayment(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changescene("mpayment.fxml");
    }

    public void gotomtransfer(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changescene("mtransfer.fxml");
    }

    public void gotopin(ActionEvent event) throws IOException {
        Main m = new Main();
        Data.afterpin = "profil";
        m.changescene("pincontrol.fxml");
    }
}
