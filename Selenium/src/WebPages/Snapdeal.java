package WebPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.switchTo().alert().dismiss();
		
		WebElement SearchTx= driver.findElement(By.className("col-xs-20 searchformInput keyword"));
		SearchTx.sendKeys("Toys");
		WebElement btn=driver.findElement(By.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div/div[2]/button"));
		btn.click();
		driver.close();

	}

}
