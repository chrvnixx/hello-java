abstract class Car
{
    abstract public void drive();
    public void playMusic()
    {
        System.out.println("playing music...");
    }
}

class Benz extends Car
{
    public void drive()
    {
        System.out.println("driving");
    }
}


public class Hello
{
    public static void main(String a[])
    {
        Benz obj = new Benz(){
            public void drive()
            {
                System.out.println("driving...");
            }
        };
        obj.drive();
        obj.playMusic();
    }
}