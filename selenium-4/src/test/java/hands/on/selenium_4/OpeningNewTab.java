package hands.on.selenium_4;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpeningNewTab {

	@Test
	public void example1() throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://selenium.dev/documentation/en/");

		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://www.google.com");

		driver.quit();

	}

}
