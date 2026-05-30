import java.util.Scanner;
public class Question5{
    public static void main(String args[]){
        System.out.println("Enter the number to find the sum of it's digits: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while(n != 0){
            sum = sum + n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}