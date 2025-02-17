//write a program to check number is even or not

public class Seven {
public static boolean isEven(int n) {
  return n%2==0;
    
 }
public static void main(String[] args) {
    int num=10;

        if (isEven(num)) {
        System.out.println(num + "is Even");
        
    }else{
        System.out.println(num + "is odd");
    }
}
}



