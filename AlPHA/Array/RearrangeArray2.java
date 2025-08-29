import java.util.ArrayList;

public class RearrangeArray2 {

    public static int[] Arrange(int Arr[]) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > 0) {
                pos.add(Arr[i]);
            } else {
                neg.add(Arr[i]);
            }
        }
        if (pos.size() == neg.size()) {
            for (int i = 0; i < Arr.length / 2; i++) {
                Arr[i * 2] = pos.get(i);
                Arr[i * 2 + 1] = neg.get(i);
            }
        }
         else if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                Arr[i * 2] = pos.get(i);
                Arr[i * 2 + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                Arr[index] = pos.get(i);
                index++;
            }
        }
        else if(pos.size() < neg.size())
        {
            for (int i = 0; i < pos.size(); i++) {
                Arr[i * 2] = pos.get(i);
                Arr[i *  2 + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < pos.size(); i++) {
                Arr[index] = neg.get(i);
                index++;
            }  
        }
        return Arr;
    }

    public static void main(String args[]) {
        int Arr[] = {1,2,-3,-1,-2,-3};
        int newArr[] = Arrange(Arr);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}
