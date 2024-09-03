/**
 * Author: Rahul Ganeshwar Patil
 * Date: September 03, 2024
 * 
 * Problem Description:
 * [This Program helps to print frequency based on their character occurence]
 */
import java.util.Scanner;
public class CharacterFrequency {
    public static void main(String[] args){
    	Constant constant = new Constant();
        Scanner input = new Scanner(System.in);
        
        System.out.println(constant.ENTER_STRING);
        String str = input.nextLine();
        result(str.toLowerCase());
        input.close();
    }
    static void result(String str) {
    	StringBuilder result = new StringBuilder();
        if(str.length()>1000){
            System.out.println("Enter String under 100 characters");
        }
        int frequency=1;
        for(int i=0;i<str.length();i=i+frequency){ 
            frequency=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    frequency++;
                }
                else{
                    break;
                }
            }
            result.append(str.charAt(i));
            result.append(frequency);
        }
        System.out.println("The Output of the input is: ");
        System.out.println(result);
    }
}