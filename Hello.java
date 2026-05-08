class Hello 
{
    public static void main(String args[])
    {
        int x =800;
        int y = 610;
        int z = 95;

        if(x > y && x > z)
            System.out.println(x);
        else if(y > x && y > z)
            System.out.println(y);
        else 
            System.out.println(z);
    }
}