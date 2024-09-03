/**
 * Author: Rahul Ganeshwar Patil
 * Date: September 03, 2024
 * 
 * Problem Description:
 * [This Program helps to Check whether the given number is prime or not]
 */
import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
    	Constant constant = new Constant();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<3;i++){
        	System.out.println(constant.ENTER_NUMBER);
            int number = input.nextInt();
            verify(number);
        }
        input.close();
    }
    static void verify(int number) {
    	if(number<0) {
    		System.out.println("Enter Valid number.");
    	}
    	else {
    		primeNumber(number);
    	}
    }
    static void primeNumber(int number) {
    	int flag =0;
        if(number==0 || number==1){
            System.out.println(number+" is not a prime number");
        }
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                System.out.println(number+" is not a prime number");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(number+" is a prime number");
        }
    }
}
