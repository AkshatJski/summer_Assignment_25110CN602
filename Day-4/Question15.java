import java.util.Scanner;
public class Question15 {
    public static void main(String args[]){
        System.out.println("Enter the number to check if it's armstrong or not");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n, nume = 0, r;
        while(temp!=0){ // to find the number of digits in the number
            r=temp%10;
            nume++;
            temp=temp/10;
        }
        temp =n; // to find the sum of the digits raised to the power of number of digits
        int sum=0;
        while(temp!=0){
            r=temp%10;
            sum = sum + (int)Math.pow(r,nume); // to find the sum of the digits raised to the power of number of digits
            temp=temp/10;
        }
        if(sum == n){
            System.out.println("The number is an Armstrong number");
        }
        else{
            System.out.println("The number is not an Armstrong number");
        }
        in.close();
    }
}
