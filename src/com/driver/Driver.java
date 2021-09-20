package com.driver;

import com.problems.easy.MonotonicArray;

public class Driver {
	
	public static void main(String[] args) {
		
		MonotonicArray call = new MonotonicArray();
		int [] nums = {1,3,2};
		
		System.out.println(call.isMonotonic(nums));
		
		boolean increasing = false;
		boolean decreasing = true;
		 System.out.println("Result: "+ (increasing || decreasing));
	}

}
