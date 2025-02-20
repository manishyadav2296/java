public class Employee1 {

    private int empId;// private =restricated access
    //restricated access
    private String empName;   
    public void setempName(String name){
        this.empName=name;
  }
  public String getempName(){
    return this.empName;
}
public static void main(String[] args) {
     Employee e1=new Employee(101);// we are creating object value so construct will be used
     e1.setempName("rahul");
}
}
