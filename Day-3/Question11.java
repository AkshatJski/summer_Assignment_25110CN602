import java.util.Scanner;
public class Question11 {
    public static void main(String args[]) {
    System.out.println("Enter two numbers to find their GCD");
    Scanner in = new Scanner(System.in);
     int num1=in.nextInt();
     int num2=in.nextInt();
     int gcd=1;
     for(int i=1;i<=num1 && i<=num2;i++){ // Loop to find the GCD of num1 and num2 by checking for common factors from 1 to the smaller of the two numbers. If i is a common factor, then we set gcd to i
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
     }
        System.out.println("The GCD of "+num1+" and "+num2+" is "+gcd);
        in.close();
}
}
