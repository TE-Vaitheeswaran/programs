package com.te.demo.stremapi;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(25);
		list.add(20);
		
		// by using filter we print or filter the desired data's
		 list.stream().filter(a->a%2==0).forEach(System.out ::println);
		 
	}
}
