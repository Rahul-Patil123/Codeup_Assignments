/**
 * Author: Rahul Ganeshwar Patil
 * Date: September 03, 2024
 * 
 * Problem Description:
 * [This Program helps to convert any given positive number to word]
 */

import java.util.Scanner;

public class NumberWordConverter {
    private static final String[] singleDigits = { 
        "", "One", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven", "Eight ", "Nine " 
    };

    private static final String[] teensDoubleDigits = {
        "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ",
        "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen " 
    };

    private static final String[] tens = {
        "", "", "Twenty ", "Thirty", "Forty ", "Fifty ",
        "Sixty ", "Seventy ", "Eighty ", "Ninety " 
    };
    
    private static String convertToWords(int number) {
        if (number == 0) {
            return "";
        } else if (number < 10) {
            return singleDigits[number] + " ";
        } else if (number < 20) {
            return teensDoubleDigits[number - 10] + " ";
        } else if (number < 100) {
            return tens[number / 10] + " " + singleDigits[number % 10] + " ";
        } else {
            return singleDigits[number/100] + " Hundred " + convertToWords(number % 100);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbeer ");

        try {
            int number = input.nextInt();
            
            if (number < 0 || number > 1000) {
                System.out.println("Please enter a number between 1 and 1000!");
            } else {
                String requiredWord = convertToWords(number);
                System.out.println(requiredWord);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            input.close();
        }
    }
}