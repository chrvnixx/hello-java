class Human
{
    private String name;
    private int age;

    public Human()
    {
        name = "sinatra";
        age = 18;
    }

    public Human(int a, String n)
    {
        age = a;
        name = n;
    }

    public void  setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }
}


public class Hello
{
    public static void main(String a[])
    {
        Human pes = new Human();
        Human pes1 = new Human(25, "frank");
        pes.setName("sinatra");
        pes.setAge(90);
        System.out.println(pes.getName() + " : " + pes.getAge());
        System.out.println(pes1.getName() + " : " + pes1.getAge());
        
       
    }
}