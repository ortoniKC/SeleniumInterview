package day4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class NotFinfBY {
	
	public NotFinfBY() {
//		Pa
	}
	
	String name = "chatterjee";
//	@FindBy(xpath = name)
	private WebElement ele;
	void getLoginBtb(){
		ChromeDriver driver = null;
		String name = "chatterjee";
		driver.findElementByXPath("//div[text()='welcome "+name+"']");
		
	}

}
