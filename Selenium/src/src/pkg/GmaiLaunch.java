//package src.pkg;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class GmaiLaunch {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		Thread.sleep(15000);//implicit wait java 
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit wait by selenium because used driver
//    
//		driver.findElement(By.id("Identifir Id")).sendKeys("12");
//		String actual=driver.findElement(By.id("")).getText();
//		String expected="";
//		if(actual.equals(expected)){
//			System.out.println("Pass");
//		}
//				
//		else{
//			System.out.println("fail");
//		}
//		driver.quit();
//	}
//
//public static WebElement waitforit(WebElement element){
//	WebDriverWait wait=new Webd
//}
//
//	}
//
//
