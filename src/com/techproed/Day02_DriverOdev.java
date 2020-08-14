package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {

    // driver'ımızı ekranı kaplayacak şekilde kullanalım.
    // 1 - ilk önce google.com'a gidelim.
    // 2 - sayfanın title'ını alalım ve ekrana yazdıralım.
    // 3 - daha sonra youtube.com'a gidelim.
    // 4 - sayfanın title'ını ve url'ini alalım ekrana yazdıralım.
    // 5 - google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
    // 6 - driver'ımızı kapatalım.

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Burak\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver =new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");
        String pageTitle = webDriver.getTitle();
        System.out.println(pageTitle);

        webDriver.navigate().to("http://youtube.com");
        String pageUrl = webDriver.getCurrentUrl();
        System.out.println(pageTitle);
        System.out.println(pageUrl);

        webDriver.navigate().back();
        System.out.println(pageUrl);

        webDriver.quit();
    }
}
