  public class Employee {
    private int empId;// private =restricated access
    //restricated access
    private String empName;
    public void setempId(int eId){
        this.empId=eId;// "this" is used to access class member inside a class
 }
    public int getempId(){
        return this.empId;
    }
    public void setempName(String name){
        this.empName=name;
  }
  public String getempName(){
    return this.empName;
    }  public static void main(String args[]){
        Employee e1=new Employee();
        e1.setempId(101);
        e1.setempName("Rahul");
        Employee e2=new Employee();
        e2.setempId(102);
        e2.setempName("sonia");
        System.out.println(e1.getempId()+ e1.getempName());
        System.out.println(e2.getempId()+e2.getempName());
    }
  
 }
