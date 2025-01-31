package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginPage {
	@FindBy(id = "username")
	private WebElement unTbx;
	@FindBy(name = "pwd")
	private WebElement pwdTbx;
	@FindBy(xpath = "//div[text() = 'Login ']")
	private WebElement loginBtn;
	DemoLoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void login(String un, String pwd) {
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);
		loginBtn.click();
	}
}
