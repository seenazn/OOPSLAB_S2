//create a class person with data members,name,gender,age,address and a constructor to initialize the data members and another class employee that inherits the properties of class person and also contains its own data members that emp_id,cmpny_name,Qualification,salary and its own constructor create another class teacher that inherits the properties of class employee and contain its own data members like subject,dept,teacher_id and also contain constructors and methods to display data members use array of objects to display the deatils of n teachers

import java.util.*;
class pers
{
String name;
String gender;
String address;
int age;
pers(String name,String gender,String address,int age)
{
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}
}
class Employee extends pers
{
int empid;
String c_name;
String quali;
int salary;
Employee(String name,String gender,String address,int age,int empid,String c_name,String quali,int salary)
{
super(name,gender,address,age);
this.empid=empid;
this.c_name=c_name;
this.quali=quali;
this.salary=salary;
}
}
class teacher extends Employee
{
String subject;
String dept;
int teacher_id;
teacher(String name,String gender,String address,int age,int empid,String c_name,String quali,int salary,String subject,String dept,int teacher_id)
{
super(name, gender,address,age,empid, c_name, quali, salary); //include 'age' here
this.subject=subject;
this.dept=dept;
this.teacher_id=teacher_id;
}
void display()
{
System.out.println("Name:"+name);
System.out.println("Gender:"+gender);
System.out.println("Company Name:"+c_name);
System.out.println("empid:"+empid);
System.out.println("Company Name:"+c_name);
System.out.println("Address:"+address);
System.out.println("Qualification:"+quali);
System.out.println("Age:"+age);
System.out.println("Salary:"+salary);
System.out.println("Teacher_id:"+teacher_id);
System.out.println("Subject:"+subject);
System.out.println("Dept:"+dept);
}
}
public class person
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i;
System.out.println("Enter number of teachers(n):");
n=sc.nextInt();
sc.nextLine();
teacher[] te=new teacher[n];
for(i=0;i<n;i++)
{
System.out.println("Enter"+(i+1)+"teacher details:");
System.out.println("Enter name:");
String name=sc.nextLine();
System.out.println("Enter gender:");
String gender=sc.nextLine();
System.out.println("Enter address:");
String address=sc.nextLine();
System.out.println("Enter age:");
int age=sc.nextInt();
sc.nextLine();
System.out.println("Enter Employee id:");
int empid=sc.nextInt();
sc.nextLine();
System.out.println("Enter company name:");
String c_name=sc.nextLine();
System.out.println("Enter Qualification:");
String quali=sc.nextLine();
System.out.println("Enter Salary:");
int salary=sc.nextInt();
sc.nextLine();
System.out.println("Enter the Subject:");
String subject=sc.nextLine();
System.out.println("Enter Department:");
String dept=sc.nextLine();
System.out.println("Enter the Teacher id:");
int teacher_id=sc.nextInt();
sc.nextLine();
te[i]=new teacher(name,gender,address,age,empid,quali,c_name,salary,subject,dept,teacher_id);
 }
 for(i=0;i<n;i++)
 {
 te[i].display();
 }
 sc.close();
 }
 }
 
 
 
 
 
 
