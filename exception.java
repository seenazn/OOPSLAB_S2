import java.util.*;
class userException extends Exception
{
public userException(String s)
{
super(s);
}
}
class exception
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String uname,pwd;
try
{
System.out.println("Enter Username:");
uname=sc.nextLine();
if(uname==" ")
{
throw new userException("no username...");
}
if(uname.length()<8)
{
throw new userException("Greater than 8 characters..");
}
}
catch (userException e)
{
System.out.println("username error");
}
try
{
System.out.println("Enter Password:");
pwd=sc.nextLine();
if(pwd==" ")
{
throw new userException("no password!");
}
if(pwd.length()<8)
{
throw new userException("Greater than 8 characters");
}
}
catch (userException es)
{
System.out.println("password error");
}
}
}













