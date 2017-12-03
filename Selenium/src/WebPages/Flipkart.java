package WebPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.How;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		WebElement searchTx=driver.findElement(By.name("q"));
		searchTx.sendKeys("mobile");//enter input value
		WebElement btn=driver.findElement(By.className("vh79eN"));
		btn.click();
		

	}

}
