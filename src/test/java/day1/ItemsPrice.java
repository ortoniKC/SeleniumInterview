package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItemsPrice {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		// web table // xpath

		WebElement table = driver.findElementById("shopping");
		List<WebElement> rows = table.findElements(By.cssSelector("tbody tr"));
		int sum =0;
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			WebElement prices = cols.get(1);
			String text = prices.getText();
			System.out.println("with in loop "+ text);
			sum += Integer.parseInt(text);
		}
		System.out.println("Total "+sum);
		WebElement sumPrice = driver.findElementByXPath("//table[@id='shopping']/tfoot/td[2]");
		if(Integer.parseInt(sumPrice.getText()) == (sum)) {
			System.out.println("Pass");
		}else System.out.println("Fail");
		
		driver.quit();
	}

}
