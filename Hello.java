import java.util.ArrayList;

class A
{   
    public void show()
    {
        System.out.println("in a show");
    }
    public void config()
    {
        System.out.println("in a config");
    }
   
}
class B extends A
{   
   public void show()
   {
    System.out.println("in b show");
   }
   
}



public class Hello
{
    public static void main(String a[])
    {
        ArrayList list = new ArrayList();
        B obj = new B();
        obj.show();
    }
}