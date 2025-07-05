import java.util.Scanner;
class arrayofobjects
{
    public static void main(String[] args) 
    {
        System.out.println("enter number of employees");
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Employee[] e = new Employee[n];
        for(int i=0;i<e.length;i++)
        {
            e[i]=new Employee();
        }
        for(int i=0;i<e.length;i++)
        {
            e[i].getdata();
        }
        for(int i=0;i<e.length;i++)
        {
            e[i].display();
        }
    }
}
class Employee
{
    int empid;
    String empname;
    double empsalary;
    void getdata()
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id,name,salary: ");
        empid=sc.nextInt();
        empname=sc.next();
        empsalary=sc.nextDouble();
    }
    void display()
    {
        System.out.println(empid + " " + empname + " " + empsalary);
    }
}