// import java.util.Scanner;
// class addition
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter first number: ");
//         int num1 = input.nextInt();
//         System.out.println("Enter second number: ");
//         int num2 = input.nextInt();
//         System.out.println("sum: "+(num1+num2));
//     }
// }

// import java.util.Scanner;
// class average
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter first number");
//         int num1 = input.nextInt();
//         System.out.println("Enter second number");
//         int num2=input.nextInt();
//         System.out.println("enter third number");
//         int num3 = input.nextInt();
//         System.out.println("The average is: "+((num1+num2+num3)/3));    
//     }
// }

// import java.util.Scanner;
// class square
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter number: ");
//         int num = input.nextInt();
//         System.out.println("Square is: "+(num*num));     
//     }
// }

//simple interest
// import java.util.Scanner;
// class simpleinterest
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter principle amount: ");
//         double pi = input.nextDouble();
//         System.out.println("Enter rate of interest:");
//         double roi = input.nextDouble();
//         System.out.println("Enter no of years:");
//         int nof = input.nextInt();
//         double interest = (pi*roi*nof)/100;
//         System.out.println("the interest is: "+ interest);
//     }
// }

//age in years,months,days,minutes
// import java.util.Scanner;
// class age
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter your age: ");
//         int age = input.nextInt();
//         System.out.println("Your age is: "+ age);
//         System.out.println("you are "+(age*12)+" months old");
//         System.out.println("you are "+(age*365)+" days old");
//         System.out.println("you are "+(age*365*60)+" minutes old");
//     }
// }

// import java.util.Scanner;
// class billwithdiscount
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter bill amount: ");
//         int billamt = input.nextInt();
//         System.out.println("Enter discount percentage: ");
//         int dp = input.nextInt();
//         int discountamt = (billamt*dp)/100;
//         int finalbill = billamt - discountamt;
//         System.out.println("final amt is: "+finalbill);    
//     }
// }

//swap two variables
// import java.util.Scanner;
// class swap
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter first number");
//         int num1 = input.nextInt();
//         System.out.println("Enter second number");
//         int num2 = input.nextInt();
//         int temp;
//         //swap values
//         temp = num1;
//         num1 = num2;
//         num2 = temp;
//         System.out.println("num1 "+num1);
//         System.out.println("num2 "+num2);
//     }
// }

//swap values without third variable
// import java.util.Scanner;
// class swap
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter first number");   
//         int num1 = input.nextInt();
//         System.out.println("Enter second number");
//         int num2 = input.nextInt();
//         //swap values
//         num1 = num1+num2;
//         num2=num1-num2;
//         num1=num1-num2;
//         System.out.println("num1 is: "+num1);
//         System.out.println("num2 is"+num2);
//     }
// }

//swap using mul and div
// import java.util.Scanner;
// class swap
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nenter first number: ");
//         int num1 = input.nextInt();
//         System.out.println("Enter second number: ");
//         int num2 = input.nextInt();
//         //swap value
//         num1=num1*num2;
//         num2=num1/num2;
//         num1=num1/num2;
//         System.out.println("num1 "+num1);
//         System.out.println("num2 "+num2);    
//     }
// }

//convert from fahrenheit to celsius
// import java.util.Scanner;
// class temp
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input  = new Scanner(System.in);
//         System.out.println("\nEnter temperatue in fahrenheit");
//         int tf = input.nextInt();
//         int cel = (tf-32)*5/9;
//         System.out.println("temp in celsius is"+cel);    
//     }
// }

//convert megabytes into kb(1MB=1024KB)
// import java.util.Scanner;
// class mbtokb
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter in MB");
//         int mb = input.nextInt();
//         int kb = 1024*mb;
//         System.out.println("ans is "+kb);    
//     }
// }

//convert days to seconds
// import java.util.Scanner;
// class daytosec
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter numbe of days");
//         int days = input.nextInt();
//         int sec = days*24*60*60;
//         System.out.println("in sec "+ sec);    
//     }
// }