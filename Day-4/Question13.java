import java.util.Scanner;
public class Question13 {
    public static void main(String args[]){
        System.out.println("Enter the number till which you want to find the Fibonacci series");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + "," + b + ",");
        for(int i = 2; i < n; i++){ //since the first two terms are already printed, we start the loop from 2
            c = a + b;
            System.out.print(c + ",");
            a = b;
            b = c; //updating the values of a and b for the next iteration
        }
        in.close();
    }
}
