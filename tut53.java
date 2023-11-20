//Abstract method : A method that is declared without an implementation
//Abstract Class : A class containing an abstract method is called abstract class , 
//we must write abstract before class


abstract class Base{
    public Base(){
        System.out.println("constructor of Base");
    }
    public void sayHello(){
        System.out.println("Hello ");
    }
    abstract public void greet();
}

class Derived1 extends Base{
    public void greet(){
        System.out.println("Goof morning");
    }
}

public class tut53 {
    public static void main(String[] args) {
        //Note:We cannot make object of abstract class 
        //Base b=new Base();//Error
        Derived1 d=new Derived1();
        d.greet();
    }
}

//When an abstract class is subclassed , the subclass usually provided implementation of all the 
//abstract methods in parent class . if it doesnt it must be made an abstract class
