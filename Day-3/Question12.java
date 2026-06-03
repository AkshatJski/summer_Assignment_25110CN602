import java.util.Scanner;
public class Question12 {
    public static void main(String args[]){
        System.out.println("Enter two numbers to find their LCM");
        Scanner in = new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int lcm=1;
        for(int i=1;i<=num1*num2;i++){ // Loop to find the LCM of num1 and num2 by checking for common multiples from 1 to the product of the two numbers. If i is a common multiple, then we set lcm to i and break the loop
            if(i%num1==0 && i%num2==0){
                lcm=i; //Least common multiple of num1 and num2
                break;
            }
        }
        System.out.println("The LCM of "+num1+" and "+num2+" is "+lcm);
        in.close();
    }
}
