//program to create a class for employee having attributes e number,e name,e salary.
 //read n employee information and search for an employee given e number using the concept of array of objects//
 
import java.util.*;
class employee
{
int eno;
String ename;
double esalary;
employee(int eno,String ename,double esalary)
{
this.eno=eno;
this.ename=ename;
this.esalary=esalary;
}
}


class emp
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n:");
int n=sc.nextInt();
employee[] emps=new employee[n];
for(i=0;i<n;i++)
{
System.out.println("Enter eno:");
int eno=sc.nextInt();
sc.nextLine();
System.out.println("Enter ename:");
String ename=sc.nextLine();
System.out.println("Enter esalary:");
double esalary=sc.nextDouble();
emps[i]=new employee(eno,ename,esalary);
}
System.out.println("Enter a search value");
int s=sc.nextInt();
for(i=0;i<n;i++)
{
if(emps[i].eno==s){
System.out.println(" eno: "+emps[i].eno+" ename: "+emps[i].ename+" esalary: "+emps[i].esalary);
}
}
}
}

