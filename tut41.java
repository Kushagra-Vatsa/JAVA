//Constructor- A member function used to intiatiate an object while creating it
//We can also do constructor overloading
 class Constructor_example {
    int id;
    String name;
    //Making an constructor
    public Constructor_example(int myId,String myName){
        id=myId;
        name=myName;
    }
    public Constructor_example(){
        id=1;
        name="Default";
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class tut41 {
    public static void main(String[] args) {
        Constructor_example c1=new Constructor_example(101, "Kushagra");
        System.out.println("Id and name of c1 are "+c1.getId()+" and "+c1.getName());
        Constructor_example c2=new Constructor_example();
        System.out.println("Id and name of c2 are "+c2.getId()+" and "+c2.getName());
    }
}
