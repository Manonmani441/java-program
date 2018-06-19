import java.io.*;
class A{
public static void main(String args[]){
int i,n,m;
n=Integer.parseInt(args[0]);
m=Integer.parseInt(args[1]);
for(i=n;i<m;i++){
if(i+1)%2==0){
System.out.println(i);
}
}
}
}
