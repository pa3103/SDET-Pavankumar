package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Date {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://BrowserDriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver,20);
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		
		 driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("BOM");
		 driver.findElement(By.xpath("//div[contains(text(),'BOM')]")).click();
		 
		 driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("DEL");
		 driver.findElement(By.xpath("//div[contains(text(),'DEL')]")).click();
		 
		 driver.findElement(By.xpath("//label[@for='departure']")).click();
		   

	}

}
