#include <stdio.h>
int greatest_of (int,int);
int main(){
	int n1,n2,n3,d;
  scanf ("%d %d %d",&n1,&n2,&n3);
  d= greatest_of (n1,n2);
  printf ("%d",greatest_of (d,n3));
  	return 0;
}
int greatest_of (int n1,int n2)
{
  int max=0;
  if (n1>n2)
  {
    max=n1;
  }
  else
  {
    max=n2;
  }
  return max;
  
  
}