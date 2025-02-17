//make a functionto add 2 number and return the sum
import java.util.*;
public class Two {
    public static int CalculateSum (int a,int b) {
        int sum= a+b;
        return sum;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= CalculateSum(a, b);
        System.out.println(sum);
    }
}
