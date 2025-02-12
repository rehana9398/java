import java.util.Arrays;

import java.util.Collections;

public class Descendingorder {
	
	public static void main(String []args)
	{
		Integer a[]= {3,8,-9,7,5,8,-9,3,8};
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(a));
	}

}