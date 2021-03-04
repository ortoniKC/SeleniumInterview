package day5;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Guess {
	@BeforeSuite
	void before() {
		System.out.println("3. suite");
	}
	
	static {
		System.out.println("1. static");
	}
	
	public Guess() {
		System.out.println("2. constructor");
	}
	
	@Test
	void myTest() {
		System.out.println("4. test");
	}
	

}
