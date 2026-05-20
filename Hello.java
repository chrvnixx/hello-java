class A {
    public void show()
    {
        System.out.println("in a show");
    }
}
 
class B extends A 
{
    public void show()
    {
        System.out.println("in b show");
    }
}
 class C extends A
 {

 }

public class Hello
{
    public static void main(String a[])
    {
       A obj = new C();
       obj.show();

       obj = new B();
       obj.show();
    }
}