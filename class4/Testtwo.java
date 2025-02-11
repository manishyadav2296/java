public class Testtwo {
    int a=100;//non-statics or instance variable
    static int b=200;//statics variable or class level variable
    public static void main(String[] args) {
        int c=300;
       // System.out.println(a);//CE
        System.out.println(b);//200
        System.out.println(c);//300
    
        
    }
    
}
