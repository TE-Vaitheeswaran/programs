package com.te.demo.lamdafunction;

public class LambdaFuncTest  {

	public static void main(String[] args) {
		LambdaFunc ref= (a) -> {
			for (int i = 0; i < a; i++) {
				System.out.println("hello world");
			}
			
		};
		
		ref.name(5);
	}
}
