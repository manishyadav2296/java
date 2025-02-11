public class Testsix {
    int a=100;
    int b=200;
    static int c=300;
    public static void main(String[] args) {
        Testsix t1=new Testsix();
        Testsix t2=new Testsix();
        System.out.println(t1.a+ t2.b+c);
        t2.a=11;
        System.out.println(t1.a+ t2.b);
        System.out.println(t2.a +t2.b);
    }
    
}
