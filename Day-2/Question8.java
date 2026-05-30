import java.util.Scanner;
public class Question8 {
    public static void main(String args[]){
        System.out.println("Enter the number to check if it's palindrome: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int og = n;
        int rev = 0;
        while(n != 0){
            rev = rev*10 + (n % 10);
            n /= 10;
        }
        if(og == rev){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}

