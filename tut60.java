abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    void write(){
        System.out.println("Writing with pen");
    }
    void refill(){
        System.out.println("Refilling the pen");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}


class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface basicAnimal{
    void sleep();
    void eat();
}
class Human extends Monkey implements basicAnimal{
    public void sleep(){
        System.out.println("Animals sleep");
    }
    public void eat(){
        System.out.println("Animals's eat food");
    }
}



abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends TelePhone{
    void ring(){
        System.out.println("Ringing!!!");
    }
    void lift(){
        System.out.println("Lifting!!!");
    }
    void disconnect(){
        System.out.println("Disconnecting!!!");
    }
}



interface TvRemote{

}
interface SmartTvRemote extends TvRemote{

}
class Tv implements SmartTvRemote{
    
}

public class tut60 {
    public static void main(String[] args) {
        //Q1+Q2
        FountainPen Fp = new FountainPen();
        Fp.write();
        Fp.refill();
        Fp.changeNib();
        System.out.println("--------Question end--------");
        //Q3
        Human hum=new Human();
        hum.bite();
        hum.jump();
        hum.eat();
        hum.sleep();
         System.out.println("--------Question end--------");
        //Q4
        SmartTelephone St=new SmartTelephone();
        St.ring();
        St.lift();
        St.disconnect();
         System.out.println("--------Question end--------");
        //Q5
        Monkey m1=new Human();
        m1.bite();
        m1.jump();
        basicAnimal ba=new Human();
        ba.sleep();
        ba.eat();
        System.out.println("--------Question end--------");
        //Q6
    }
    
}
