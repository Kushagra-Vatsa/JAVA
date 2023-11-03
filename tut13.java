//String is a collection of characters.
//String is a class but can be used like a data type.
import java.util.Scanner;
public class tut13 {

    public static void main(String[] args) {
        String First_name=new String("Kushagra");//It can be instantiated as follows
        String Last_name="Vatsa";//Can be declared like  a data type
        System.out.println("The full name is "+First_name+" "+Last_name);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter father Name ");
        String Father_Name=sc.nextLine();
        System.out.println("Father name is "+Father_Name);
    }
}
