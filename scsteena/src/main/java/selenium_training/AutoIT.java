package selenium_training;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class AutoIT {
	

		  private static WebDriver driver = null;

		  public static void main(String[] args) throws IOException, InterruptedException {

		      driver = new FirefoxDriver();

		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		      driver.get("https://toolsqa.com/automation-practice-form");

		      driver.findElement(By.id("photo")).click();

		      Runtime.getRuntime().exec("D:\AutoIt\AutoItTest.exe");

		      Thread.sleep(5000);

		      driver.close();

		  }

		}

