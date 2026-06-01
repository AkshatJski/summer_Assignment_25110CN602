import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter the number till which sum is to be calculated: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){ // Loop to calculate the sum of numbers from 1 to n
            sum = sum + i;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
        in.close();
    }
}
