import java.io.*;
class a{
public static void main(String args[])
{
String s=args[0];
if(s.length()<=10000)
{
StringBuffer sb=new StringBuffer(s);
String s1=sb.reverse().toString();
System.out.println(s1);
}
}
}
