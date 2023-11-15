/* 
//To write multiplication table of a number n using methods
import java.util.Scanner;
public class tut35 {
    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose table is needed ");
        int num=sc.nextInt();
        table(num);
    }
}
*/

/* 
//Write a program to print the following pattern using methods
public class tut35 {
    static void pattern1(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
    } 
}
*/

/* 
//Write a recursive function to calculate sum of n natural numbers
public class tut35 {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Sum of n natural numbers using recursion is "+sum(5));
    } 
}
*/


/* 
//Wap to print the following pattern using methods
public class tut35 {
    static void pattern2(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Pattern printing");
         pattern2(5);
    }
    
}
*/


/* 
//Wap to calculate average of set of numbers passed as arguments
public class tut35 {
    static int average(int ...arr){
        int Sum=0;
        for(int i=0;i<arr.length;i++){
            Sum+=arr[i];
        }
        return Sum/arr.length;
    }
    public static void main(String[] args) {
        System.out.println("Average of set of  numbers passed as arguments");
        System.out.println("Average of sum(1,2) is "+average(1,2));
        System.out.println("Average of sum(1,2,3) is "+average(1,2,3));
    }
}
*/


/* 
//Wap to calculate sum of n natural numbers using irerartive approach
import java.util.Scanner;
public class tut35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
             sum+=i;
        }
        System.out.println("Sum of first "+num+" natural numbers is "+sum);
    }
    
}
*/


/* 
//Wap to print nth term of a fibonacci series
public class tut35 {
    static int fib(int n){
        if (n==1) {
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("The nth term of a fibonacci series is ");
        System.out.println(fib(5));
    }
}
*/