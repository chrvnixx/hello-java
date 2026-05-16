class Human
{
    private String name;
    private int age;

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
        pes.setName("sinatra");
        pes.setAge(90);
        System.out.println(pes.getName() + " : " + pes.getAge());
       
    }
}