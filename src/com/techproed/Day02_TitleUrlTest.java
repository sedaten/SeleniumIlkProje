package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
        //youtuba git video iceriyormu bak kapat
public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kaan\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://youtube.com");

        String youtube = webDriver.getTitle();

        if(youtube.contains("Video")){
            System.out.println("video kelimesini iceriyor");
        }else{
            System.out.println("video kelimesini icermiyor");

            webDriver.quit();
        }

    }
}
