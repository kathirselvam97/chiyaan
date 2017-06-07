#include<stdio.h>
void main()
{
int a,b,c,d;
printf("Enter the a,b,c values:");
scanf("%d%d%d",&a,&b,&c);
d=(a>b)?((a>c)?a:c):((b>c)?b:c)
printf("the largest value is:",d);
getch();
}