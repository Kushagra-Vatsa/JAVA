//Example of interface
interface  Bicyle {
    void applyBrake(int decrement);
    void speedUp(int increment);
    int var=3;//We can also create properties in interface
}
interface ModernBicycle {
    void blowHorn();
}
class AvonCycle implements Bicyle,ModernBicycle{
    int speed=10;
    //Note: We have to make every method present in interface as public when implementing in a class
    public void applyBrake(int decrement){
        speed=speed-decrement;
        System.out.println("Applying brakes ");
        System.out.println("Current speed is "+speed);
    }
    public void speedUp(int increment){
        speed=speed+increment;
        System.out.println("Applying accelerator ");
        System.out.println("Current speed is "+speed);
    }
    public void blowHorn(){
        System.out.println("Blow Horn");
    }
}
public class tut55 {
    public static void main(String[] args) {
        AvonCycle ac=new AvonCycle();
        ac.speedUp(5);
        ac.applyBrake(3);
        ac.blowHorn();
        System.out.println("-------------------------------");
        Bicyle bc=new AvonCycle();//Dynamic method dispatch
        bc.applyBrake(1);
        bc.speedUp(1);
        //bc.blowHorn();Will give error as blowhorn not present in Bicycle
        System.out.println("-------------------------------");
        //We can access properties and variable present in interface
        System.out.println("Value of var declared in inteface Bicycle is "+ac.var);
        //However we cannot update the value of properties present in interface
        //ac.var++; Will give an error , since we cannot update it .

    }    
}
