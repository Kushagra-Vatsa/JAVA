//Method overriding
class A{
    public void method1(){
        System.out.println("This is method1 of Base class/class A");
    }
    public void method2(){
        System.out.println("This is method 2 of Base class/class A");
    }
}
class B extends A{
    public void method2(){
        System.out.println("This is method 2 of Derived class/class B");
    }
}
public class tut48 {
    public static void main(String[] args) {
        A a=new A();
        a.method1();
        a.method2();

        B b=new B();
        b.method2();
    }
}
