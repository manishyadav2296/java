interface Useri{
    public  void login();
    abstract void logout();
    void forgetPassword();
}
 public class User implements Useri{
    public void login(){
        System.out.println("login success");
    }
    public void logout(){
        System.out.println("logout success");
    }
    public void forgetPassword(){
        System.out.println("forgetPassword -- Testcase");
    }
    public static void main(String[] args) {
        User u1=new User();
        u1.login();
        u1.forgetPassword();
        u1.logout();
    }
}
    
    
    
    

