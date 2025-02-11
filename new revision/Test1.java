public class Test1{
    int a=10;
    int b=15;
    int c=20;
    static int d=25;
    public static void main(String[] args) {
        Test1 t1=new Test1();
        Test1 t2=new Test1();
        System.out.println(t1.a + t2.b + t2.c);
        t2.d=5;
        System.out.println(t2.d + t2.c+ t2.a );


    }
    
}
