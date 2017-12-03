package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		driver.manage().window().maximize();
		Select selectone=new Select(driver.findElement(By.className("input-xlarge")));
		selectone.selectByVisibleText("Europe");
        Thread.sleep(5000);
        selectone.selectByIndex(4);
        Thread.sleep(5000);
        for(WebElement el:selectone.getOptions()){
        	System.out.println(el.getText());
        	Thread.sleep(10000);
        	driver.quit();
        }
	}

}
