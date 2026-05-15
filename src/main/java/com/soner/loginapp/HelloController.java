package com.soner.loginapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import com.soner.loginapp.DortBasamakliSayiBulucu;

public class HelloController {

    DortBasamakliSayiBulucu dortBasamakliSayiBulucu = new DortBasamakliSayiBulucu();

    @FXML
    private Label sonuc;

    @FXML
    private TextField kullaniciAdi;

    @FXML
    private PasswordField passwd;

    @FXML
    public void initialize() {
        System.out.println("initialize metodu çalıştı ...");
        dortBasamakliSayiBulucu.sayiUret();
        System.out.println("olusan 4 basamaklı rakamları farklı sayı...:"+dortBasamakliSayiBulucu.tahminEdilecekSayi);
    }//end initialize

    @FXML
    void girisYap(ActionEvent event) {
        dortBasamakliSayiBulucu.sayiUret();
        System.out.println("olusan 4 basamaklı rakamları farklı sayı...:"+dortBasamakliSayiBulucu.tahminEdilecekSayi);

        if (kullaniciAdi.getText().equals("soner") && passwd.getText().equals("123") ){
            sonuc.setTextFill(Color.GREEN);
            sonuc.setText("Kullanıcı ismi ve şifre doğru");
        }else {
            sonuc.setText("Kullanıcı ismi veya şifreniz yanlış");
            sonuc.setTextFill(Color.RED);
        }//end else

    }//end girisYap

}//end class
