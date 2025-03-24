import java.util.*;
class manip
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String a,b,c;
System.out.print("Enter a string:");
a=sc.next();
System.out.print("Enter another string:");
b=sc.next();
c=a+" "+b;
System.out.println("Length of first string:"+a.length());
System.out.println("Length of second string:"+b.length());
System.out.println("Concatenate of string:"+c);
System.out.println("Character at position 5 of "+c+":"+c.charAt(5));
System.out.println("Comparison of string:"+a.compareTo(b));
System.out.println("Last index of 's' is:"+c.lastIndexOf('s'));
System.out.println("Endswith character 'r':"+c.endsWith("r"));
System.out.println("Conversion to Uppercase:"+c.toUpperCase());
System.out.println("Conversion to Lowercase:"+c.toLowerCase());
System.out.println("Empty:"+c.isEmpty());
System.out.println("Sub-string:"+b.substring(4,6));
System.out.println("Equals:"+b.equals(a));
}
}
