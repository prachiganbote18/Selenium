package WebPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		Select sel = new Select(driver.findElement(By
				.xpath("//*[@id='searchDropdownBox']"))); // select class use for drop down
		 // getoption use to print all values in dropdown
		for(WebElement el:sel.getOptions()){
			System.out.println(el.getText()); 
		}
		sel.selectByVisibleText("Baby"); // selectByvisible is for to get particular value from drop down
        WebElement btn=driver.findElement(By.className("nav-input"));
        btn.click();
	}
}