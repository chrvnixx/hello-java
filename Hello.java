class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 12)
            return "pen";
        return "Nothing";
    }
}


public class Hello
{
    public static void main(String a[])
    {
       Computer comp = new Computer();

       comp.playMusic();

       String pen = comp.getMeAPen(10);

       System.out.println(pen);
    }
}