// class pattern
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 //to print all numbers in the same line
//                 System.out.print(j);
//             }
//             System.out.println();
//         }    
//     }
// }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }    
//     }
// }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         int counter=11;
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.print(counter+" ");
//                 counter++;
//             }
//             System.out.println();
//         }
//     }
// }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         for(int i=5;i>=1;i--)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }    
//     }
// }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=5;j>=1;j--)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }    
//     }
// }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         int num=1;
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.print((j*num)+" ");
//             }
//             num++;
//             System.out.println();
//         }    
//     }
// }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }    
//     }
// }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         char ch='A'; 
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.print(ch+" ");
//             }
//             ch=(char)(ch+1);  //explict type casting from int to char
//             System.out.println();
//         }   
//     }
// }

// import java.util.Scanner;
// class pattern
// {
//     public static void main(String[] args) 
//     { 
//         @SuppressWarnings("resource")
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String str = input.next();   
//         for(int i=0;i<str.length();i++)
//         {
//             for(int j=0;j<str.length();j++)
//             {
//                 System.out.print(str.charAt(i)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 if(i==j)
//                 {
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }    
//     }
// }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 if(i==1||i==5||j==1||j==5)
//                 {
//                     System.out.print("0");
//                 }
//                 else{
//                     System.out.print("1");
//                 }
//             }
//             System.out.println();
//         }    
//     }
// }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 if(j>=i)
//                 {
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }    
//     }
// }

//  class pattern
//  {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 if(i%2==0)
//                 {
//                     System.out.print("0");
//                 }
//                 else{
//                     System.out.print("1");
//                 }
//             }
//             System.out.println();
//         }    
//     }
//  }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 if(j%2==0)
//                 {
//                     System.out.print("0");
//                 }
//                 else{
//                     System.out.print("1");
//                 }
//             }
//             System.out.println();
//         }    
//     }
// }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 if(i==1||i==5||j==1||j==5)
//                 {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }    
//     }
// }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 if(i==1||i==5||j==1||j==5||j==(5/2)+1)
//                 {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }   
//     }
// }

// class pattern
// {
//     public static void main(String[] args) 
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }    
//     }
// }

