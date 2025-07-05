// class addition
// {
//     void add(int a,int b)
//     {
//         int result = a + b;
//         System.out.println(" "+result);
//     }
//     void add(double a,double b)
//     {
//         double result = a + b;
//         System.out.println(" "+result);
//     }
//     void add(int a,int b,int c)
//     {
//         int result = a+b+c;
//         System.out.println(result);
//     }
// }
// class demooverloading
// {
//     public static void main(String[] args) 
//     {
//         addition obj = new addition();
//         obj.add(5.2,7.3);
//         obj.add(5,7);
//         obj.add(5,6,8);
//     }
// }

class flightbooking
{
    void bookticket()
    {
        System.out.println("   \nBooking the ticket");
    }
    void bookticket(String name)
    {
        System.out.println("Booking with name"+name);
    }
    void bookticket(int seatnumber,String name)
    {
        System.out.println("Booking with seat"+seatnumber+"and name"+name);
    }
    void bookticket(String name,int price)
    {
        System.out.println("Booking with name"+name+"and price"+price);
    }
    void bookticket(int price)
    {
        System.out.println("Booking with price"+price);
    }
}
class Methodoverloading
{
    public static void main(String[] args) 
    {
        flightbooking fb = new flightbooking();
        fb.bookticket();
        fb.bookticket(200);
        fb.bookticket(45,"mike");
        fb.bookticket("mike");
        fb.bookticket("mike",200); 
    }
}