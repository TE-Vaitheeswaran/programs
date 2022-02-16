package com.te.demo.compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmpTest {
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setName("raju");
		
		Employee emp2=new Employee();
		emp2.setId(2);
		emp2.setName("ramu");
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		
		Comparator<Employee> ref= (a,b) -> {
			return a.getId()-b.getId();
		};
		Collections.sort(list, ref);
		//System.out.println(list);
		
		Iterator<Employee> itr =list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next() );
		}
	}

}
