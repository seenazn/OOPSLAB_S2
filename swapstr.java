import java.util.*;
class swapstr
{
public static void main(String args[])
{
String a,b,c;
Scanner sc= new Scanner(System.in);
System.out.print("Enter string1:");
a=sc.nextLine();
System.out.print("Enter string2:");
b=sc.nextLine();
c=a;
a=b;
b=c;
System.out.println("Enter string1:"+a);
System.out.println("Enter string2:"+b);
}
}
