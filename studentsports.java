class student
{
String stdname="reena";
double cgpa=5.6;
}
class sports extends student{
int goals=2;
}
class result extends sports{
void display(){
System.out.println("Name: " +stdname+"cgpa: " +cgpa+ "goals: " +goals);
}
}
class studentsports
{
public static void main(String args[]){
result re=new result();
re.display();
}
}
