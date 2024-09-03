/**
 * Author: Rahul Ganeshwar Patil
 * Date: September 03, 2024
 * 
 * Problem Description:
 * [This Program helps to print characters based on their frequency]
 */


import java.util.Scanner;
public class StringExpander {
	static void verify(String str) {
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("No integer Found to catch frequency");
		}
		else{
			func(str);
		}
	}	
    static void func(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                i++;
                int frequency = 0;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    frequency = frequency*10+(str.charAt(i) - '0'); 
                    i++;
                }
                i--;
                for (int k = 0; k < frequency; k++) {
                    result.append(currentChar);
                }
            }
        }
        System.out.println("The result of the given input is: ");
        System.out.println(result.toString());
    }
	public static void main(String[] args) {
    	Constant constant = new Constant();
        Scanner input = new Scanner(System.in);
//        int cases;
//        System.out.println(constant.ENTER_NUMBER);
//        int number = sc.nextInt();
        int count=3;
        while(count>0) {
        	System.out.println(constant.ENTER_STRING);
        	String str = input.nextLine();
        	if(str.length()>100){
        		System.out.println(constant.OUT_OF_BOUND_ERROR);
        	}
        	else
        	{
        		verify(str);
        		count--;
        	}      
        }

        input.close(); 
        }
}