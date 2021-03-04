package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class FindMAX {
	
	public static void main(String[] args) {
		Integer arr[] = {28, 15, 1, 0, 89, 89, -122, 100};	
		
		// way 3
		Integer max2 = Collections.max(Arrays.asList(arr));
		System.out.println(max2);
		
/*		// way 1
//		Arrays.sort(arr);
//		System.out.println("MAX: "+ arr[arr.length -1]);
*/		
		// way 2
		
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
