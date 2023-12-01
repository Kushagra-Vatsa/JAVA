interface Mywifi1{
    void usewifi();
    default void switching(){
        System.out.println("Switching from cellular to Wifi ");
    }
}
interface MymusicPlayer1{
    void Playmusic();
    void Stopmusic();
}
class Phone1{
    void Acceptcall(float number ){
        System.out.println("Accept call from "+number);
    }
    void Rejectcall(float number){
        System.out.println("Reject call from "+number);
    }
}
class SmartPhone1 extends Phone1 implements Mywifi1,MymusicPlayer1{
    public void usewifi(){
        System.out.println("Using Wifi 6.2 ");
    }
    public void Playmusic(){
        System.out.println("Playing  music in MusicPlayer");
    }
    public void Stopmusic(){
        System.out.println("Pause the playing music ");
    }
    void display(){
        System.out.println("Switching On display");
    }
}

public class tut59 {
    public static void main(String[] args) {
        Mywifi1 wf=new SmartPhone1();//Can only use Mywifi methods
        wf.switching();
        wf.usewifi();
        //wf.display(); -->Since this method is in Smartphone1 , it cannot be used .
        //wf.Playmusic(); --> Not allowed
        System.out.println("-----------------------------------");
        MymusicPlayer1 msp=new SmartPhone1();//Can only use MymusicPlayer1 methods
        msp.Playmusic();
        msp.Stopmusic();
        System.out.println("-----------------------------------");
        SmartPhone1 sp1=new SmartPhone1();//Using this object we can use all the methods
        sp1.usewifi();
        sp1.switching();
        sp1.Playmusic();
        sp1.Stopmusic();
        sp1.Acceptcall(8877123400f);
        sp1.Rejectcall(9432145678f);
        System.out.println("-----------------------------------");
    }
    
 }
