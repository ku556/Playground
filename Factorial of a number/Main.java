#include <stdio.h>
int main() {
	int mul=1,i=1,n;
  scanf ("%d",&n);
  while (i <= n)
  {
    mul=mul*i;
    i++;
  }
  printf ("%d",mul);
	return 0;
}