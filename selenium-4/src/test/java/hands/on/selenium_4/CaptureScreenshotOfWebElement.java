package hands.on.selenium_4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshotOfWebElement {
	
	@Test
	public void example1() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium.dev/documentation/en/");
		
		driver.manage().window().maximize();
		
		WebElement headerText = driver.findElement(By.id("the-selenium-browser-automation-project"));
		
		File source = headerText.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("logo.png");
		
		FileUtils.copyFile(source, destination);
		
		driver.quit();
		
	}

}
