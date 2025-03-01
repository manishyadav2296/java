// multiple inheritance using interface
interface DaoI{
    public abstract void login();
    

    public abstract void logout();

}
interface UserI{
    public abstract void  forgetPwd();

}
class User implements DaoI,UserI{
    public void login(){
        System.out.println("login");
    }
    public void logout(){
        System.out.println("logout");
    }
    public void forgetPwd(){
        System.out.println("forgetPwd");
    }
}
public class Interface {
    public static void main(String[] args) {
    User obj=new User();
    obj.login();
    obj.logout();
    obj.forgetPwd();

        
    }
   
}
