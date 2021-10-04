package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Crystal Balloon\\\\eclipse-workspace\\\\Selenium Project\\\\Driver\\\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("http://www.leafground.com/pages/radio.html");

				WebElement Below20=driver.findElement(By.
						xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
	            Below20.click();
	}

}
