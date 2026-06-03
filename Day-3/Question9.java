import java.util.Scanner;
public class Question9 {
    public static void main(String args[]) {
        System.out.println("Enter the number to check whether it is a prime number or not");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int flag=0; // Variable to keep track of whether num is a prime number or not
        for(int i=2;i<num/2;i++){ // Loop to check if num is divisible by any number from 2 to num/2. If it is divisible, then it is not a prime number and we set flag to 1 and break the loop
            if(num%i==0){
                flag++; 
                break; // If num is divisible by i, then it is not a prime number and we set flag to 1 and break the loop
            }
        }
        if(flag==0){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
        in.close();
    }
}