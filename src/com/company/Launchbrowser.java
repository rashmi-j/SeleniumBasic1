package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchbrowser {

    public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/geckodriver 3");/*'./driver/chromedriver' is the path for chrome driver
	webdriver.chrome.driver is the way to set property for chrome browser*/
	WebDriver driver = new FirefoxDriver();

	//instead of 'WebDriver driver = new ChromeDriver();' we can say 'WebDriver driver = new ChromeDriver();' using webdriver we are generalising to use other browsers as well
        driver.manage().window().maximize(); //chaining methods
	driver.get("https:www.quintype.com"); //'driver.get' will wait for page to load
    //driver.navigate().to("https:www.google.com");
    System.out.println(driver.getTitle()); //get the current title of browser



    Thread.sleep(3000);
    //driver.quit(); // will close entire instance
    driver.close(); //it will close current tab
    }
}
