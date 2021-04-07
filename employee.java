class Employee
{
public int eid;
public String eName;
Employee(int eid,String eName)
{
this.eid= eid;
this.eName= eName;
}
public void display()
{
System.out.println("Employee ID No:"+eid);
System.out.println(" Employee Name:"+eName);
}
}
class SDemo4
{
public static void main(String a[])
{
Employee s1 = new Employee(101,"sita");
Employee s2 = new Employee(102,"gita");
s1.display();
s2.display();
}
}
