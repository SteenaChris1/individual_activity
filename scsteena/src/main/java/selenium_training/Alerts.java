package selenium_training;
package selenium_training;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException, IOException{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\steenac//chromedriver.exe");
	WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
Thread.sleep(200);
driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.switchTo( ).alert( );
driver.switchTo().alert().accept();
}
}


