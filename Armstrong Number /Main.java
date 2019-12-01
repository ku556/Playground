#include <stdio.h>
int main() {
int rem,arm,sum=0,temp,n;
  scanf ("%d",&n);
  temp=n;
  while (n!=0)
  {
    rem=n%10;
    arm=pow(rem,3);
      sum=sum+arm;
    n=n/10;
  }
  if (temp==sum)
    printf  ("Armstrong Number");
  else
    printf  ("Not an Armstrong Number");
    
	return 0;
}