import java.util.Scanner;
public class Question7 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
System.out.println("Enter the number to find the product of its digits:");
        int num=in.nextInt();
        int product=1; //initialize product to 1 because multiplying by 0 will always give 0
        while(num!=0){
            int r=num%10;
            product=product*r; //we multiply the previous product by the last digit of the original number
            num=num/10;
        }
        System.out.println("Product of digits: " + product);
        in.close(); //close the scanner to prevent memory leaks
    }
}
