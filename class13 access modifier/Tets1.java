 //this is showing error due to we have created final class
 final class Parent{
    public void getgoodquantity(){
        System.out.println("Parent class -method ggq");
    }

}



class Child extends Parent{
public void getgoodquantity(){
    System.out.println("Parent class- method ggq");
}
public static void main(String[] args) {
    Parent p1=new Parent();
    p1.getgoodquantity();
    Child c1=new Child();
    c1.getgoodquantity();
}



    
}
