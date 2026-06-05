import java.util.Scanner;
public class Question19 {
    public static void main(String args[]){
        System.out.println("Enter the number to print it's factors");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The Factors of " + num + " are:");
        for(int i = 1; i <= num; i++){ // Loop to find the factors of the number
            if(num % i == 0){
                System.out.print(i + " "); // Print the factors of the number
            }
        }
        sc.close();
    }
}
