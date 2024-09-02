
import java.util.Scanner;
//aaabbbccc
public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input from the user 
        String str = sc.nextLine();
        //Initializing string result which will store our resultant output string
        StringBuilder result = new StringBuilder();
        if(str.length()>1000){
            System.out.println("Enter String under 100 characters");
        }
        int frequency=1;
        //Loop to store the frequency of occurence of any character
        //i=i+frequency so that we can directly skip to next char
        for(int i=0;i<str.length();i=i+frequency){ 
            frequency=1;
            for(int j=i+1;j<str.length();j++){
                //If next character is same as previous then increment in frequency
                if(str.charAt(i)==str.charAt(j)){
                    frequency++;
                }
                else{
                    break;
                }
            }            
            //Add both the results in resultant string
            result.append(str.charAt(i));
            result.append(frequency);
        }
        
        System.out.println(result);
        sc.close();
    }
}
