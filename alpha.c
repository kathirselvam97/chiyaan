#include<stdio.h>
void main()
{
char a;
printf("Enter the char:");
scanf("%c",&a);
if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
printf("It is Alphabet");
else
printf("Not an Alphabet");
}