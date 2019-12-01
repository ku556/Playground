#include <stdio.h>
int main() 
{
    int n;
  scanf("%d",&n);
  int a[n],b[n],i,j=0;
  for(i=0;i<n;i++)
  {
 scanf("%d",&a[i]);
  }
   for(i=0;i<n;i++)
   {
     if(a[i]!=0)
     {
       b[j]=a[i];
       
       if(b[j]==a[i+1])
       {
         a[i+1]=0;
        
       }
       ++j;
     }
   }
	for(i=0;i<j;i++)
    {
      printf("%d ",b[i]);
    }
      
      return 0;
}