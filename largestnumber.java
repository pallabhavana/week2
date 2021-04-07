import java.util.Scanner;
class largestnumber{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1,n2,n3;
System.out.println("enter n1,n2,n3:");
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();
if(n1>n2&&n1>n3)
{
System.out.println(n1);
}
if(n2>n1&&n2>n3){
System.out.println(n2);
}
if(n3>n1&&n3>n2){
System.out.println(n3);
}
}
}






