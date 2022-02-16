// 1) acending order sorting using Strem api 

package com.te.demo.stremapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AscOrder {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		list.add("rahman");
		list.add("ani");
		list.add("yuvan");
		list.add("sam cs");
		list.add("yuvan");
		
		// sort the 	name in ascending order
		List<String> ref= list.stream().sorted().collect(Collectors.toList());
		System.out.println(ref);  //[ani, rahman, sam cs, yuvan]
		
		System.out.println("========================================");
		
		
		// by using skip it will skip the data and remaining data will be print
		list.stream().skip(1).forEach(System.out :: println); //ani
		                                                      //yuvan
                                                              //sam cs
		System.out.println("========================================");
		

		// to remove duplicates by using distinct method
		list.stream().distinct().forEach(System.out :: println); //rahman
		       													 //ani
																 //yuvan
																 //sam cs
		System.out.println("========================================");
		
		
		// for each sorting
		for (String string : ref) {
			System.out.println(string);
		}
		System.out.println("========================================");
		
		
		
		// this filter used to fetch the desired strings
		list.stream().filter(a-> a.startsWith("a")).forEach(System.out :: println);  //ani
		System.out.println("========================================");
		
		
		//by using anymatch it will check if the given string is any one of the string there or not in object if its there print true else false 
		System.out.println(list.stream().anyMatch(a->a.contentEquals("rahman")));  //true
		System.out.println("========================================");
		
		
		//by using allmatch it will check the object and all the data members should be same exist true else false 
				System.out.println(list.stream().allMatch(a->a.contentEquals("rahman")));  //false
				System.out.println("========================================");
				
		
		

		
	}
}
