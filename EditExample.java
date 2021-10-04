package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
	"C:\\\\Users\\\\Crystal Balloon\\\\eclipse-workspace\\\\Selenium Project\\\\Driver\\\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();		
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement Emailbox=driver.findElement(By.id("email"));
		Emailbox.sendKeys("gowthamrajasekar19@gmail.com");
		
		WebElement appendBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
        appendBox.sendKeys("Text");
        
        WebElement GetTextBox=driver.findElement(By.name("username"));
		String value= GetTextBox.getAttribute("value");
		
		System.out.println(value);
		
		WebElement ClearTextBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		ClearTextBox.clear(); 
		
		WebElement DisabledBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled= DisabledBox.isEnabled();
		
		System.out.println(enabled);
		
	}

}
