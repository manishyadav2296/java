package pack1;
 class B {
    public static void main(String[] args) {
        A a1 = new A();
        a1.m1();// public m1 method
        //a1.m2();//private m2 method
    
        a1.m3();// protected m3 method
        a1.m4();//default method() m4
        
    }
    
}
