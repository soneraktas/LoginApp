package com.soner.loginapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private Label sonuc;

    @FXML
    private TextField kullaniciAdi;

    @FXML
    private PasswordField passwd;

    @FXML
    void girisYap(ActionEvent event) {
        System.out.println("girisYap butonuna basıldı");

        if (kullaniciAdi.getText().equals("soner") && passwd.getText().equals("123") ){
            sonuc.setTextFill(Color.GREEN);
            sonuc.setText("Kullanıcı ismi ve şifre doğru");
        }else {
            sonuc.setText("Kullanıcı ismi veya şifreniz yanlış");
            sonuc.setTextFill(Color.RED);
        }

    }//end girisYap

}//end class
