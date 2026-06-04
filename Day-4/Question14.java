import java.util.Scanner;
public class Question14 {
    public static void main(String args[]){
        System.out.println("Enter the nth term of the Fibonacci series you want to find");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, b = 1, c = 0;
        if(n == 0){
            System.out.println(a);
        }
        else if(n == 1){
            System.out.println(b);
        }
        else{
            for(int i = 2; i <= n; i++){ //since the first two terms are already defined, we start the loop from 2
                c = a + b;
                a = b;
                b = c;  //updating the values of a and b for the next iteration
            }
            System.out.println(c);
        }
        in.close();
    }
}
