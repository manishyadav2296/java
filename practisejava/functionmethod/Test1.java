import java.util.*;
public class Test1 {
public static boolean isEven(int n) {
    return n%2==0;
    
}
    public static void main(String[] args) {
        int num=11;
        if (isEven(num)) {
            System.out.println(num + "IsEven");
            
        }else{
            System.out.println(num +"is odd");
        }
    }
}
