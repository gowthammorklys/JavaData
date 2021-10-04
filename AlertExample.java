package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
                System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Crystal Balloon\\\\eclipse-workspace\\\\Selenium Project\\\\Driver\\\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("http://www.leafground.com/pages/Alert.html");

				WebElement AlertBox=driver.findElement(By.
						xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
				AlertBox.click();
				Alert alert =driver.switchTo().alert();
				Thread.sleep(2000);
				alert.accept();
				
				WebElement ConfirmBox=driver.findElement(By.
						xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
				ConfirmBox.click();
				Alert confirmalert =driver.switchTo().alert();
				Thread.sleep(2000);
				confirmalert.dismiss();
				
				WebElement PromptBox=driver.findElement(By.
						xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
				PromptBox.click();
				Alert promptAlert =driver.switchTo().alert();
				promptAlert.sendKeys("Hello World");
				Thread.sleep(2000);
				promptAlert.accept();
	}

}
