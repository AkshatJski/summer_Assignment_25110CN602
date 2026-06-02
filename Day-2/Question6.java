import java.util.Scanner;
public class Question6 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to reverse it and print it:");
        int num=in.nextInt();
        int rev=0;
        while(num!=0){ //while loop to reverse the number
            int r=num%10;
            rev=rev*10+r; //we multiply the previous reversed number by 10 and add the last digit of the original number
            num=num/10;
        }
        System.out.println("Reversed number: " + rev);
     in.close();
    }
    
}
