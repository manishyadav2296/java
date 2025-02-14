package pack2;
import pack1.A;
public class C  extends A{
    public static void main(String[] args) {
        
    // USING EXTENDS SYNTAX WE CAN ALSO ACCEESS PROTECTED METHOD
    
    C c1=new C ();
    c1.m1();// m1 public
    c1.m3();// m3 private
    //c1.m2(); // m2 private
    //c1.m4();// m4 default

    }
    
        
    }
    

