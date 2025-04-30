import java.util.*;
class NegativeNumberException extends Exception
{
public NegativeNumberException(String s)
{
super(s);
}
}
class excep
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count,i;
System.out.println("Enter the number of integers(n):");
count=sc.nextInt();
int[] numbers=new int[count];
try
{
System.out.println("average of "+count+"positive integers:");
for(i=0;i<count;i++)
{
int num=sc.nextInt();
numbers[i]=num;
if(num<0)
{
throw new NegativeNumberException("Negative number are not allowed!");
}
}
int sum=0;
for(i=0;i<count;i++)
{
sum+=numbers[i];
}
float average=(float)sum/count;
System.out.println("Average of given numbers is:"+average);
}
catch(NegativeNumberException ex)
{
System.out.println("Exception caught!!");
System.out.println(ex.getMessage());
}
}
}

