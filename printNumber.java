import java.util.Scanner;
class printNumber{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("enter the array size:");
int size= sc.nextInt();
int [] arr = new int[size];
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("array elements are:");
for(int i=0;i<size;i++)
{
System.out.println("  "+arr[i]);
}
}
}

