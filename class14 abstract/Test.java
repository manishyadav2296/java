abstract class Test {
    abstract void login();

    
}
class B extends Test{
    void login(){}
    public static void main(String[] args) {
        new B();

    }
}


/*
 * if any class extending abstrct class
 * we have to provide impletation for abstract method
 */