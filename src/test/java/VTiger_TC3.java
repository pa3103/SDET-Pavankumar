package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VTiger_TC3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "‪C://BrowserDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();

		Select Fname = new Select(driver.findElement(By.xpath("//select[@name='salutationtype']")));
		Fname.selectByValue("Mr.");

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("saanvi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("BT");

		String winhandlebefore = driver.getWindowHandle();

		driver.findElement(By.xpath("(//img[@alt='Select'])[1]")).click();

		for (String winhandle : driver.getWindowHandles()) {
			driver.switchTo().window(winhandle);
		}
		driver.findElement(By.xpath("//a[@id='3']")).click();

		driver.switchTo().window(winhandlebefore);
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9844305");
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();

	}

}
