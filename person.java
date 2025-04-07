//create a class person with data members,name,gender,age,address and a constructor to initialize the data members and another class employee that inherits the properties of class person and also contains its own data members that emp_id,cmpny_name,Qualification,salary and its own constructor create another class teacher that inherits the properties of class employee and contain its own data members like subject,dept,teacher_id and also contain constructors and methods to display data members use array of objects to display the deatils of n teachers

import java.util.*;
class person
{
String name;
String gender;
String address;
int age;
person(String name,String gender,String address,int age)
{
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}
}

class Employee extends person
{
int empid;
String c_name;
String quali;
int salary;
Employee(String name,String gender,int age,String address,int empid,String c_name,String quali,int salary)
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
int dept_id;
int teacher_id;
teacher(String name,String gender,int age,String address,int empid,int c_name,String quali,int salary,String subject,int dept_id,int teacher_id)
{
super(name,gender,address,age,empid,c_name,quali,salary);
this.subject=subject;
this.dept_id=dept_id;
this.teacher_id=teacher_id;
}
void displayDetails()
{
System.out.println("Name:"+name);
System.out.println("Gender:"+gender);
System.out.println("Age:"+age);
System.out.println("Address:"+address);
System.out.println("empid:"+empid);
System.out.println("Company Name:"+c_name);
System.out.println("Qualification:"+quali);
System.out.println("Salary:"+salary);
System.out.println("Subject:"+subject);
System.out.println("Dept_id:"+dept_id);
System.out.println("Teacher_id:"+teacher_id);
}
}
class a
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter n:");
n=sc.nextInt();
teacher[] te=new teacher[n];
te[]=new teacher("john","Male",30,"newyork",101,"ABC school","msc",50000,"Maths","Mathematics",1001);
for(int i=0;i<n;i++)
{
System.out.println("Enter"+(i+1)+"teacher details:");
System.out.println("Enter id:");
int empid=sc.nextInt();
teacher.displayDetalis();
 }
 }
 }
 
 
 
 
 
 
