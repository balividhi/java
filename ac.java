abstract class A
{
    abstract void show();
    void display()
    {
        System.out.println("Hello World");
    }
}
class acj extends A
{
    public static void main(String[] args) 
    {
        acj obj = new acj();
        obj.display();    
    }
    void show()
    {
        System.out.println("Welcome to abstract class");
    }
}