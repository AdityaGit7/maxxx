package encapsulationinselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutionClass {
	@Test
	public void demo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		DemoLoginPage d = new DemoLoginPage(driver);
		d.login("Virat", "Anushka"); 
		Thread.sleep(5000);
		d.login("admin", "manager");
	}

}
