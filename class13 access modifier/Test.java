// final- static- abstract class 
 //we cant use final class parent if we use Child class cannot be created
    class Parent{
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