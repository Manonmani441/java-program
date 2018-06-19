import java.io.*;
class A{
public static void main(String arg[]){
boolean f=false;
int n=Integer.parseInt(arg[0]);
for(i=1;i<n%2;i++){
if(n%1==0)
{
f=true;
break;
}
}
if(!f)
System.out.ptintln("yes");
else
System.out.println("no");
}
}
