#include <stdio.h>
int main() {
	int i,j,s,n;
  scanf ("%d",&n);
  int val=1;
  for (i=1;i <=n;i++)
  {
    for (s=1;s <=n-i;s++)
    {
      printf (" ");
    }
    for (j=1;j <=i;j++)
    {
      printf ("%d ",val);
      val++;
    }
    printf("\n");
    
  }
       
	return 0;
}