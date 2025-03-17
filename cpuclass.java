class CPU
{
int price;
CPU(int p){
    price=p;
}
class processor
{
    int cores;
    String Manufacturer;
    processor(int x,String m)
    {
        cores=x;
        Manufacturer=m;
    }
    void display()
{
System.out.println("cores:"+cores);
System.out.println("Manufacturer:"+Manufacturer);
}
}
static class RAM
{
    int memory;
    String Manufacturer;
    RAM(int y,String n)
    {
    memory=y;
    Manufacturer=n;
}
void display()
{
System.out.println("memory of RAM:"+memory);
System.out.println("Manufacturer:"+Manufacturer);
}
}
}
class cpuclass{
public static void main(String args[])
    {
        CPU sc=new CPU(222000);
        CPU.processor np=sc.new processor(3,"intel");
        CPU.RAM abc=new CPU.RAM(3,"nexa");
abc.display();
    }
}


    
 
