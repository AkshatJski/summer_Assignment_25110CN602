import java.util.Scanner;
public class Question17 {
    public static void main(String args[]){
        System.out.println("Enter the number to check if it's perfect or not");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int i=1; i<n; i++){ // Loop to find the factors of the number
            if(n%i == 0){ 
                sum = sum + i; // Add the factors to the sum
            }
        }
        if(sum == n){ // Check if the sum of the factors is equal to the number
            System.out.println("The number is a perfect number");
        }
        else{
            System.out.println("The number is not a perfect number");
        }
        in.close();
    }
}
