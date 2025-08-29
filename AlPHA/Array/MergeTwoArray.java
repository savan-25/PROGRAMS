import java.util.Arrays;

public class MergeTwoArray {

    public static void MergeArr(int Arr1[],int Arr2[],int n,int m)
    {
        int ptr1 = 0;
        int ptr2 = 0;
        int index = 0;

        int Arr3[] = new int[m+n];

        while (ptr1 < n && ptr2 < m) {

            if(Arr1[ptr1] <= Arr2[ptr2])
            {
                Arr3[index] = Arr1[ptr1];
                ptr1++;
                index++;

            }
            else
            {
                Arr3[index] = Arr2[ptr2];
                ptr2++;
                index++;
            }
            
        }
        // if pointer reches the end
        while (ptr1 < n) {
            Arr3[index++] = Arr1[ptr1++];
        }

        // if left
        while (ptr2 < m) {
            Arr3[index] = Arr2[ptr2++];
        }
        
        for(int i=0;i<n+m;i++)
        {
            if(i < n)
            {
                Arr1[i] = Arr3[i];
            }
            else
            {
                Arr2[i-n] = Arr3[i];
            }
        }
    }
     
    public static void SortArr(int Arr[] )
    {
        Arrays.sort(Arr);
    }
    // without using extra space
    public static void MergeArr1(int Arr1[],int Arr2[],int n,int m)
    {
        int ptr1 = n-1;
        int ptr2 = 0;

       while (Arr1[ptr1] > Arr2[ptr2]) {
        
        if(Arr1[ptr1] >  Arr2[ptr2])
        {
            int temp = Arr1[ptr1];
            Arr1[ptr1] = Arr2[ptr2];
            Arr2[ptr2] = temp;
            ptr1--;
            ptr2++;
        }
       }
       SortArr(Arr1);
       SortArr(Arr2);
    }
    public static void main(String[] args) {
        int Arr1[] = {1,4,8,10};
        int Arr2[] = {2,3,9};

        int n = 4;
        int m = 3;

        MergeArr1(Arr1,Arr2,n,m);

       System.out.println("After Merging two Array :");
       System.out.println("First sort Array");
       for(int i=0;i<Arr1.length;i++)
       {
        System.out.print(Arr1[i]+"\t");
       }
       System.out.println();
       System.out.println("Second Array is");
       for(int i=0;i<Arr2.length;i++)
       {
        System.out.print(Arr2[i]+"\t");
       }
    }
}
