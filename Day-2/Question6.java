import java.util.Scanner;
public class Question6 {
    public static void main(String args[]){
        System.out.println("Enter the number to find it's reverse: ");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int rev=0;
        while(n!=0){
            rev = rev*10 + (n % 10);
            n /= 10;
        }
        System.out.println("Reverse of the number is: " + rev);
    }
}
