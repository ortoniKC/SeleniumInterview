package day6;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class FindLocators {
	static RemoteWebDriver driver;
	public static WebElement element(Locators locatorType, String value) {
		switch (locatorType) {
		case ID:
			return driver.findElementById(value);
		case XPATH:
			return driver.findElementByXPath(value);
		default:
			return null;
		}
	}
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		WebElement element = element(Locators.linkText, "fruits");
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}
		driver.quit();
		
	}
}
enum Locators {
	ID, XPATH, linkText, css, classname, name
}
