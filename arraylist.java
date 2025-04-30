import java.util.*;
class arraylist
{
public static void main(String args[])
{
ArrayList<String>cars=new ArrayList<String>();
cars.add("Mercedes benz");
cars.add("Ferrari");
cars.add("Audi");
cars.add("Volkswagen");
cars.add("Kia");
cars.add("BMW");
cars.add(4,"Scoda");
cars.add("Maruti");
cars.add("Mahindra");
cars.add("renault");
System.out.println("List of the cars");
System.out.println("-------------------");
for(String str:cars)
{
System.out.println(str+"  ");
}
cars.remove("BMW");
cars.remove(3);
System.out.println("Removed List");
System.out.println("-------------------");
for(String str:cars)
{
System.out.println(str+" ");
}
cars.set(2,"ford");
System.out.println("Updated List");
System.out.println("-------------------");
for(String str:cars)
{
System.out.println(str+" ");
}
Collections.sort(cars);
System.out.println("Sorted Lists");
System.out.println("-------------------");
for(String str:cars)
{
System.out.println(str+" ");
}
System.out.println("Checked Lists");
System.out.println("-------------------");
System.out.println("ferrari is in list:"+cars.contains("Ferrari"));
System.out.println("kia is in list:"+cars.contains("Kia"));
System.out.println("size of array is:"+cars.size());
System.out.println("Object at second position is:"+cars.get(0));
cars.clear();
System.out.println("Final list is:"+cars);
}
}














