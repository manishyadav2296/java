public class Test {

    int a=100;
    int b=200;
    static int c=300;
    public static void main(String[] args) {
        Test t1= new Test();
        Test t2= new Test();
        System.out.println(t1.a + t1.b);
        t2.a=10;
        System.out.println(t1.b + t2.a );
    }
}