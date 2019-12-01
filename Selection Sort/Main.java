#include<stdio.h>
int main()
{
  int n,i,k,min,j,temp;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(j=0;j<n-1;j++)
  {
    min=j;
      for(k=j+1;k<=n-1;k++)
      {
        if(a[k]<a[min])
        {
            min=k;
        }
      }
    temp=a[min];
    a[min]=a[j];
    a[j]=temp;
  }
  for(i=0;i<n;i++)
  {   
  printf("%d\n",a[i]);      
  }
  return 0;
}