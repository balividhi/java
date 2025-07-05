// import java.util.Scanner;
// class months
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter a month number");
//         int month = input.nextInt();    
//         switch (month) {
//             case 1:
//             case 3:
//             case 5:
//             case 7:
//             case 8:
//             case 10:
//             case 12:
//                 System.out.println("there are 31 days");
//                 break;
//             case 2:
//                 System.out.println("there are 28/29 days");
//                 break;
//             case 4:
//             case 6:
//             case 9:
//             case 11:
//                 System.out.println("there are 30 days");
//                 break;
//             default:
//                 System.out.println("please enter between 1 to 12 only");
//                 break;
//         }
//     }
// }

//greatest of three numbers
// import java.util.Scanner;
// class maxnum
// {
//     public static void main(String[] args) 
//     { 
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter first number"); 
//         int num1 = input.nextInt();
//         System.out.println("enter second number");
//         int num2 = input.nextInt();
//         System.out.println("Enter third number");
//         int num3 = input.nextInt();
//         if(num1>num2 && num1>num3)
//         {
//             System.out.println("Num1 is greater");
//         }   
//         else if(num2>num1 && num2>num3)
//         {
//             System.out.println("Num2 is greater");
//         }
//         else{
//             System.out.println("Num3 is greater");
//         }
//     }
// }

//calculator
// import java.util.Scanner;
// class calculator
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter first number");
//         int num1  = input.nextInt();
//         System.out.println("Enter second number");
//         int num2 = input.nextInt();
//         System.out.println("Enter choice");
//         String choice = input.next();
//         switch (choice) {
//             case "add":
//                 System.out.println("result is "+ (num1+num2));
//                 break;
//             case "sub":
//                 System.out.println("result is"+ (num1-num2));
//                 break;
//             case "mul":
//                 System.out.println("Result is"+ (num1*num2));
//                 break;
//             case "div":
//                 System.out.println("result is"+(num1/num2));        
//             default:
//                 System.out.println("Enter valid choice");
//                 break;
//         }
//     }
// }

// import java.util.Scanner;
// class check
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         int dbusername = 3312;
//         int dbpassword = 1234;
//         System.out.println("\nEnter user name");
//         int un = input.nextInt();
//         System.out.println("Enter password");
//         int pw = input.nextInt();
//         if (un==dbusername && pw==dbpassword) {
//             System.out.println("login successful");
//         }  
//         else if(un!=dbusername && pw==dbpassword)
//         {
//             System.out.println("incorrect username");
//         }  
//         else if(un==dbusername && pw!= dbpassword)
//         {
//             System.out.println("incorrect password");
//         }
//         else{
//             System.out.println("both incorrect");
//         }
//     }
// }

//number of notes
import java.util.Scanner;
class countnotes
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter the amount"); 
        int amount = input.nextInt();
        int result = amount/500;
        if (result>0) {
            System.out.println("there are"+result+"notes of 500");
            amount=amount%500;
        }   
         result = amount/100;
        if (result>0) {
            System.out.println("there are"+result+"notes of 100");
            amount=amount%100;
        }
         result = amount/20;
        if (result>0) {
            System.out.println("there are"+result+"notes of 20");
            amount=amount%20;
        }
    }
}