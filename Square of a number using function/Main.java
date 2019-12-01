#include<stdio.h>
int square(int);
int main() {
  int n,s;
   scanf ("%d",&n);
  s=square(n);
  printf ("%d",s);
  
   return 0;
}
 int square(int m)
 {
   int r;
   r=(m*m);
   return r;
 }
   