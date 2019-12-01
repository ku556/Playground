#include <stdio.h>
int main() {
	int n,i,rem,temp,sum=0,mul;
  scanf ("%d",&n);
  temp=n;
  while (n!=0)
  {
    rem=n%10;
    mul=1;
    for (i=1;i <= rem;i++)
    
    {
      mul=mul*i;
      
    }
    sum=sum+mul; 
    
    n=n/10;
  }
  if(temp==sum)
    printf ("Yes");
  else
    printf ("No");
 
      
	return 0;
}