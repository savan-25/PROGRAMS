//Print The Below Layout
/*  ex the Given Array is[2,4,5,7]
  output (2,4) (2,5) (2,7)
         (4,5) (4,7)
         (5,7)
*/

#include<stdio.h>
#include<stdlib.h>


void Display(int Arr[],int iSize)
{
    for(int i=0;i<iSize;i++)
     { 
        for(int j=i+1;j<iSize;j++)
        {
            printf("(%d,%d)",Arr[i],Arr[j]);
        }
        printf("\n");
     }
}
int main()
{
    int iLength = 0;
    int *p = NULL;

    printf("Enter the Length of Array : ",iLength);
    scanf("%d",&iLength);

    p = (int *) malloc (iLength*sizeof(int));
    
    printf("Enter the Element:");
    for(int i =0;i<iLength;i++)  
    {
         scanf("%d",&p[i]);
    }
    printf("\n");

    printf("our Array is:");
    for(int i =0;i<iLength;i++)
    {
        printf("%d\t",p[i]);
    }
    printf("\n");

    Display(p,iLength);

}