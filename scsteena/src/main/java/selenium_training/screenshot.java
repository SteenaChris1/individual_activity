package selenium_training;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	public static void main(String[] args) throws InterruptedException, IOException{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\steenac//chromedriver.exe");
	WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
Thread.sleep(200);
driver.get("https://www.google.com");
File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileHandler.copy(scrFile, new File("screenshot.png"));
}
}
