/* 
class Employee
{
    int salary;
    String name;
    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }
    String setName(String n){
        name=n;
        return name;
    }
}
public class tut39 {
    public static void main(String[] args) {
        Employee n1=new Employee();
        n1.salary=1000;
        n1.name="Kushagra";
        System.out.println(n1.name);
        System.out.println("Changing name using setname() method");
        System.out.println(n1.setName("Noddy")); 
        System.out.println("Getting the name using getName() method "+n1.getName());
        System.out.println("Printing slary using getsalary() method : "+n1.getSalary());
    }
}
*/

/* 
class smartphone{
    void Ringing(){
        System.out.println("Ringing!!!!!");
    }
    void Vibrarting(){
        System.out.println("Vibrating!!!!!");
    }
}
public class tut39 {
    public static void main(String[] args) {
        smartphone s1=new smartphone();
        s1.Ringing();
        s1.Vibrarting();
    }
}
*/

class square{
    int length;
    int area;
    int perimeter;
    void set_length(int n){
        length=n;
    }
    void get_area(){
        System.out.println("Area is "+length*length);
    }
    void get_perimeter(){
        System.out.println("Perimeter of square is "+4*length);
    }
}

public class tut39 {
    public static void main(String[] args) {
        square s=new square();
        s.set_length(5);
        s.get_area();
        s.get_perimeter();
    }
}