import java.util.LinkedList;

public class Sort_Zero_one {
    public static LinkedList<Integer> sort(int Arr[])
    {  
        LinkedList<Integer> lobj = new LinkedList<>();
        int j = 0;
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i] == 0)
            {
                lobj.addFirst(0);
                j++;
            }
            else if(Arr[i] == 2)
            {
                lobj.addLast(2);
            }
            else
            {
                lobj.add(j,1);
            }            
        }
        return lobj;
    }
    public static void sort1(int Arr[])
    {
        int iCnt0 = 0, iCnt1 = 0, iCnt2 = 0;

        for(int i =0;i<Arr.length;i++)
        {
            if(Arr[i] == 0)
            {
                iCnt0++;
            }
            else if(Arr[i] ==1)
            {
                iCnt1++;
            }
            else
            {
                iCnt2++;
            }
        }
        for(int i=0;i<iCnt0;i++)
        {
            Arr[i] = 0;
        }
        for(int i=iCnt0; i< iCnt0 + iCnt1 ;i++)
        {
            Arr[i] = 1;
        } for(int i=iCnt0+iCnt1;i<Arr.length;i++)
        {
            Arr[i] = 2;
        }
    }
    public static void main(String args[])
    {
        int Arr[] ={ 1,0,1,0,2,1};

        LinkedList<Integer> lobj = new LinkedList<>();

        sort1(Arr);

       for(int i=0;i<Arr.length;i++)
       {
        System.out.print(Arr[i]+"\t");
       }
    }
    
}
