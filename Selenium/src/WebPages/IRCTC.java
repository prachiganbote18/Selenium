package WebPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class IRCTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver=new FirefoxDriver();
   driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
   driver.findElement(By.linkText("Sign up")).click();
   driver.findElement(By.xpath(".//*[@id='userRegistrationForm:userName']")).sendKeys("DhanuKapoor123");
   driver.findElement(By.linkText("Check Availability")).click();
   driver.findElement(By.id("userRegistrationForm:password")).sendKeys("Selenium@123");
   driver.findElement(By.name("userRegistrationForm:confpasword")).sendKeys("Selenium@123");
   Select sel=new Select(driver.findElement(By.xpath(".//*[@id='userRegistrationForm:securityQ']")));
   sel.selectByIndex(4);
   driver.findElement(By.id("userRegistrationForm:securityAnswer")).sendKeys("Amir Khan");
   Select sel1=new Select(driver.findElement(By.name("userRegistrationForm:prelan")));
   sel1.selectByIndex(1);
   driver.findElement(By.id("userRegistrationForm:firstName")).sendKeys("Rahi123");;
   driver.findElement(By.name("userRegistrationForm:middleName")).sendKeys("Geetesh");
   driver.findElement(By.id("userRegistrationForm:lastName")).sendKeys("Kapoor");
   driver.findElement(By.xpath(".//*[@id='userRegistrationForm:gender']/tbody/tr/td[2]")).click();
   driver.findElement(By.xpath(".//*[@id='userRegistrationForm:maritalStatus']/tbody/tr/td[2]/label")).click();
   /*Select s3=new Select(driver.findElement(By.id("userRegistrationForm:dobDay")));
   s3.	*/
   
   
   }

}
