class Student1{
}
class ScienceStudent extends Student1{
public String practical;
ScienceStudent(String practical)
{
this.practical=practical;
}
void display()
{
System.out.println("I submited my"+practical+"Assignments with practical..");
}
}
class ArtsStudent extends Student1{
public String project;
ArtsStudent(String project)
{
this.project = project;
}
void display()
{
System.out.println("I submited my "+project+" project..");
}
}
class SDemo{
public static void main(String args[]){
ScienceStudent s1 = new ScienceStudent("JAVA");
ArtsStudent a1 = new ArtsStudent("JAVA");
s1.display();
a1.display();
}
}
