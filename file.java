import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class file
{
public static void main(String[] args) throws IOException
{
FileInputStream source=new FileInputStream("source.txt");
FileOutputStream d=new FileOutputStream("d.txt");
int i;
while((i=source.read())!=-1)
{
d.write(i);
}
System.out.println("copied");
source.close();
d.close();
}
}
