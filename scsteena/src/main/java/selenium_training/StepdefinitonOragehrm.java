package selenium_training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.core.gherkin.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefinitonOragehrm {
	
public void takesnaps(WebDriver webdriver,String filePath) throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot)webdriver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File des = new File(filePath);
		FileHandler.copy(src,des);

		
	}

	@Given("Launch the brower")
	public void launch_the_brower() {
		 WebDriver driver;
		    @BeforeTest
		    @Parameters("browser")
		    public void setup(String browser) throws Exception {
		//Check if parameter passed as 'chrome'
		        else if (browser.equalsIgnoreCase("chrome")) {
		//set path to chromedriver.exe
		            WebDriverManager.chromedriver().setup();
		            // System.setProperty("webdriver.chrome.driver","C:\Users\steenac\eclipse-workspace-selenium\scsteena\chromedriver.exe");
		            driver = new ChromeDriver();
		            //driver.manage().window().maximize();
		        }

		       else {
		//If no browser passed throw exception
		            throw new Exception("Browser is not correct");
		        }
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    }
		    driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	@When("Enter username")
	public void enter_the_username() {
		  WebElement uname = driver.findElement(By.id("txtUsername"));
	       uname.sendKeys("Admin");
	        Thread.sleep(2000);
	       boolean s= uname.isDisplayed();
	         System.out.println("The return value: " + s);
	    throw new io.cucumber.java.PendingException();
	}

	@And("Enter password")
	public void enter_the_admin123() {
		 WebElement passwd = driver.findElement(By.id("txtPassword"));
	       passwd.sendKeys("admin123");
	        boolean s1= passwd.isDisplayed();
	         System.out.println("The return value: " + s1);
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click Login button")
	public void click_login_button() {
		 WebElement submit = driver.findElement(By.className("button"));
	       submit.click();
	       takesnaps(driver,"C:\\Users\\steenac\\Desktop\\Eclipse\\screenshot.png");
	    throw new io.cucumber.java.PendingException();
	}
	@Given("Redirect to admin menu")
	public void Redirect_to_admin_menu() {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        Thread.sleep(2000);
	    throw new io.cucumber.java.PendingException();
	}
	@When("Click on add button")
	public void Click_on_add_button() {
		driver.findElement(By.cssSelector("#btnAdd")).click();
        Thread.sleep(2000);
	    throw new io.cucumber.java.PendingException();
	}
	@And ("Enter user role")
	public void Enter_user_role() {
		 Select userrole1 = new Select(driver.findElement(By.cssSelector("#systemUser_userType")));
         userrole1.selectByIndex(0);
	    throw new io.cucumber.java.PendingException();
	}
	@And("Enter employee name")
	public void Enter_employee_name() {
		WebElement employeename = driver.findElement(By.xpath(" //input[@id='systemUser_employeeName_empName']"));
        employeename.sendKeys("Steena Chris");
	    throw new io.cucumber.java.PendingException();
	}
	@And("Enter status")
	public void Enter_status() {
		Select Status = new Select(driver.findElement(By.cssSelector("#systemUser_status")));
        Status.selectByIndex(0);
	    throw new io.cucumber.java.PendingException();
	}
	
	@And("Enter username")
	public void Enter_username() {
		WebElement useraname = driver.findElement(By.name("systemUser[userName]"));
        useraname.sendKeys("steenac");
	    throw new io.cucumber.java.PendingException();
	}
	@And("Enter password ")
	public void Enter_password () {
		 WebElement password = driver.findElement(By.id("systemUser_password"));
         password.sendKeys("Password123");
	    throw new io.cucumber.java.PendingException();
	}
	@And("Enter confirm password ")
	public void Enter_confirm_password () {
		 WebElement confrimpasswrod = driver.findElement(By.id("systemUser_confirmPassword"));
         confrimpasswrod.sendKeys("Password123");
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Click on Save Button")
	public void click_on_save_button() {
	    WebElement save = driver.findElement(By.xpath(" //input[@id='btnSave']"));
        save.click();
        Thread.sleep(2000);
	    throw new io.cucumber.java.PendingException();
	}
	 @Given (" Search user")	
	 public void click_on_save_button() {
		 WebElement menulog=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
         menulog.click();
		    throw new io.cucumber.java.PendingException();
		}
	 @When("Enter admin name")
		public void Enter_admin_name() {
		 WebElement adminname = driver.findElement(By.id("searchSystemUser_userName"));
         adminname.sendKeys("Admin");
		    throw new io.cucumber.java.PendingException();
		}
	 @And("Enter  user role ")
		public void Enter_ user_role() {
		 Select userrole = new Select(driver.findElement(By.cssSelector(" #searchSystemUser_userType")));
         userrole.selectByIndex(1);
		    throw new io.cucumber.java.PendingException();
		}
	 @And("Enter  emp name ")
		public void Enter_emp_name() {
		 WebElement empname = driver.findElement(By.name("searchSystemUser[employeeName][empName]"));
         empname.sendKeys("Manoj c");
		    throw new io.cucumber.java.PendingException();
		}
	 
	 @And("Enter  the status ")
		public void Enter_the_status() {
		 Select Status1 = new Select(driver.findElement(By.cssSelector("#searchSystemUser_status")));
         Status1.selectByIndex(1);
		    throw new io.cucumber.java.PendingException();
		}
	 @Then("Click on search Button")
		public void click_on_search_button() {
		 driver.findElement(By.className("searchbutton")).click();
         Thread.sleep(2000);
		    throw new io.cucumber.java.PendingException();
		}
	 
	@Given("Redirect to pim menu")
	public void Redirect_to_pim_menu() {
		 driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click on the Add button")
	public void click_on_the_add_button() {
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
	    throw new io.cucumber.java.PendingException();
	}

	@And("Enter first name")
	public void enter_the_first_name() {
		driver.findElement(By.id("firstName")).sendKeys("Chris");
	    throw new io.cucumber.java.PendingException();
	}
  
	@And("Enter last name")
	public void enter_last_name() {
        driver.findElement(By.id("lastName")).sendKeys("Kookie");
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on save button  ")
	public void click_on_save_button() {
		 driver.findElement(By.xpath(" //input[@id='btnSave']")).click();
	        Thread.sleep(2000);
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Click on logout button  ")
	public void click_on_logout_button() {
		 driver.findElement(By.xpath(" //input[@id='btnSave']")).click();
	        Thread.sleep(2000);
	        WebElement logout = driver.findElement(By.xpath("//a[@id='welcome']" ));
	        logout.click();
	        WebElement logout1 = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
	        logout1.click();
	         driver.quit();
	    throw new io.cucumber.java.PendingException();
	}
}
