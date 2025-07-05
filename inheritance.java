class A
{
    int x=5;
}
class B extends A
{
    int y=7;
    int result=0;
    void add()
    {
        result=x+y;
        System.out.println(" "+result);
    }
}
class C extends B
{
    double average=0.0;
    void calcavg()
    {
        average = result/2.0;
        System.out.println(" "+average);
    }
}
class inheritance
{
    public static void main(String[] args) 
    {
        C objC = new C();
        objC.add();
        objC.calcavg();
    }
}