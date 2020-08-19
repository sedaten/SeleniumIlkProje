package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kaan\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://facebook.com");
        webDriver.manage().window().maximize();
        String face = webDriver.getTitle();
         if(face.equals("facebook")){
             System.out.println("Dogru");
         }else{
             System.out.println("Yanlis");
         }
        System.out.println("Actual Title"+face);

         String face1 = webDriver.getCurrentUrl();
        if(face1.contains("facebook")){
            System.out.println("Iceriyor");
        }else{
            System.out.println("icermiyor");
        }
        System.out.println(face1);

        webDriver.navigate().to("https://www.walmart.com/");

        String wal = webDriver.getTitle();

        if(wal.contains("walmart.com")){
            System.out.println("Iceriyor");
        }else {
            System.out.println("icermiyor");
        }
        webDriver.navigate().back();
        webDriver.navigate().refresh();

        webDriver.close();
        
    }


}
