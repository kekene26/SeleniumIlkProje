package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    // ilk once google.com a gidiniz
    //2. oradan youtuba gidiniz
    // 3. google.com a back metodu ile geri gidiniz
    //4.youtube.com a geri gidiniz
    //5. youtube.com u yenileyiniz

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Burak\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://google.com");

        webDriver.navigate().to("http://youtube.com");

        webDriver.navigate().back();

        webDriver.navigate().forward();

        webDriver.navigate().refresh();
    }
}
