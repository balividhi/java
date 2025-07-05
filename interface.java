interface A
{
    void display();
    void show();
}
class intf implements A
{
    public void display()
    {
        System.out.println("Hello");
    }
    public void show()
    {
        System.out.println("Welcome");
    }
    public static void main(String[] args) 
    {
        intf obj = new intf();
        obj.display();
        obj.show();    
    }
}