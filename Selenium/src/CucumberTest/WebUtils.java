package CucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtils {
	public static WebDriver driver = new FirefoxDriver();

	public static void enterTextBox(String xpath, String value) {

		getElement(xpath).sendKeys(value);

	}

	private static WebElement getElement(String xpath) {
		// TODO Auto-generated method stub

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated((By.xpath(xpath))));

		return element;

	}

	public static void click(String xpath) {
		// TODO Auto-generated method stub
		getElement(xpath).click();
	}

}
