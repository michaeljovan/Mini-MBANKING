package com.example.projectmbanking;

public class User {
    private String username;
    private String password;
    private String pin;
    private String noKartu;
    private String cvv;
    private String jenisKartu;
    private String date;
    private long saldo;
    private String noRek;


    public User(String username, String password,String pin, String noKartu, String cvv, String jenisKartu, String date,long saldo, String noRek) {
        this.username = username;
        this.password = password;
        this.pin  = pin;
        this.noKartu = noKartu;
        this.cvv = cvv;
        this.jenisKartu = jenisKartu;
        this.date = date;
        this.saldo = saldo;
        this.noRek = noRek;

    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getPin(){
        return pin;
    }
    public String getNoKartu(){
        return noKartu;
    }
    public String getCvv(){
        return cvv;
    }
    public String getJenisKartu(){
        return jenisKartu;
    }
    public String getDate(){
        return date;
    }
    public long getSaldo(){
        return saldo;
    }
    public String getNoRek(){
        return noRek;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void SetPin(String pin) {
        this.pin = pin;
    }
    public void SetNoKartu(String noKartu) {
        this.noKartu = noKartu;
    }
    public void SetCvv(String cvv) {
        this.cvv = cvv;
    }
    public void setJenisKartu(String jenisKartu) {
        this.jenisKartu = jenisKartu;
    }
}


