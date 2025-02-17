//write factorial of a number n
import java.util.*;
public class Four {
    public static void CalculateFactorial(int n) {
        //loop
        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial= factorial*i;
 }
 System.out.println(factorial);
 return;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
     CalculateFactorial(n);

    }
    
}
