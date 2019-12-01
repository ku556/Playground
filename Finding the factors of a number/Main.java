#include <stdio.h>
int main() {
	int i=1,num;
  scanf ("%d",&num);
  while (i <= num)
  {
    if ((num%i)==0)
    {
      printf ("%d\n",i);
      i++;
    }
    else
      i++;
      
   
 
  }
    
	return 0;
}