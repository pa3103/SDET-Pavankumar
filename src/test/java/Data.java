package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Data {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C://BrowserDriver//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		Properties p = new Properties();
		p.load(new FileInputStream("C:\\Users\\User\\eclipse-workspace\\JavaDemo\\src\\Selenium\\Data.properties"));

		driver.get(p.getProperty("url"));

		driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(p.getProperty("password"));
		Thread.sleep(3000);
		driver.close();

	}

}
