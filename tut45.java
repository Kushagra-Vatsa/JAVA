//Java doesnt support multiple inheritance like C++
class Base{
    //Base class is also called Super class 
    int x;
    public int getX() {
        System.out.println(x);
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base and setting x now ");
        this.x = x;
    }
    public void display(){
        System.out.println("Inside display function of Base class ");
    }
}
class Derived extends Base{
    //Derived class is also known as sub class  
    public int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am setting y now ");
        this.y = y;
    }
    
}
public class tut45 {
    public static void main(String[] args) {
        //Creating an object of Base class
        Base b=new Base();
        b.setX(5);
        b.getX();
        b.display();

        //Creating an object of Derived class 
        Derived d=new Derived();
        d.setY(40);
        d.getY();
        //Note we can also use Base class attributes and methods using Derived class object
        d.setX(50);
        d.getX();

        //However we cannot access attributes and methods of Derived using Base class object
    }
}
