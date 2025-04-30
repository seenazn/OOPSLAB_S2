//create a graphic package that has classes and interfaces for figures rec,tri,square and circle.text the package by finding the area of these figures

package graphics;
import java.util.*;
interface shape{
double area();
}
class rectangle implements shape{
Scanner sc=new Scanner(System.in);
public double area()
{
System.out.println("Enter the length and breadth:");
float l=sc.nextFloat();
float b=sc.nextFloat();
float area=l*b;
return(area);
}
}
class square implements shape{
Scanner sc=new Scanner(System.in);
public double area()
{
System.out.println("Enter the side length:");
float s=sc.nextFloat();
float area=s*s;
return(area);
}
}
class graphics
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter choice: 1.Rectangle..");
int c=sc.nextInt();
switch(c)
{
case 1:
rectangle re=new rectangle();
System.out.println("Area of rectangle="+re.area());
break;
case 2:
square sq=new square();
System.out.println("Area of square="+sq.area());
break;
default:
System.out.println("Invalid choice. Please try again.");
}
}
}

