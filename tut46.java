class Base1 {
    public Base1() {
        System.out.println("I am in Base class constructor");
    }
    public Base1(int n){
        System.out.println("I am an overloaded Base constructor with n as "+n);
    }
}
class Derived1 extends Base1 {

    public Derived1() {
        super(0);
        System.out.println("I am in Derived class constructor");
    }
    public Derived1(int x,int y){
        super(x);
        System.out.println("I am an overloaded Derived constructor with x and y as "+x+" and "+y);
    }
}
class ChildofDerived extends Derived1{
    public ChildofDerived(){
        System.out.println("I am in childofDerived constructor");
    }
    public ChildofDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am inside overloaded constructor of childofDerived with z as "+z);
    }
}
public class tut46 {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        /*
         * Note:If a constructor is present in base class and an object
           of Derived class is made , they constructor of base class is called .
         * Even if there is a constructor present in Derived class then also
           during object creation constructor of Base class is called first then constructor of derived
           class is called.
         *  If there are overloaded constructors in Base class it will run the constructor 
           with matching paremeters  
         * If we want to run overloaded constructor of Base class with object of derived class we use 
         * super keyword 
        */   
        Derived1 d1=new Derived1();
        System.out.println("----------------------------------------------");
        Derived1 d2 = new Derived1(1,2);
        System.out.println("----------------------------------------------");
        ChildofDerived cd1=new ChildofDerived();
        System.out.println("----------------------------------------------");
        ChildofDerived cd2=new ChildofDerived(1,2,3);
    }
}


//Example 
/* 
class Parent{
        String name1="Ram Tapasya Singh";
        public Parent(){
            System.out.println("Parent name is "+name1);
        }
    }
class Child extends Parent{
        String name2="Ajay Kumar ";
        public Child(){
            System.out.println("Child name is "+name2);
        }
    }
class Grandchild extends Child{
        String name3="Kushagra Vatsa";
        public Grandchild(){
            System.out.println("Grandchild name is "+name3);
        }
    }
public class tut46 {
    public static void main(String[] args) {
        //Parent p=new Parent();
        Grandchild g=new Grandchild();
    }
}
*/