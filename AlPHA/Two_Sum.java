/*
  Input [2,7,11,12]
  target : 9

  Output [1,2]
 */

 import java.util.HashMap;

 // Step 1: Define the custom exception
 class ElementNotFound extends Exception {
     public ElementNotFound(String message) {
         super(message);
     }
 }
 
 class Two_Sum {


        // Use First Brute Force approach
        public static int[] twosumB(int nums[],int target)
        {   
            int Ans[] = new int[2];
            // Step1 : take loop from 0 to n(number of rows)
            for (int i = 0; i < nums.length; i++) {
                //Step 2: take loop from i+1 to n
                for (int j = i+1; j < nums.length; j++) {

                    // Step 3: check pair Sum is equal to target
                    if(nums[i] + nums[j] == target)
                    {
                    Ans[0] = i+1;
                    Ans[1] = j+1;
                    break;
                    }
                 } 
            }
            return Ans;
        }
     // Step 2: Method to find two sum using HashMap
     public static int[] twosum(int[] Arr, int target) throws ElementNotFound {
         HashMap<Integer, Integer> map = new HashMap<>();
 
         for (int i = 0; i < Arr.length; i++) {
             int Complement = target - Arr[i];
 
             if (map.containsKey(Complement)) {
                 return new int[] { map.get(Complement), i }; // Return indices
             }
 
             map.put(Arr[i], i); // Store current number and its index
         }
 
         // If no solution is found, throw the custom exception
         throw new ElementNotFound("Arguments not Found");
     }

     
 
     public static void main(String[] args) {
         int[] Arr = {2, 7, 11, 12}; // Input array
         int target = 9; // Target sum
 
         try {
             // Step 3: Call the twosum method
             int[] result = twosum(Arr, target);
             System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
         } catch (ElementNotFound e) {
             // Step 4: Handle the custom exception
             System.out.println("Exception: " + e.getMessage());
         }
     }
 }
 