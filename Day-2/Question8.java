import java.util.Scanner;
public class Question8 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
       System.out.println("Enter the number to to find if it's a palindrome or not:");
        int num=in.nextInt();
        int rev=0;
        int temp=num; //we store the original number in a temporary variable to compare it with the reversed number later
        while(num!=0){ 
            int r=num%10;
            rev=rev*10+r; //we multiply the previous reversed number by 10 and add the last digit of the original number
            num=num/10;
        }
        if(temp==rev){ //if the original number is equal to the reversed number, then it's a palindrome
            System.out.println(temp + " is a palindrome.");
        } else {
            System.out.println(temp + " is not a palindrome.");
        }
        in.close();
    }
}
