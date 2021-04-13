package Selenium;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VtigerTC1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "‪C://BrowserDriver//chromedriver.exe");
		
		//random class//
		Random r=new Random();
		int num = r.nextInt(1000);
		String orgname="orgABC"+num;
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9844302");

		Select industry = new Select(driver.findElement(By.xpath("//select[@name='industry']")));
		industry.selectByValue("Banking");

		Select rating = new Select(driver.findElement(By.xpath("//select[@name='rating']")));
		rating.selectByValue("Active");

		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();

	}

}
