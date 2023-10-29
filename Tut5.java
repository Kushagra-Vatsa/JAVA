import java.util.Scanner;
public class Tut5 {

    public static void main(String[] args) {
        System.out.println("Taking input from the user ");
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter number 1");
        int a=ip.nextInt();
        System.out.println("Enter number 2");
        int b=ip.nextInt();
        int sum=a+b;
        System.out.println("The sum of these numbers is ");
        System.out.println(sum);
    }
}
/*
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Scanner ip=new Scanner(System.in);
        System.out.print("Enter 3 numbers ");
        int a=ip.nextInt();
        int b=ip.nextInt();
        int c=ip.nextInt();
        if(a>b && a>c){
            System.out.println("a is largest");
        }
        else if(a>b && a<c){
            System.out.println("c is largest");
        }
        else{
            System.out.println("b is largest");
        }
    }
}

 */