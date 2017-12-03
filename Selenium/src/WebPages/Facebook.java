package WebPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/"); //
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Tiya");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Singhania");
		WebElement mobile = driver.findElement(By.xpath(".//*[@id='u_0_l']"));
		mobile.sendKeys("8329537587");
		WebElement pwd = driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("selenuim@12");
		/*driver.findElement(
				By.linkText("Why do I need to provide my date of birth?"))
				.click();
		WebElement btn1 = driver
				.findElement(By
						.className("_42ft _42fu layerCancel uiOverlayButton selected _42g- _5f0v"));
		Thread.sleep(10000);
		btn1.click();
		*/
		Select s1 = new Select(driver.findElement(By.id("day")));
		s1.selectByValue("23");
		Select s2 = new Select(driver.findElement(By.name("birthday_month")));
		s2.selectByIndex(4);
		Select s3 = new Select(driver.findElement(By.name("birthday_year")));
		s3.selectByValue("1994");
		WebElement gender = driver.findElement(By
				.xpath(".//*[@id='u_0_w']/span[1]/label"));
		gender.click();
		WebElement btn = driver.findElement(By.xpath(".//*[@id='u_0_y']"));
		btn.click();

	}

}
