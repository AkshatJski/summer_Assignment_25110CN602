import java.util.Scanner;
public class Question5{
public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the number to find the sum of its digits:");
    int num=in.nextInt();
    int sum=0;
    while(num!=0){
        int r=num%10;
        sum=sum+r;
        num=num/10;
    }
    System.out.println("Sum of digits: " + sum);
    in.close();
}
}