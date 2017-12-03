package WebPages;

import org.openqa.selenium.By;

import CucumberTest.WebUtils;

public class GmailLoginPage {
	// @FindBy(how=How.ID,using="identifierId")
	// WebElement TextUID;
	String Username = ".//*[@id='identifierId']";

	String Nxtbtn = "//content[@class='CwaK9']/span";
	String Pwd = ".//*[@id='password']/div[1]/div/div[1]/input";
	String Errmsg = ".//*[@id='password']/div[2]/div[2]";

	public void Enter_Username(String name) {

		WebUtils.enterTextBox(Username, name);

		// WebUtils.driver.findElement(By.xpath(Username)).sendKeys(name);

	}

	public void nxtclick() {

		WebUtils.click(Nxtbtn);
		// WebUtils.driver.findElement(By.xpath(Nxtbtn)).click();

	}

	public void Enter_Password(String password) {
		// WebUtils.driver.findElement(By.xpath(Pwd)).sendKeys(password);
		WebUtils.enterTextBox(Pwd, password);
	}

	public String Show_msg() {
		return WebUtils.driver.findElement(By.xpath(Errmsg)).getText();

	}

}
