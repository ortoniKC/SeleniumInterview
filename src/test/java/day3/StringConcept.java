package day3;

public class StringConcept {
	
	public static void main(String[] args) {
		
		String s1 = "Letcode";
		String s2 = new String("letcode");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		// what is the output
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		

		s1 = s2;
		System.out.println(System.identityHashCode(s1));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
