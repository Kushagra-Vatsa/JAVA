//Dynamic method dispatch
class Phone{
    public void greet(){
        System.out.println("Welcome to Phone");
    }
    public void On(){
        System.out.println("Turning on Phone");
    }
}
class Smartphone extends Phone{
    public void swagat(){
        System.out.println("SmartPhone me aapka swagat hai");
    }
    public void On(){
        System.out.println("Turning on Smartphone");
    }
}
public class tut49 {
    public static void main(String[] args) {
        //Phone p=new Phone(); Allowed
        //Smartphone sp=new Smartphone(); Allowed
        
        Phone obj=new Smartphone();// Syntax : Super_class obj=new Sub_class();
        //Smartphone sp=new Phone(); Not allowed
        //We can only call those methods that are present in Superclass and overridden method in Subclass
        obj.greet();
        obj.On();
        //obj.swagat(); We cannot call any other method  , than the overridden method

    }
}
