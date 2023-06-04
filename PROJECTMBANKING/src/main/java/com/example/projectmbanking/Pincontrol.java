package com.example.projectmbanking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Pincontrol {
    @FXML
    private Button pinbackbutton;
    @FXML
    private Button pinokbutton;
    @FXML
    private TextField cekpin;
    @FXML
    private Label pinsalah;

    public void pinback(ActionEvent event) throws IOException {
        Main m = new Main();
        if (Data.afterpin.equals("mpaymentbpjs")){
            m.changescene("mpaymentbpjs.fxml");
        } else if (Data.afterpin.equals("mpaymentinternet")) {
            m.changescene("mpaymentinternet.fxml");
        }else if (Data.afterpin.equals("mpaymentkartukredit")){
            m.changescene("mpaymentkartukredit.fxml");
        } else if (Data.afterpin.equals("mpaymentpublikutilitas")) {
            m.changescene("mpaymentpublikutilitas.fxml");
        } else if (Data.afterpin.equals("profil")) {
            m.changescene("homepage.fxml");
        } else if (Data.afterpin.equals("minfomutasi")) {
            m.changescene("minfomutasi.fxml");
        } else if (Data.afterpin.equals("ceksaldo")) {
            m.changescene("minfo.fxml");
        }else if (Data.afterpin.equals("transferantarbank")){
            m.changescene("mtransfer.fxml");
        }else if (Data.afterpin.equals("transferantarrekening")){
            m.changescene("mtransfer.fxml");
        }
    }

    public void pinok(ActionEvent event) throws IOException{
        Main m = new Main();
        if(Data.user.getPin().equals(cekpin.getText()))
            if (Data.afterpin.equals("profil")){
                m. changescene("profile.fxml");
            }  else if (Data.afterpin.equals("ceksaldo")) {
                m.changescene("ceksaldo.fxml");
            } else if (Data.afterpin.equals("minfomutasi")) {
                m.changescene("hasilmutasi.fxml");
            } else if (Data.afterpin.equals("mpaymentbpjs")) {
                m.changescene("mpaymentberhasil.fxml");
            }else if (Data.afterpin.equals("mpaymentinternet")) {
                m.changescene("mpaymentberhasil.fxml");
            }else if (Data.afterpin.equals("mpaymentpublikutilitas")) {
                m.changescene("mpaymentberhasil.fxml");
            }else if (Data.afterpin.equals("mpaymentkartukredit")) {
                m.changescene("mpaymentberhasil.fxml");
            }else if (Data.afterpin.equals("mpaymentkartukredi")) {
                m.changescene("mpaymentberhasil.fxml");
            }else if (Data.afterpin.equals("transferantarbank")) {
                m.changescene("transferberhasil.fxml");
            }else if (Data.afterpin.equals("transferantarrekening")) {
                m.changescene("transferberhasil.fxml");
            }
            else if (cekpin.getText().isEmpty()){
                pinsalah.setText("Masukkan pin anda");
            } else {
                pinsalah.setText("PIN ANDA SALAH!");
            }
        }
    }

