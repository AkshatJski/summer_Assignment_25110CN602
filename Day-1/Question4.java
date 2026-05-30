import java.util.Scanner;
public class Question4 {
    public static void main(String args[]){
        System.out.println("Enter the number to count it's digits: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        System.out.println("Number of digits: "+count);
    }
}