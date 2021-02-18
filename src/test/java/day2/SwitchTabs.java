package day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTabs {
	
	public static void main1(String[] args) throws FileNotFoundException {
		FileInputStream fs = new FileInputStream("");
		
	}
	public static void main2(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://letcode.in/windows");
		driver.findElement(By.id("home1")).click();
		System.out.println("Windows: "+driver.getTitle());
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> myWin = new ArrayList<String>(windowHandles);
		driver.switchTo().window(myWin.get(1));
		System.out.println("Home: "+driver.getTitle());
		driver.quit();
	}

}
