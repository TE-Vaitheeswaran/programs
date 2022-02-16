//reverse the string 

package com.te.demo.string;

public class ReverseString_1 {

	public static void main(String[] args) {

		String str = "This is babavoss the great warrior";
		char[] ch = str.toCharArray();
		String result = "";
		for (int i = 0; i < ch.length; i++) {
			String word = "";	
			while (i < ch.length && ch[i] != ' ') {
//	type1			word = ch[i]+word; //ans=roirraw taerg eht ssovabab si sihT 

// type2            word = word + ch[i]; //ans =warrior great the babavoss is This
					
//	type3		    word = ch[i] + word;// sihT si ssovabab eht taerg roirraw

				i++;
			}
//	type1			result = word +" "+ result; //ans=roirraw taerg eht ssovabab si sihT 

// type2			result = word +" " +result; //ans =warrior great the babavoss is This 

// 	type3			result = result +" " +word;// sihT si ssovabab eht taerg roirraw

		}
		System.out.println(result);
	}
}
