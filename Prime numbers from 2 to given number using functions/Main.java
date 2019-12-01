#include<stdio.h>
void prime_of (int);
int main(){
    int n;
  scanf ("%d",&n);
  prime_of (n);
    return 0;
}
void prime_of (int n)
{
  int i,j,m,count;
  m=n;
  for (i=2;i <=n;i++)
  {
    count=0;
    for (j=1;j <=m;j++)
    {
      if (i%j==0)
      {
        ++count;
      }
      
    }
    if (count==2)
    {
      printf ("%d\n",i);
    
  }
  }
  
  
}