package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Mpayment {
    @FXML
    private Button backbutton;
    @FXML
    private Button mpaymentbpjsbutton;
    @FXML
    private Button mpaymentkartukreditbutton;
    @FXML
    private Button mpaymentinternet;
    @FXML
    private Button mpaymentpublikutilitas;


    public void gotohome(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changescene("homepage.fxml");
    }

    public void gotompaymentbpjs(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changescene("mpaymentbpjs.fxml");
    }

    public void gotompaymentkartukredit(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changescene("mpaymentkartukredit.fxml");
    }

    public void gotompaymentinternet(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changescene("mpaymentinternet.fxml");
    }

    public void gotompaymentpublikutilitas(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changescene("mpaymentpublikutilitas.fxml");
    }


}
