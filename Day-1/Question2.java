import java.util.Scanner;
public class Question2{
    public static void main(String args[]){
        System.out.println("Enter the number to print its multiplication table: ");
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }

    }
}