import java.util.*;
public class Question22 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Binary number to change to Decimal");
        int num=in.nextInt();
        int decimal=0; 
        int pow=0; //To keep track of the power of 2 for each bit position, starting from 0 for rightmost bit.
        while(num>0){
            int r=num%10;
            decimal=decimal+r*(int)Math.pow(2,pow); //To calculate the decimal value by multiplying the remainder (r) with 2 raised to the power of pow, and adding it to the existing decimal value.
            pow++; 
            num=num/10;
        }
        System.out.println("Decimal number is: "+decimal);
            in.close();
    }
}
