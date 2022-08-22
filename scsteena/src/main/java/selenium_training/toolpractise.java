package selenium_training;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolpractise {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\steenac//chromedriver.exe");

//Creating an object 
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(200);
driver.get("https://demoqa.com/automation-practice-form");
Thread.sleep(200);
driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("CHRIS");
Thread.sleep(500);
driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("KOOKIE");
Thread.sleep(500);
driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("KOOKIE@gmail.com");
Thread.sleep(500);
driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
Thread.sleep(500);
driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("1234567890");
Thread.sleep(500);	

	}


}
