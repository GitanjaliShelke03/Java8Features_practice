package com.demo.lambda;

public class Demo {
public static void main(String[] args) {
	
/*	Test t = ()->{
		return "Hello";
	};
	System.out.println(t.getName().toUpperCase());
*/
	
//	Test x = (s1,s2)->{
//		return (s1+s2);
//	};
//	String t=x.getName("Gitanjali ", "Shelke");
//	System.out.println(t.toLowerCase());


	/*Test t = (s1,s2)->{
		return s1.equals(s2);
	};
	boolean x= t.getName("Git", "git");
	
	System.out.println(x);
	*/
	
	
	
	
	Test t = (int[]arr)->
	{ 
		int sum =0;
		
		for(int x :arr)
		{
//			if(x%2==0) 
//			System.out.println(x);
			sum = sum +x;
		}
		System.out.println("sum :"+sum);
	};
	int[] nums = {1,2,3,4};
	t.takeNumbers(nums);
	
}
}
