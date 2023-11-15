//Making our own custom class 
//Note a java program can only have one public class
class Student{
     int id;
     String name;
     void print_details(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
        System.out.println("-------------------------");
    }
}
public class tut38 {
    public static void main(String[] args) {
        Student n1=new Student();//Instantiating a new Student object
         
        //Setting the attributes
        n1.id=101;
        n1.name="Kushagra";

        //Printing the attributes
        //System.out.println(n1.id);
        //System.out.println(n1.name);

        //We can also use methods of class to print the details 
        n1.print_details();
         

        Student n2=new Student();
        n2.id=102;
        n2.name="Noddy";
        n2.print_details();
    }
}
