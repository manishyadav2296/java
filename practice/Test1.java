public class Test1 {
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        int c=30;
        Test1 t1=new Test1();
        Test1 t2=new Test1();
        t1.a=20;
        t2.a=5;
        System.out.println(t1.a+t2.a+c);

    }
    
}
