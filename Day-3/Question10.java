import java.util.Scanner;
public class Question10 {
    public static void main(String args[]) {
System.out.println("Enter the range of numbers among which you want to find the prime numbers");
        Scanner in = new Scanner(System.in);
        int st= in.nextInt();
        int en= in.nextInt();
        int flag=0;
        for(int i=st;i<=en;i++){ // Loop to check for prime numbers in the range of numbers
            flag=0; 
            for(int j=2;j<i/2;j++){ //Second loop to check if i is divisible by any number from 2 to i/2. If it is divisible, then it is not a prime number and we set flag to 1 and break the loop
                if(i%j==0){
                    flag++;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i+" is a prime number");
            }
        }
        in.close();
    }
}
