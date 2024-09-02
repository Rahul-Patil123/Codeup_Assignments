
import java.util.Scanner;
public class Assignment_4 {
    //String array storing all the words which will be used to convert any number to word
    //First element is empty to match indexing
    private static final String[] singleDigits = { "", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine " };
    private static final String[] teensDoubleDigits = {"Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen " };
    private static final String[] tens = { "", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety " };
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
            return singleDigits[number/100] + " Hundred" + convertToWords(number % 100);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take any number from user within range 1-1000 
        int number = sc.nextInt();
        if(number<0 || number>1000){
            System.out.println("Enter number between 1-1000!!");
        }else{
                String requiredWord= convertToWords(number);
                System.out.println(requiredWord);
            }
        sc.close();
        
    }

}
