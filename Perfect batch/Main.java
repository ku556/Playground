/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases./* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
void batchof(int n,int a[]);
int main()
{
  int i,n;
  scanf ("%d",&n);
  int a[n];

  for (i=0;i <n;i++)
  {
    scanf ("%d",&a[i]);
  }
  batchof (n,a);
  return 0;
}
void batchof(int n,int a[])
{
  int i,sum1=0,sum2=0;
  for (i=0;i < (n/2) ;i++)
  {
    sum1=sum1+a[i];
    
            
  }
  for (i=(n/2);i < n;i++)
  {
    sum2=sum2+a[i];
   
  }
  if (sum1==sum2)
  {
    printf ("Perfect Batch");
  }
  else
  {
    printf ("Not a Perfect Batch");
  }
  
  
  
}