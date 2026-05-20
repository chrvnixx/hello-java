
class Calc
{   
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }
}

class AdvCalc extends Calc
{
    public int multi(int n1, int n2)
    {
        return n1 * n2;
    }
    public int div(int n1, int n2)
    {
        return n1 / n2;
    }
}

class VeryAdvCalc extends AdvCalc
{
    public double power(int n1, int n2)
    {
        return Math.pow(n1, n2);
    }
}

public class Hello
{
    public static void main(String a[])
    {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(10,15);
        int r2 = obj.sub(90, 18);
        int r3 = obj.multi(90, 18);
        double r4 = obj.power(20, 25);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}