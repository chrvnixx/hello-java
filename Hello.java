class Calculator
{
    int num =10;
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 * n3;
    }
}


public class Hello
{
    public static void main(String a[])
    {
        int num1 = 50;
        int num2 = 73;
        int num3 = 89;
        Calculator calc = new Calculator();
        Calculator calc1 = new Calculator();


        int result = calc.add(num1, num2, num3);

        System.out.println(calc1.num);
    }
}