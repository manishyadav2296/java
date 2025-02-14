Package pack2;
import pack1.Parent;

public class Child extends Parent {
   public Child(){}
    public void m4(){
    System.out.println("child class m4");
    }
  public static void main(String[] var0) {
    Parent var1=new Parent();
  var1.m1();
  Child var2=new Child();
  var2.m4();
  var2.m1();
  var2. m3();

    }
}
    

