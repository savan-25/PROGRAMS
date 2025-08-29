/*
        Multi-dimentional ArrayList


 */
import java.util.ArrayList;

class ArrayList6
{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
         

        ArrayList<Integer> lobj1 = new ArrayList<>();
        lobj1.add(1); lobj1.add(2);
        lobj1.add(3); lobj1.add(4);
        lobj1.add(5);

        ArrayList<Integer> lobj2 = new ArrayList<>();
        lobj2.add(2); lobj2.add(4);
        lobj2.add(6); lobj2.add(8);
        lobj2.add(10);

        ArrayList<Integer> lobj3 = new ArrayList<>();
        lobj3.add(3); lobj3.add(6);
        lobj3.add(9); lobj3.add(12);
        lobj3.add(15);

        mainList.add(lobj1);
        mainList.add(lobj2);
        mainList.add(lobj3);

        System.out.println(mainList);

        for(int i = 0;i<mainList.size();i++)
        {
            ArrayList<Integer> l1 = mainList.get(i);
             
            for(int j = 0;j<l1.size();j++)
            {
                System.out.print(l1.get(j)+"\t");
            }
            System.out.println();
        }
    }
}