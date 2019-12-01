#include<stdio.h>
int sumof(int);
int main() {
    int n,s;
  scanf ("%d",&n);
  s= sumof (n);
  printf ("%d",s);
  	return 0;
}
int sumof(int n)
{
  int sum=0,i;
  for (i=1;i <=n; i++)
  {
    sum=sum+i; 
  }
  return sum;
  
  
}