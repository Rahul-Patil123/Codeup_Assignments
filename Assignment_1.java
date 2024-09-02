import java.util.Scanner;
public class Assignment_1 {
    static void func(String str){
        //Initializing string result which will store our resultant output string
        StringBuilder result = new StringBuilder();
        //Looping through the given String
        for (int i = 0; i < str.length(); i++) {
            //Storing current character to use later to print 
            char currentChar = str.charAt(i);
            //Checks if the  current character is alphabet or not 
            if (Character.isAlphabetic(currentChar)) {
                //Incrementing i to get the value of how many times to print char
                i++;
                int frequency = 0;
                //For the case where number is greater than 9
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    frequency = frequency*10+(str.charAt(i) - '0'); 
                    i++;
                }
                //Decrement i so that we exceded in previous false case comes to present char
                i--;
                //Printing a char for given frequency  
                for (int k = 0; k < frequency; k++) {
                    result.append(currentChar);
                }
            }
        }
        System.out.println(result.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking Input string from the user
        String str = sc.nextLine();
        if(str.length()>100){
            System.out.println("Enter String under 100 characters");
        }else{
            //Function call to print desired output
            func(str.toLowerCase());
        }
        sc.close();        
    }
}