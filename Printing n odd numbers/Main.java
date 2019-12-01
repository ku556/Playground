#include <stdio.h>
int main() {
	int i,temp,count;
  scanf ("%d",&i);
  
  count=1;
  for (temp=1;temp <=i;temp++)
  {
    if ((count%2)!=0)
    {
      printf ("%d\n",count);
      
    }
    else
      --temp;
  count++;
}
	return 0;
}