package day3.inheri;

public class HierarchicalInhDemo {
public static void main(String[] args) {
Person1 p1 = new Person1();
System.out.println("----------------- Person Details ---------------------");
System.out.println(p1);
Person p;
p1 = new Person1("Dhruv", "Mumbai");
if (p instanceof Person)
System.out.println("Person Details "+p);
p1 = new Employee1("Nikhil", "Mumbai", 101, 67000, "Sales");
if (p instanceof Employee)
System.out.println("Employee Details "+p);
p1 = new Student1("Pankaj", "Pune", "FE", 88);
if (p instanceof Student1)
System.out.println("Student Details "+p);
}

}
