package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select sel = new Select(fruits);
		List<WebElement> options = sel.getOptions();
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}
		driver.quit();
		
		
		
		
		
		
		
	}

}
