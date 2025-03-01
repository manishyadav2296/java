

    

class  Gp extends Object{// example for multilevel inheritance
    public void m1(){
        System.out.println("Gp m1 method");
    }
    
}
class parent extends Gp{
    public void m2(){
        System.out.println("parents m2()");
    }
}
class Child extends parent{
    public void m3(){
        System.out.println("child m3()");
    }
    class Test{

    
    public static void main(String[] args) {

    
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
    }
}

}
