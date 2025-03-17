import java.io.*;
import java.util.*;
class sym
{
public static void main(String[] args)
{
int i,j,rows,cols,flag=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");
rows=sc.nextInt();
System.out.println("Enter the number of columns");
cols=sc.nextInt();
if(rows==cols)
{
int[][]matrix=new int[rows][cols];
System.out.println("Enter the matrix elements:");
for(i=0;i<rows;i++){
for(j=0;j<cols;j++){
matrix[i][j]=sc.nextInt();
}
}

for(i=0;i<rows;i++){
for(j=0;j<cols;j++){
if(matrix[i][j]!=matrix[j][i])
{flag=1;
break;
}
}
}
}if(flag==0){
System.out.println("The matrix is symmetric");
}
else
{
System.out.println("The matrix is asymmetric");
}
}
}





