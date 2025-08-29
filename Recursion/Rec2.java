// There are two ways in recursion parameterized recursion and functional recursion


//Q Reverse the Array using recursion
public class Rec2 {
    
    public static void Rev(int Arr[],int i)
    {  
        
        if( i ==Arr.length/2)
        {
            return;
        }
        int temp = Arr[i];
        Arr[i] = Arr[Arr.length-i-1];
        Arr[Arr.length-i-1] = temp;
        
        i++;
        

        Rev(Arr, i);
    }
    
    public static void main(String[] args) {
        int Arr[] = {1,2,3,4,5,6,7};
        
        Rev(Arr,0);

        for(int x:Arr)
        {
            System.out.print(x+"\t");
        }
    }
    
}
