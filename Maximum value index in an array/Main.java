// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
void largeindex (int a[],int n);
int main()
{
  int i,n;
  scanf ("%d",&n);
  int a[n];
  for (i=0;i < n;i++)
  {
    scanf ("%d",&a[i]);
  }
  largeindex (a,n);
  
   return 0;
}
void largeindex (int a[],int n)
{
  int large=0 ,max=0,i;
  large=a[0];
  for (i=1;i <n;i++)
  {
    if (large < a[i])
    {
     
      max=i;
    }
    
  }
  printf ("%d",i-1);
  
  
}