class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " " + name + " : " + price);
    }

    public static void show1(Mobile phone1)
    {
        System.out.println(phone1.brand + " " + name + " : " + phone1.price);
    }
}


public class Hello
{
    public static void main(String a[])
    {
        Mobile phone1 = new Mobile();
        phone1.brand = "apple";
        phone1.price = 1200;
        Mobile.name = "smartphone";

        Mobile phone2 = new Mobile();
        phone2.brand = "samsung";
        phone2.price = 1200;
        Mobile.name = "smartphone";

        Mobile phone3 = new Mobile();
        phone3.brand = "google pixel";
        phone3.price = 1200;
        Mobile.name = "smartphone";

        phone1.show();

        Mobile.show1(phone1);
    }
}