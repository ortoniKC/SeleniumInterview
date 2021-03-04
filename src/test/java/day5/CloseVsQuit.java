package day5;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
