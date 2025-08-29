import java.util.ArrayList;
import java.util.List;


class Practice 
{   
    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == s) {
                    result.add(new int[]{arr[i], arr[j]});
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 6;
        List<int[]> pairs = pairSum(arr, sum);
        for (int[] pair : pairs) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
        }
    }
    
}