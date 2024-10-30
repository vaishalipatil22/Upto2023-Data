package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationexercise.com/login");
		Thread.sleep(5);
		System.out.println(driver.findElement(By.id("header")).getText());
		System.out.println(driver.findElement(By.xpath("//h2[text()='New User Signup!']")).getText());
		
		
		driver.close();
	}

}
