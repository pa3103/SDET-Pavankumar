package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://BrowserDriver//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Seleni");
		Thread.sleep(3000);
		List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(ele1.size());
		for (WebElement b : ele1) {
			System.out.println(b.getText());
		}

		driver.close();
	}

}