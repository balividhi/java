// class test
// {
//     test()
//     {
//         System.out.println("\nConstructor");
//     }
// }
// class democonstructor
// {
//     @SuppressWarnings("unused")
//     public static void main(String[] args) 
//     {
//         test t = new test();
//     }
// }

class country
{
    String language;
    int countrycode;
    country()
    {
        language="english";
    }
    country(String lang)
    {
        language = lang;
    }
    country(String lang,int councode)
    {
        language = lang;
        countrycode = councode;
    }
    void display()
    {
        System.out.println("\nyou have selected language "+language);
        System.out.println("country code is"+countrycode
        );
    }
}
class democonstructor
{
    public static void main(String[] args) 
    {
        country c1 = new country();
        country c2 = new country("hindi");
        country c3 = new country("german",91);
        c1.display();  
        c2.display();  
        c3.display();
    }
}