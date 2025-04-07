import java.util.*;
class palindrome
{
public static void main(String args[])
{
int i;
String str;
Scanner sc= new Scanner(System.in);
System.out.print("Enter a string:");
str=sc.nextLine();
String strrev="";
for(i=str.length()-1;i>=0;i--)
{
strrev=strrev+str.charAt(i);
}
if(str.equals(strrev))
{
System.out.println("String is Palindrome");
}
else
{
System.out.println("String is not a Palindrome");
}
}
}
