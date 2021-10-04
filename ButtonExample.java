package com.selenium;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Users\\\\Crystal Balloon\\\\eclipse-workspace\\\\Selenium Project\\\\Driver\\\\chromedriver.exe");
				
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//2. Finding the color of the button.
        WebElement colourButton=driver.findElement(By.id("color"));
        String color= colourButton.getCssValue("background-color");
        System.out.println("Button Color is :"+color );
        
        //3.Finding the size of the button
        WebElement sizeButton=driver.findElement(By.id("size"));
        int height= sizeButton.getSize().getHeight();
        int width= sizeButton.getSize().getWidth();
        System.out.println("Height of the button is :"  + height   + "Width of the button is :" + width );

        //4.Clicking the Home Button
        WebElement clickHome=driver.findElement(By.id("home"));
        clickHome.click();
        
        
	}

}
 