package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://BrowserDriver//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> li = driver.findElements(By.xpath("//table[@class='data-list']//tr/td[1]"));
		
		for(WebElement lang:li)
		{
			String language = lang.getText();
			System.out.println(language);
			if (language.equalsIgnoreCase("Python"))
			{
				WebElement ver = driver.findElement(By.xpath("//table[@class='data-list']//td[text()='Python']/following-sibling::td[1]"));
				System.out.println("version :"+ver.getText());
			}
		}
		
		
		
		

	}

}
