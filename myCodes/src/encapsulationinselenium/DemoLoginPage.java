package encapsulationinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoLoginPage {
	private WebElement untbx, pwdtbx, loginbtn;
	DemoLoginPage(WebDriver driver){
		untbx = driver.findElement(By.id("username"));
		pwdtbx = driver.findElement(By.name("pwd"));
		loginbtn = driver.findElement(By.xpath("//div[text() = 'Login ']"));
	}
	public void login(String un, String pwd) {
		untbx.sendKeys("admin");
		pwdtbx.sendKeys("manager");
		loginbtn.click();
	}
}
