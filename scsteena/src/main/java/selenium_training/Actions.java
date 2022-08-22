package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Actions{

   public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver","chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
        Actions acc = new Actions();
        WebElement txtUsername = driver.findElement(By.name("q"));
        Action seriesOfActions = acc.moveToElement(txtUsername)
            .click()
            .keyDown(txtUsername, Keys.SHIFT)
            .sendKeys(txtUsername, "hello")
            .keyUp(txtUsername, Keys.SHIFT)
            .doubleClick(txtUsername)
            .contextClick()
            .build();
            
        seriesOfActions.perform() ;



   }



}