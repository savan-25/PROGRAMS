 // Imlementation of queue using Array
 // FIFO


class QueueX
{
    public int Arr[] = new int[100];

    int start = -1, end = -1 ,currsize = 0;

    public void enqueue(int no)
    {
        if( currsize == Arr.length)
        {
             return;
        }
        if(currsize == 0)
        {
            start = start+1;
            end = end +1;

            Arr[end] = no;
            currsize++;
        }
        else
        {
          end = (end+1) % Arr.length;
          Arr[end] = no;

          currsize++;
        }
    }
    public void Display()
    {
        for( int i = 0;i<currsize;i++)
        {
            System.out.println(Arr[i]+"\t");
        }
    }
}
class Queue1
{
    public static void main(String args[])
    {
           QueueX qobj = new QueueX();

           qobj.enqueue(5);
           qobj.enqueue(5);
           qobj.enqueue(5);
           qobj.enqueue(5);

           qobj.Display();
    }
}