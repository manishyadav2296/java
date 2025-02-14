
class Parent{
    public void m1(){
        System.out.println("Parent class m1 method");
    }
    public void m2(){
        System.out.println("Parent class m2 method");
    }
}
class Child extends Parent{
    public void m3(){
        System.out.println("Child class m3 method");

    }

    public void m4() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'm4'");
    }
}
public class Test {
    public static void main(String[] args) {
        
    
Parent p1=new Parent();
p1.m1();
p1.m2();
System.out.println("***********");
Child c1=new Child();
c1.m1();
c1.m2();
c1.m3();

    }  
}
