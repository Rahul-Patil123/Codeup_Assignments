
import java.util.Scanner;
public class Assignment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take number from user 
        int number = sc.nextInt();
        //Flag to generate when number is divisible by other number 
        int flag =0;
        //Case when 0 and 1 are input
        if(number==0 || number==1){
            System.out.println(number+" is not a prime number");
        }
        //Looping till number/2 because number/2 + 1 * X will always be greater than number
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                System.out.println(number+" is not a prime number");
                //Flag is generated if number is prime
                flag=1;
                break;
            }
        }
        //If Flag is not generated then number is prime
        if(flag==0){
            System.out.println(number+" is a prime number");
        }
    }
}
