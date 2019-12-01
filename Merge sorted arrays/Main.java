#include <stdio.h>
int main() 
{
 int m,n,j=0,k=0,i,t=0;
  scanf("%d%d",&m,&n);
  int a[m],b[n],c[m+n];
  for(i=0;i<m;i++)
  {
    scanf("%d",&a[i]);
  }
  for(j=0;j<n;j++)
  {
scanf("%d",&b[j]);
  }
  i=0;j=0;
  while((i<m) && (j<n))
  {
 if(a[i]<b[j])
 {
   c[t]=a[i];
   ++i;
   
 }
  else
    {
 c[t]=b[j];
      ++j;
      
    }
   ++t; 
  }
  if(i>=m)
  {
    while(j<n)
    {
 c[t]=b[j];
      ++j;
      ++t;
    }
    
  }
  if(j>=n)
  {
    while(i<m)
    {
  c[t]=a[i];
      ++i;
      ++t;
    }
    
  }
  for(i=0;i< (m+n) ;i++)
  {
 printf("%d ",c[i]);
  }
  return 0;
}