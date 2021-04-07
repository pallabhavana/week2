import java.util.*;
class validnumber{
public static void main(String[] args){
try{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
System.out.println(n+"it is a valid number:");
}
catch(InputMismatchException e)
{
System.out.println("it is not a valid number:");
}
}
}