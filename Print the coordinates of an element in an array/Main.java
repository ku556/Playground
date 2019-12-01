#include<stdio.h>
int main()
{
  int row,colm,i,j,key,found,c,d;
  scanf("%d%d",&row,&colm);
  int a[row][colm];
  for(i=0;i<row;i++)
  {
 for(j=0;j<colm;j++)
 {
   scanf("%d",&a[i][j]);
 }
  }
  scanf("%d",&key);
   for(i=0;i<row;i++)
  {
 for(j=0;j<colm;j++)
 {
   if(key==a[i][j])
   {
   found=1;
      c=i;
     d=j;
     break;
   }
 }
   }
  if(found==1)
  {
printf("(%d, %d)",c,d);
  }
  else
  {
    printf("(%d, %d)",-1,-1);
  }


  return 0;
}
