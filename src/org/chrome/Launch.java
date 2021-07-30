package org.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\chromeLaunch\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("arjundeva555@gmail.com");
		WebElement txtPass = driver.findElement(By.name("pass"));
		txtPass.sendKeys("123456789");
		driver.manage().window().maximize();
		WebElement createNew = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createNew.click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Arjunan");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Mahadevan");
		WebElement eMail = driver.findElement(By.name("reg_email__"));
		eMail.sendKeys("arjundeva12@gmail.com");
		WebElement reMail = driver.findElement(By.name("reg_email_confirmation__"));
		reMail.sendKeys("arjundeva12@gmail.com");
		WebElement crtPass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		crtPass.sendKeys("123456789");
		WebElement birDate = driver.findElement(By.name("birthday_day"));
		birDate.sendKeys("23");
		WebElement month  = driver.findElement(By.name("birthday_month"));
		month.sendKeys("04");
		WebElement year = driver.findElement(By.name("birthday_year"));
		year.sendKeys("1994");
		WebElement gender = driver.findElement(By.xpath("//label[@class='_58mt']"));
	    gender.click();




		
		
		
		
		
	}

}
