import java.io.*;
class a{
public static void main(string args[])
{
int a=0,x;
int n=Integer.parseInt(args[0]);
while(n!=0)
{
x=n%10;
a=a*10+x;
n=n/10;
}
System.out.println(a);
}
}
