
import java.util.Scanner;
public class CWH_DATATYPE {
    public static void main(String[] args) {
//        short z = 8;
//        byte x = 4 ;
//        int a = 9;
//        float b = 2.45f + a;
//
//        int c = 90;
//
//        System.out.println(b);

        //incremenant and decremenant
//        int i=56;
//        // int b=i++; // first b is assigned i(56) then i is incremenant
//        int j= 67;
//        int c=++j ;// first j is incremenant then i is assigned to c(680
//        System.out.println(i++);// 56
//        System.out.println(i);//57
//        System.out.println(++i);//58
//        System.out.println(i);//58

    // quick quiz
//        int y=7;
//        int x=++y*8;
//        System.out.println(x);
//
//        char ch='a';
//        System.out.println(++ch);
Scanner sc=new Scanner(System.in);
int Math,Phy,Chem,Eng,Hindi;
        System.out.println("enter the Math number");
        Math= sc.nextInt();
        System.out.println("enter the Phy number");
        Phy=sc.nextInt();
        System.out.println("enter the Chem number");
        Chem=sc.nextInt();
        System.out.println("enter the Eng number");
        Eng=sc.nextInt();
        System.out.println("enter the Hindi number");
        Hindi=sc.nextInt();
        double total=Math+Phy+Chem+Eng+Hindi;
        double p=total/500;
        double percentage=p*100;
        System.out.println(percentage);

    }

}
