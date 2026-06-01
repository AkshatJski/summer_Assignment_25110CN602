 import java.util.Scanner;
public class Question3 {
    public static void main(String args[]){
        System.out.println("Enter the number to find it's factorial: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = 1;
        for(int i=1; i<=n; i++){
            f *= i; // Loop to calculate the factorial of n by multiplying f with i in each iteration
        }
        System.out.println("Factorial of "+n+" is: "+f);
        in.close();
    }
}