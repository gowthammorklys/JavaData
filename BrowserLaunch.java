package com.selenium;

import java.text.BreakIterator;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Pause;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Crystal Balloon\\eclipse-workspace\\Selenium Project\\Driver\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		
		driver.findElement(By.xpath("//*[@id="sbtc"]/div/div[2]/input"));
		
		
		
		
	}
	
}
