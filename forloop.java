//from 1 to 10
// class forloop 
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=10;i++) 
//         {
//             System.out.println(" "+i);
//         }
//     }
// }

// class forloop
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=10;i++)
//         {
//             if(i%2==0)
//             {
//                 System.out.println(" "+i);
//             }
//         }    
//     }
// }

//reverse from 10 to 1
// class forloop
// {
//     public static void main(String[] args) 
//     {
//         for(int i=10;i>=1;i--)
//         {
//             System.out.println(" "+i);
//         }    
//     }
// }

//table of 5
// class forloop
// {
//     public static void main(String[] args) 
//     {
//         int num = 5;
//         System.out.println("The table of 5 is: ");
//         for(int i=1;i<=10;i++)
//         {
//             System.out.println(num+"*"+i+"="+(num*i));
//         }    
//     }
// }

//1 10 2 9 3 8 4 7 5 6
// class forloop
// {
//     public static void main(String[] args) 
//     {
//         for (int i=1;i<=5;i++)
//         {
//             System.out.println(" "+i);
//             System.out.println(" "+(11-i));
//         }    
//     }
// }

//sum of 1 to 10
// class forloop
// {
//     public static void main(String[] args) 
//     {
//         int sum=0;
//         for(int i=1;i<=10;i++)
//         {
//             sum=sum+i;
//         }    
//         System.out.println(" "+sum);
//     }
// }

// class forloop
// {
//     public static void main(String[] args) 
//     {
//         int sum=0;
//         for(int i=1;i<=50;i++)
//         {
//             if(i%5==0 || i%3==0)
//             {
//                 sum=sum+i;
//             }
//         }
//         System.out.println(" "+sum);
//     }
// }

// class forloop
// {
//     public static void main(String[] args) 
//     {
//         int sum=0;
//         for(int i=1;i<=10;i++)
//         {
//             if(i%3==0)
//             {
//                 sum=sum-i;
//             }
//             else{
//                 sum=sum+i;
//             }
//         } 
//         System.out.println(" "+sum);   
//     }
// }

//1/2+2/3+3/4....
// class forloop
// {
//     public static void main(String[] args) 
//     {
//         double sum=0;
//         for(double i=1;i<=10;i++)
//         {
//             sum=sum+i/(i+1);
//         }  
//         System.out.println(" "+sum);  
//     }
// }

//10+1+9+2....
// class forloop
// {
//     public static void main(String[] args) 
//     {
//         int sum=0;
//         for(int i=1;i<=5;i++)
//         {
//             sum=sum+(11-i)+i;
//         }    
//         System.out.println(" "+sum);
//     }
// }

//1^2+2^2+3^2....
// class forloop
// {
//     public static void main(String[] args) 
//     {
//         int sum=0;
//         for(int i=1;i<=10;i++)
//         {
//             sum=sum+(i^2);
//         }  
//         System.out.println(" "+sum);  
//     }
// }

//factorial
// import java.util.Scanner;
// class factorial
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         int fact=1;
//         System.out.println("Enter number: ");
//         int num=input.nextInt();
//         for(int i=1;i<=num;i++)
//         {
//             fact=fact*i;
//         }
//         System.out.println("Factorial is"+fact);    
//     }
// }

//factors
// import java.util.Scanner;
// class factors
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("enter number:");
//         int num = input.nextInt();
//         System.out.println("the factors are: ");
//         for(int i=1;i<=num;i++)
//         {
//             if(num%i==0)
//             {
//                 System.out.println(" "+i);
//             }
//         }
//     }
// }

//perfect or not
// import java.util.Scanner;
// class perfect
// {
//     public static void main(String[] args) 
//     {
//     int sum=0;
//     @SuppressWarnings("resource")
//     Scanner input = new Scanner(System.in);
//     System.out.println("\nEnter number: ");
//     int num=input.nextInt();
//     System.out.println("perfect or not");
//     for(int i=1;i<num;i++)
//     {
//         if(num%i==0)
//         {
//             sum=sum+i;
//         }
//     }
//     if(sum==num)
//     {
//         System.out.println("it is perfect");
//     }
//     else{
//         System.out.println("it is not equal");
//     }
//     }
// }

//prime or not
// import java.util.Scanner;
// class prime
// {
//     public static void main(String[] args) 
//     {
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("\nEnter number:");    
//         int num = input.nextInt();
//         int count=0;
//         for(int i=1;i<=num;i++)
//         {
//             if(num%i==0)
//             {
//                 count++;
//             }
//         }
//         if(count==2)
//         {
//             System.out.println("it is prime");
//         }
//         else{
//             System.out.println("not prime");
//         }
//     }
// }

//squares of 2
// class squareoftwo
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=100;i=i*2)
//         {
//             System.out.println(" "+i);
//         }    
//     }
// }