#include <stdio.h>
int main() {
    int i,j,n,val;
  scanf ("%d",&n);
  val=n;
  for (i=1;i <=n;i++)
  {
    for (j=val;j>=1;--j)
    {
      printf ("%d",j);
      
    }
     --val;
    printf ("\n");
              
    
  }
	return 0;
}