package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_forgottenpwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com");
driver.findElement(By.linkText("Forgotten account?")).click();
driver.findElement(By.xpath(".//*[@id='identify_email']")).sendKeys("prachi.ganbote@yahoo.com");
driver.findElement(By.name("did_submit")).click();

//driver.findElement(By.xpath(".//*[@id='identify_yourself_flow']/div/div[3]/div/div[1]/a/span")).click();

	}

}
