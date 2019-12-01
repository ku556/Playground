#include<stdio.h>
int main()
{
  int n,i,j,k,temp;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(j=n-1;j>=0;j--)
  {
    for(k=0;k<j;k++)
    {
       if(a[k+1]<a[k])
       {
        temp=a[k+1];
         a[k+1]=a[k];
         a[k]=temp;
       }
    }
  }
  for(i=0;i<n;i++)
  {
    printf("%d\n",a[i]);
  }

  return 0;
}