//How to generate a random number in java 
// import java.util.Random;
// public class tut20 {
//     public static void main(String[] args) {
//         Random rand=new Random();
//         //Bound must be provided or else exception will be thrown 
//         int rand_int=rand.nextInt(1000);
//         double rand_double=rand.nextDouble(1000);
//         System.out.println("The random integer generated is "+rand_int);
//         System.out.println("The random double generated is "+rand_double);
//         //To generate a restricted number for integer or any other data type
//         int min=1;
//         int max=10;
//         int rand_int_restricted=rand.nextInt(min+max)+min;
//         System.out.println("The restricted integer between 1 and 10 :"+rand_int_restricted);
//     }
// }
import java.util.Random;
import java.util.Scanner;
public class tut20 {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int min=1;
        int max=2;//If you want a max number upto 3 make max=2
        int rand_int=rand.nextInt(max+min)+min;
        System.out.println("Randon number is "+rand_int);
        System.out.println("Enter the number ");
        System.out.println("Enter 1 for Rock ");
        System.out.println("Enter 2 for Paper ");
        System.out.println("Enter 3 for Scissor ");
        int num=sc.nextInt();
        if (num==rand_int) {
            System.out.println("DRAW!!!!");
        }
        else if((num==1 && rand_int==3)||(num==2 && rand_int==1)||(num==3 && rand_int==2)){
            System.out.println("YOU WON!!!!");
        }
        else{
            System.out.println("YOU LOST!!!!");
        }
    }
}
