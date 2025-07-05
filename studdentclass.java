import java.util.Scanner;
class Student
{
    int roll_no;
    String name;
    double percentage;
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        Student s2 = new Student();   //class object = memoryallocation class() (object)
        s1.getdata();
        s2.getdata(); //calling getdata
        s1.display();
        s2.display();
    }
    void getdata()
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter roll no,name and percentage: ");
        roll_no=sc.nextInt();
        name=sc.next();
        percentage=sc.nextDouble();
    }
    void display()
    {
        System.out.println(roll_no + " " + name + " " + percentage);
    }
}