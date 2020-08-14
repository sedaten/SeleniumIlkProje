package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
    //Java projemize chromedriveri tanittik

        System.setProperty("webdriver.chrome.driver","C:\\Users\\kaan\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
//Selenium ile ilgili ilk kodumuz
        //webDriver nesnesi olusturarak, chrome driveri kullanilabilir hale getirdik.
        WebDriver webDriver = new ChromeDriver();
    //Drivera google.com agitmesini soyledik
        webDriver.get("http://www.google.com");
    //driverimiwebzda acik olan pencereyi kapatir.
      //  webDriver.close();
    //quit tum acik pencereleri kapatir
        //driverımı komple kapatıyor
       // webDriver.quit();


    }

}
