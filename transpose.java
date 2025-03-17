import java.io.*;
import java.util.*;
class transpose
{
public static void main(String[] args)
{
int i,j,rows,cols;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");
rows=sc.nextInt();
System.out.println("Enter the number of columns");
cols=sc.nextInt();

int[][]matrix=new int[rows][cols];
System.out.println("Enter the matrix elements:");
for(i=0;i<rows;i++){
for(j=0;j<cols;j++){
matrix[i][j]=sc.nextInt();
}
}
for(i=0;i<cols;i++){
for(j=0;j<rows;j++){
System.out.print(matrix[j][i]);
}
System.out.println();
}
sc.close();
}
}



