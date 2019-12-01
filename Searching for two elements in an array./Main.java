#include<stdio.h>
int main()
{
  int n,i,e1,e2,f1=0,f2=0;
  scanf ("%d",&n);
  int a[n];
  for (i=0;i <n;i++)
  {
    scanf("%d\t",&a[i]);
  }
  
  scanf ("%d",&e1);
  scanf ("%d",&e2);
  for (i=0;i <n;i++)
  {
    if (e1==a[i])
    {
      printf("%d\n",i);
      f1=1;
    }
    else if(e2==a[i])
    {
      printf("%d\n",i);
      f2=1;
    }
   
  }
  if ((f1!=1) || (f2!=1))
  {
    printf ("%d",-1);
  }
    
    
  return 0;
}