// make a function to multiply2 number and return the product
import java.util.*;
public class Three {
public static int CaluclateProduct(int a,int b){
    int product=a*b;
    return product;

}public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int product=CaluclateProduct(a, b);
   System.out.println(product); 
}
    
}