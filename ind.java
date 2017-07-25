import java.io.*;
public class Index
{
public static void main(String ar[])throws Exception
{
int n;
Scanner z=new Scanner(System.in);
n=z.nextInt();
int ar[]=new int[n];
for(i=0;i<n;i++)
ar[i]=z.nextInt();
for(i=0;i<n;i++)
{
if(ar[i]==i)
System.out.println("the number"+ar[i]+"is equals to its index"+i);
}
}
}
