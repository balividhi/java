//implicit type casting
// class impicittypecasting
// {
//     public static void main(String[] args) 
//     {
//         int a = 10;
//         double d  =  a;  //impicit type casting
//         System.out.println("\ninteger: "+a);
//         System.out.println("Implicit type casting: "+d);  
//     }
// }

//operators precedence using operators
// class operatorsprecedence
// {
//     public static void main(String[] args) 
//     {
//         int a=15,b=5,c=3,result;
//         result=a/c*b+b*a/c-a*c;
//         System.out.println("\n"+result);    
//     }
// }

//pre increment
// class preincrement
// {
//     public static void main(String[] args) 
//     {
//         int a=5;
//         int b=++a;
//         System.out.println("\n"+a);
//         System.out.println(b);    
//     }
// }

//post increment
// class postincrement
// {
//     public static void main(String[] args) 
//     {
//         int a=5;
//         int b=a++;
//         System.out.println("\n"+a);
//         System.out.println(b);    
//     }
// }

//operators precedence using logical operators
// class operatorsprecedence
// {
//     public static void main(String[] args) 
//     {
//         boolean b1=true,b2=false,b3=true;
//         boolean result=b1&&b2||b3&&b2||b2||b3&&b1;
//         System.out.println("\n"+result);    
//     }
// }

//input from user
// import java.util.Scanner;
// class inputfromuser
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter a number");
//         int num1 =  input.nextInt();
//         System.out.println("You have entered"+num1);   
//         System.out.println("Please enter your name");
//         String name = input.next();
//         System.out.println("You have entered"+name);
//     }
// }