package hands.on.selenium_4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetElementLocationAndSize {

	@Test
	public void example1() throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://selenium.dev/documentation/en/");

		driver.manage().window().maximize();

		WebElement headerText = driver.findElement(By.id("the-selenium-browser-automation-project"));

		System.out.println("Height is " + headerText.getRect().getDimension().getHeight());

		System.out.println("Width is " + headerText.getRect().getDimension().getWidth());

		System.out.println("Location X is " + headerText.getRect().getX());

		System.out.println("Location Y is " + headerText.getRect().getY());

		driver.quit();

	}

}
