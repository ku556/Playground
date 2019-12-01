#include <stdio.h>
int main() {
	int n,d,s,e;
  scanf ("%d",&n);
  d=n;
  s=d%10;
  while (n>10)
  {
    n=n/10;
  }
  e=s+n;
  printf ("%d",e);
	return 0;
}