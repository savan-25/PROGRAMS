// Find the Maximum in array List
import java.util.ArrayList;
public class ArrayList3 {
    public static void main(String[] args)
     {  

        ArrayList<Integer>  lobj = new ArrayList<>();
        int iMax = Integer.MIN_VALUE;

        lobj.add(11);
        lobj.add(21);

        lobj.add(51);

        lobj.add(101);

        for( int i=0;i<lobj.size();i++)
        {
            if(iMax < lobj.get(i))
            {
                iMax = lobj.get(i);
            }
        }
        System.out.println("Maximum Number is :"+iMax);

        
    }
}
