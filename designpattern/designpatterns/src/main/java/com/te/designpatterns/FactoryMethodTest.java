package com.te.designpatterns;

import java.util.Scanner;

import com.te.designpatterns.creational.Factory;
import com.te.designpatterns.creational.FactoryClass;

public class FactoryMethodTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the type of factory");
	
		String choice = scanner.nextLine();
		Factory factory = FactoryClass.getFactoryObject(choice);
		
		factory.production();

	}
}
