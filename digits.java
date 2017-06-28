import java.io.*;
class digits
{
public static void main(String []args)
{
int n,a;
int count=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=0;i<n.length;i++)
{
a=n%10;
n=n/10;
count++;
}
System.out.println(count);
}
}
