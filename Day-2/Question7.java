import java.util.Scanner;
public class Question7 {
    public static void main(String args[]){
      System.out.println("Enter the number to find the product of it's digits: ");
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int product = 1;
      while(n != 0){
          product = product * (n % 10);
          n /= 10;
      }
      System.out.println("Product of digits: "+product);
    }
}
