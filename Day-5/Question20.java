import java.util.Scanner;
public class Question20 {
    public static void main(String args[]){
        System.out.println("Enter the number to find it's largest prime factor");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int Largestpf=0;
        for(int i=2;i<=num;i++){ // Loop to find the prime factors of the number
            while(num%i==0){
                Largestpf=i;
                num=num/i; // Divide the number by the prime factor until it is no longer divisible
            }
        }
        System.out.println("The largest prime factor is: " + Largestpf);
        in.close();
    }
}
