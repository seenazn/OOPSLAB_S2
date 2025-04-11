class publisher
{
String name="abcd";
}
class book extends publisher
{
String bookname="aabbcc";
}
class literature extends book
{
String type="literature";
}
class fiction extends book
{
String type="fiction";
}
class library
{
public static void main(String args[])
{
literature lb=new literature();
fiction fb=new fiction();
System.out.println("Fiction book details :");
System.out.println("publisher:"+fb.name+"   name is: "+fb.bookname+"   type is: "+fb.type);
System.out.println("Literature book details :");
System.out.println("publisher:"+lb.name+"   name is: "+lb.bookname+"   type is: "+lb.type);
}
}

