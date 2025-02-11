public class Testone {
    int a;
    static int b;
    public static void main(String[] args) {
        int c=300;
        Testone t1=new Testone();
        System.out.println(t1.b+Testone.b+b);
        System.out.println(t1.a+t1.b+c);
        Testone t2=new Testone();
        t2.a=101;
        t2.b=11;
        System.out.println(t1.a + t2.a+t1.b);
        b=14;
        System.out.println(t1.b+t2.b+Testone.b+b);
    }

    
}
