public class Longest_CommonPrefix {
    
    public static void main(String args[])
    {
        String input[] = {"flower","flow","flight"};
         
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i<input.length;i++)
        {
            char ch = input[0].charAt(i);
            boolean b = true;
          for(int j=0;j<input.length;j++)
          {
            if(ch != input[j].charAt(i))
            {
               b = false;
               break;
            }
        }
        if(b)
        {
            sb.append(ch);
        }
        }
        System.out.println(sb);
    }
}
