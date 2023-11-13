//WAP to find wheather a student is pass or fail , if it requires total 40% and 
//atleast 33% in each subject 
// import java.util.Scanner;
// public class tut19 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the marks obtained in English");
//         int eng=sc.nextInt();
//         System.out.println("Enter the marks obtained in Maths");
//         int math=sc.nextInt();
//         System.out.println("Enter the marks obtained in Hindi");
//         int hindi=sc.nextInt();
//         int total=eng+math+hindi;
//         float per=((float)total/300)*100;
//         System.out.println("The total marks obtained is "+total+" and percentage is "+per);
//         if (eng>33 && hindi >33 && math>33 && per>40) {
//             System.out.println("You are pass");
//         }
//         else{
//             System.out.println("You are fail");
//         }
//     }
// }


//WAP to calculate income tax as per the salary slab
import java.util.Scanner;
public class tut19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Salary in rupees ");
        float salary=sc.nextFloat();
        float tax=0;
        if (salary < 25000) {
            System.out.println("No tax applicable ");
        }
        else if(salary >250000 || salary<500000){
            tax=(float)0.05*(salary-25000f);
            System.out.println("Payable tax is "+tax);
        }
        else if(salary>500000 || salary<100000){
            tax=0.05f*250000f;
            tax=tax+(float)0.2*(salary-500000);
            System.out.println("Your payable tax is "+tax);
        }
        else{
            tax=(float)0.05*250000;
            tax+=500000*0.2;
            tax=(float)(tax+(0.3*(salary-100000)));
        }
        
    }
    
}