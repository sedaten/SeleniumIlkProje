package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kaan\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");

        String sayfaTitleg = webDriver.getTitle();

        System.out.println(sayfaTitleg);
        webDriver.get("http://youtube.com");

        String sayfaTitley = webDriver.getTitle();

        String sayfaUrly = webDriver.getCurrentUrl();

        System.out.println(sayfaTitley);
        System.out.println(sayfaUrly);

        webDriver.navigate().back();
        String sayfaUrlg = webDriver.getCurrentUrl();
        System.out.println(sayfaUrlg);

        webDriver.quit();




    }


}
