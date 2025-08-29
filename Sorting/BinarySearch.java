//In Binary Search code we maintain three pointer 
// 1.low 2.mid 3.high
// mid = (low+high)/2
// if target > mid then low = mid+1
//else high = mid-1;

/*
 * Time Complexity:
🔸 Best Case: O(1) — if the element is at the middle in the first comparison
🔸 Worst Case: O(log n)
🔸 Average Case: O(log n)

🔸 Space Complexity: O(1) (constant space)
 */
class BinarySearch
{  
    public static boolean BinarySearch(int Arr[],int target)
    {
        int low = 0;
        int high = Arr.length-1;

        while(low <= high)
        {
            int mid = (low+high)/2;

            if(Arr[mid] == target)
            {
                System.out.println("Element is present in the Array");
                break;
            }
            else if(Arr[mid] < target)
            {
                low = mid+1;
                
            }
            else
            {
                high = mid-1;
            }
        }
    }
    public static void main(String[] args) 
    {
     boolean bRet = false;
    int Arr[] = {1,2,4,5,6};
    int target = 45;
    }

}