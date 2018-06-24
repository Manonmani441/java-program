import java.io.*;
import java.util.Scanner.java;
class A{
public static void main(String args[])
{
int n,m,i,j;
Scanner sc =new Scanner(System.in);
n=sc.nextInt();
m=sc.nextInt();
for(i=n;i<=m;i++)
{
int c=1;
for(j=1;j<=i/2;j++)
{
c++;
}
}
if(c==2)
{
System.out.println(i);
}
}
}
