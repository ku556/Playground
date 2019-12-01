#include <stdio.h>
int gcd_of (int,int);
int main(){
	int n1,n2,n3,d;
  scanf ("%d %d %d",&n1,&n2,&n3);
  d= gcd_of (n1,n2);
  printf ("%d",gcd_of (d,n3));
  	return 0;
}
int gcd_of (int n1,int n2)
{
  int gcd, min=0;
  if (n1<n2)
  {
    min=n1;
  }
  else
  {
    min=n2;
  }
  while (min>=1)
  {
    if ((n1%min==0) && (n2%min==0))
    {
      gcd=min;
      break;
    }
    else
      --min;
    
  }
  
  return gcd;
  
}