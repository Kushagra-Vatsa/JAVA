//Pattern printing
// public class tut25 {
//     public static void main(String[] args) {
//         for(int i=5;i>0;i--){
//             for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

// }

//Sum of first n even numbers 
// import java.util.Scanner;
// public class tut25 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter n for sum of 1st n even number ");
//         int n=sc.nextInt();
//         int sum=0;
//         for(int i=0;i<=n;i++){
//             sum=sum+(i*2);
//         }
//         System.out.println("Sum of n even natural number is "+sum);
//     }

// }

//Multiplication table of a given number n
// import java.util.Scanner;
// public class tut25 {

//     public static void main(String[] args) {
//         System.out.println("Enter number whose table is to be printed");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(n+" X "+i+" = "+(n*i));
//         }
//     }
// }

//Multiplication table of 10 in reverse order

// public class tut25 {

//     public static void main(String[] args) {
//         int n=10;

//         for(int i=10;i>=1;i--){
//             System.out.println(n+" X "+i+" = "+(n*i));
//         }
//     }
// }

//Factorial using for loops
// import java.util.Scanner;

// public class tut25 {
//     public static void main(String[] args) {
//         System.out.println("Enter the number ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if (n == 1 || n == 0) {
//             System.out.println("0");
//         } else {
//             int fact = 1;
//             for (int i = 1; i <= n; i++) {
//                 fact = fact * i;
//             }
//             System.out.println("Factorial of the given number is " + fact);
//         }
//     }
// }

//Factorial using while loop
// import java.util.Scanner;

// public class tut25 {
//     public static void main(String[] args) {
//         System.out.println("Enter the number ");
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int i=1;
//         int fact=1;
//         while (i<=n) {
//             fact=fact*i;
//             i++;
//         }
//         System.out.println("Factorial using while loop is "+fact);
//     }
// }

//WAP to calculate sum of numbers occuring in multiplication table of 8

// public class tut25 {
//     public static void main(String[] args) {
//         int n=8;
//         int sum=0;
//         for(int i=1;i<=10;i++){
//             sum=sum+(i*8);
//         }
//         System.out.println("sum of numbers occuring in multiplication table of 8 is "+sum);
//     }
    
// }