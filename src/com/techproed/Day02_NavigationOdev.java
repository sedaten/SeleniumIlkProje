package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    //google a git ordan youtuba git tekrar google youtuba git forvard metodyla youtubeyi yenile refresc ile
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kaan\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://google.com");

        webDriver.get("http://youtube.com");

        webDriver.navigate().back();

        webDriver.navigate().forward();

        webDriver.navigate().refresh();

        webDriver.quit();
    }

}

