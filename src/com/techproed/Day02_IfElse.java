package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\kaan\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.get("http://amazon.com");
        String sayfaBasligi = webDriver.getTitle();  //Car

        //  contains --> bir kelimenin, bir yazi icerisinde gecip gecmedigini kontrol ediyordu.

        if(sayfaBasligi.contains("Books")){
            System.out.println("Books kelimesi iceriyor."+sayfaBasligi);
        }else{
            System.out.println("Books kelimesi icermiyor :"+sayfaBasligi);

        }
        webDriver.quit();





        //if else
        //for each
        //



    }
}
