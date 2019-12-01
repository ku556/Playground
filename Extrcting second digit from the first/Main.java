#include <stdio.h>
int main() {
	int d, n;
  scanf ("%d",&n);
  while (n>=100)
  {
    n=n/10;
  }
  d=n%10;
  printf ("%d",d);

}