package day3.inheri;

public class Employee1 extends Person1{
private int empId;
private float salary;
private String dept;
public Employee1() {
System.out.println("Employee Class Default Constructor");
}
public Employee1(int empId, float salary, String dept) {
this.empId = empId;
this.salary = salary;
this.dept = dept;
}
public Employee1(String name, String city,int empId, float salary, String dept) {
super(name,city);
this.empId = empId;
this.salary = salary;
this.dept = dept;
}
public int getEmpId() {
return empId;
}
public void setEmpId(int empId) {
this.empId = empId;
}
public float getSalary() {
return salary;
}
public void setSalary(float salary) {
this.salary = salary;
}
public String getDept() {
return dept;
}
public void setDept(String dept) {
this.dept = dept;
}
@Override
public String toString() {
return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", getName()=" + 
getName()
+ ", getCity()=" + getCity() + "]";
}
}