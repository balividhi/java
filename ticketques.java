import java.util.Scanner;
class Ticket
{
    public static int calculateTotal(int no_pass,int rate)
    {
        return (no_pass*rate);
    }
    public static double calculateGST(int total)
    {
        double gst = (0.18)*total;
        return gst;
    }
    public static void main(String[] args) 
    {
        int rate=1000;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter passenger count: ");
        int no_pass=sc.nextInt();
        int total = calculateTotal(no_pass,rate);
        double gst = calculateGST(total);
        double final_total = total + gst;
        System.out.println("total: "+total);
        System.out.println("GST: "+gst);
        System.out.println("Final total: "+final_total);
    }
}