#include <stdio.h>
int main(){
	int i,j,count=0,n;
  scanf ("%d",&n);
  for(i=1;i <=n;i++)
  {
    for (j=1;j <=i;j++)
    {
      count=count+1;
      if (count%2==0)
        printf ("#");
      else
        printf ("*");
    }
    printf ("\n");
  }
  
  	return 0;
}