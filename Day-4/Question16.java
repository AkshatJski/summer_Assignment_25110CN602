import java.util.Scanner;;
public class Question16 {
    public static void main(String args[]){
        System.out.println("Enter the range among which you want to find the armstrong numbers");
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        System.out.println("The armstrong numbers in the given range are:");
        for(int i=n1; i<=n2; i++){ //to run a loop from the first number to the second number and check if each number is an armstrong number or not
            int temp = i, nume = 0, r;
            while(temp!=0){ // to find the number of digits in the number
                r=temp%10;
                nume++;
                temp=temp/10;
            }
            temp =i; // to find the sum of the digits raised to the power of number of digits
            int sum=0;
            while(temp!=0){
                r=temp%10;
                sum = sum + (int)Math.pow(r,nume); 
                temp=temp/10;
            }
            if(sum == i){ // to check if the sum is equal to the number and print the number if it is an armstrong number
                System.out.print(i + ","); 
            }
        }
        in.close(); 
    }
}
