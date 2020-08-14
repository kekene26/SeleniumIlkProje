package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Burak\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("http://amazon.com");

        String amazonTitle = webDriver.getTitle(); //car

        if(amazonTitle.contains("Car")) {
            System.out.println("Car kelimesi geciyor");
        }else {
            System.out.println("Car kelimesi gecmiyor");
        }
        webDriver.quit();

    }
}
