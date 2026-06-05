import java.util.Scanner;
public class Question18 {
    public static void main(String args[]){
        System.out.println("Enter the number to check if it's a strong number or not");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int temp = n;
        while(temp!=0){ // Loop to find the digits of the number
            int r = temp%10;
            int f = 1;
            for(int i=1; i<=r; i++){ // Loop to find the factorial of the digit
                f = f * i;
            }
            sum = sum + f; // Add the factorial of the digit to the sum
            temp = temp/10;
        }
        if(sum == n){
            System.out.println("The number is a strong number");
        }
        else{
            System.out.println("The number is not a strong number");
        }
        in.close(); 
    }
}
