package com.soner.loginapp;

public class DortBasamakliSayiBulucu {
    int tahminEdilecekSayi=9876;

    public DortBasamakliSayiBulucu() {
        System.out.println("com.soner.loginapp.DortBasamakliSayiBulucu sınıfının yapılandırıcısı çalıştı");
    }// end constracter

    void sayiUret(){
        int birlerBasamagi = (int) (Math.floor(Math.random()*10));

        int onlarBasamagi = (int) (Math.floor(Math.random()*10));
        while (onlarBasamagi==birlerBasamagi){
            onlarBasamagi = (int) (Math.floor(Math.random()*10));
        }//end while

        int yuzlerBasamagi = (int) (Math.floor(Math.random()*10));
        while ( (yuzlerBasamagi==onlarBasamagi) || (yuzlerBasamagi==birlerBasamagi) ){
            yuzlerBasamagi = (int) (Math.floor(Math.random()*10));
        }//end while

        int binlerBasamagi = (int) (Math.floor(Math.random()*10));
        while ( (binlerBasamagi==yuzlerBasamagi) || (binlerBasamagi==onlarBasamagi) || (binlerBasamagi==birlerBasamagi) || (binlerBasamagi==0) ){
            binlerBasamagi = (int) (Math.floor(Math.random()*10));
        }//end while

        int dortBasamakliSayi=binlerBasamagi*1000+yuzlerBasamagi*100+onlarBasamagi*10+birlerBasamagi;
        this.tahminEdilecekSayi=dortBasamakliSayi;
    }//end sayiUret



}//end class
