/*
 * WAP in java to calculate the percentage of a student . 
 * Take input from the user .
 * Marks are out of 100 , 5 subjects in total.
 */
import java.util.Scanner;
public class tut6 {

    public static void main(String[] args) {
        System.out.println("CBSE percentage calculator ");
        System.out.println("Enter the Name of the Student");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Enter the marks of "+name+":");
        System.out.println("Enter the marks of maths,science,social science,english,sanskrit : ");
        int maths=sc.nextInt();
        int science=sc.nextInt();
        int social_science=sc.nextInt();
        int english=sc.nextInt();
        int sanskrit=sc.nextInt();
        int total=maths+science+social_science+english+sanskrit;
        float percentage=(total*100)/500f;
        System.out.println("The perecentage obtained is "+percentage);

    }
}