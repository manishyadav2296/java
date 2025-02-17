//make a functionto add 3 number and return the sum
import java.util.*;
public class Five {
    public static int CalculateSum(int a,int b,int c) {
        int sum=a+b+c;
        return sum;

        
    }public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();    
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=CalculateSum(a, b, c);
        System.out.println(sum);
    }

    
}