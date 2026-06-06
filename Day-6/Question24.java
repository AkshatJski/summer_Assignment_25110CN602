import java.util.Scanner;
public class Question24 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number and the power to find it's power without pow()");
        int num=in.nextInt();
        int pow=in.nextInt();
        int result=1;
        for(int i=0;i<pow;i++){
            result=result*num; //To calculate the power by multiplying the base number (num) with itself pow number of times, and storing the result in the variable result.
        }
        System.out.println("Power is: "+result);
        in.close();
    }
}
