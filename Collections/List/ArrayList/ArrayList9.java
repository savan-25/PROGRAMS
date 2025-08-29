import java.util.ArrayList;
class ArrayList9
{
    public static void main(String args[])
   {
         ArrayList<Student> aobj = new ArrayList<>();

         Student s1 = new Student("Savan", 21, 30);
         Student s2 = new Student("Radha", 20, 320);


          aobj.add(s1);
          aobj.add(s2);

          for(Student ss : aobj)
          {
            System.out.println(ss.getName());

          }

           }
}

class Student{
    private String name ;
    private int age;
    private int Roll;

    public  Student(String name,int age,int Roll)
    {
      this.name = name;
      this.age = age;
      this.Roll = Roll;
    }

    public String getName()
    {
        return name;
    }

    public int age()
    {
        return age;
    }
    public int Roll()
    {
        return Roll;
    }


}