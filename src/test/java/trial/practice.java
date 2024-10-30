package trial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	static WebDriver ldriver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ldriver = new ChromeDriver();
		ldriver.manage().window().maximize();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String url = "https://automationexercise.com/";
		ldriver.get(url);

		ldriver.findElement(By.xpath("//a[@href='/login']")).click();

	}

}
