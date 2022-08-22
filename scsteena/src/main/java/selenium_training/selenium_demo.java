package selenium_training;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class selenium_demo {
public static void main(String[] args) throws InterruptedException{

//Setting system properties of ChromeDriver
System.setProperty("webdriver.chrome.driver", "C:\\Users\\steenac//chromedriver.exe");
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\steenac//geckodriver.exe");

//Creating an object 
WebDriver driver = new ChromeDriver();
//WebDriver driver = new FirefoxDriver();

driver.manage().window().maximize();
Thread.sleep(200);
driver.get("https://askomdch.com/");
Thread.sleep(200);
//driver.findElement(By.name("q")).sendKeys("BTS JUNGKOOK");
driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a")).click();
Thread.sleep(500); 
driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[5]/div[2]/a[2]")).click();
Thread.sleep(500); 
driver.findElement(By.xpath("//*[@id=\"ast-site-header-cart\"]/div[1]/a/div/span")).click();

driver.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
Thread.sleep(500);
WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"post-1220\\\"]/div/div/div/div/div[2]/div/div/a")));
driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("CHRIS");
Thread.sleep(500);
driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("KOOKIE");
Thread.sleep(500);
WebElement n = driver.findElement(By.xpath("//*[@id=\"billing_country_field\"]/span/span/span[1]/span"));
Select sl = new Select(n);
//option by value
sl.selectByValue("India");
Thread.sleep(500);
driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("tuticorin");
Thread.sleep(200);
WebElement s = driver.findElement(By.xpath("//*[@id=\"billing_state_field\"]/span/span/span[1]/span"));
Select s2 = new Select(s);
//option by value
s2.selectByValue("Tamil Nadu");
driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("628001");
Thread.sleep(200);
driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("jk@gmail.com");
Thread.sleep(200);
WebElement radio1 = driver.findElement(By.id("payment_method_cod"));
radio1.click();
Thread.sleep(200);
driver.findElement(By.name("button alt")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
driver.close();  
}
}