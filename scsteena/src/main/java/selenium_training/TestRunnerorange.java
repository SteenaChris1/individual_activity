package selenium_training;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class TestRunnerorange {
	

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\steenac\\eclipse-workspace-selenium\\scsteena\\src\\main\\java\\selenium_training\\indivial_activity.feature"
			,glue={"StepdefinitionOrangehrm"}
			)
	public class RunClass 
	{
		
	}


}
