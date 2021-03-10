package day6;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		Object title = driver.executeScript("return document.title");
		System.out.println(title);

	}

}
