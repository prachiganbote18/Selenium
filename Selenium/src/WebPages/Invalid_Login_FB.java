package WebPages;

import org.openqa.selenium.By;

import CucumberTest.WebUtils;

public class Invalid_Login_FB {

	String fb_Username=".//*[@id='email']";
	String fb_Password=".//*[@id='pass']";
	String fb_Login_btn=".//*[@id='loginbutton']";
	String fb_err_msg=".//*[@id='globalContainer']/div[3]/div/div/div";
	
	public void Enter_username(){
		WebUtils.driver.findElement(By.xpath(fb_Username)).sendKeys("Username");
			
	}
	public void Enter_password(){
		WebUtils.driver.findElement(By.xpath(fb_Password)).sendKeys("1234");
	}
	
	public void Click_login(){
		WebUtils.driver.findElement(By.xpath(fb_Login_btn)).click();
	}
	
	public String Show_msg() {
		return WebUtils.driver.findElement(By.xpath(fb_err_msg)).getText();

	}
}

