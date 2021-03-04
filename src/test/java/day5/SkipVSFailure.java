package day5;

import org.testng.annotations.Test;

public class SkipVSFailure {
	@Test
	void eat(){
		System.out.println("eating");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = "eat")
	void sleep(){
		System.out.println("sleeping");
	}

}
