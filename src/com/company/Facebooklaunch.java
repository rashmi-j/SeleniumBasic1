package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklaunch {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        /*driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        String s = driver.getCurrentUrl();
        System.out.println(s);*/

        WebElement email =driver.findElement(By.id("email"));
        WebElement pass =driver.findElement(By.name("pass"));
        email.sendKeys("rashu2978@gmail.com");
        //driver.findElement(By.name("email")).clear();
        pass.sendKeys("abc", Keys.ENTER); /*instead of inspecting login button and adding clicking action
        Keys.enter will automatically add that functionality*/
        driver.quit();


    }
}
