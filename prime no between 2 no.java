import java.io.*;
import java.util.Scanner.java;
class A{
public static void main(String args[])
{
int n,m,i,j,f=0,c=0;
Scanner sc =new Scanner(System.in);
n=sc.nextInt();
m=sc.nextInt();
for(i=n;i<=m;i++)
{
f=0;
for(j=1;j<=(i/2);j++)
{
  if((i%j)==0)
  {
f=1
}
  else{
    f=0;
  }
}
if(f==0)
{
c++
}
}
  System.out.println(i);
}
