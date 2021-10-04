package com.selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Users\\\\Crystal Balloon\\\\eclipse-workspace\\\\Selenium Project\\\\Driver\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement Dropdown1=driver.findElement(By.id("dropdown1"));
		Select select= new Select(Dropdown1);
		select.selectByIndex(2);
		select.selectByValue("3");
		select.selectByVisibleText("Selenium");
		
		List<WebElement> listofoptions = select.getOptions();
	    int size =	listofoptions.size();
		System.out.println("Number of Elements is :" + size );
		
		Dropdown1.sendKeys("UFT/QTP");
		
		WebElement multiSelect=driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		
		Select multiSelectBox= new Select(multiSelect);
		
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);
		multiSelectBox.selectByIndex(4);
		
	}

}
