// 

public class WeakHashMap1 {
    
    public static void main(final String args[])
    {
         Phone phone = new Phone("Apple","16 pro max");
        System.out.println(phone);
    }

}

class Phone
{
   public String brand;
  public  String model;
 
    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return " brand=" + brand + ", model=" + model ;
    }
   
    
}
