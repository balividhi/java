import java.util.Scanner;
class Demo
{
    public static void main(String[] args) 
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.getdata();
        e2.getdata();
        e3.getdata();
        if(e1.empsalary>e2.empsalary && e1.empsalary>e3.empsalary)
        {
            e1.display();
        }     
        else if(e2.empsalary>e1.empsalary && e2.empsalary>e3.empsalary)
        {
            e2.display();
        }
        else{
            e3.display();
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
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter id,name and salary: ");
        empid=sc.nextInt();
        empname=sc.next();
        empsalary=sc.nextDouble();
    }
    void display()
    {
        System.out.println(empid + " " + empname + " " + empsalary);
    }
}