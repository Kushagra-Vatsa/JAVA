//We can also inherit interface 
interface SampleInterface{
    void meth1();
    void meth2();
}
interface ChildSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements ChildSampleInterface{
    public void meth3(){
        System.out.println("This is method 3");
    }
    public void meth4(){
        System.out.println("This is method 4");
    }
    public void meth1(){
        System.out.println("This is method 1");
    }
    public void meth2(){
        System.out.println("this is method 2");
    }
}
public class tut58 {
    public static void main(String[] args) {
        MySampleClass msc=new MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}
