interface MyCamera {
    void TakingPicture();    
    void RecordVideo();
    //We can declare and define method in interface using default keyword , we can also re-redine in implemented class
    //We cannot directly call private methods in implemented class but it can be called using default methods.
    private void greet(){
        System.out.println("Good Morning");
    }
    default void Record4Kvideo(){
        greet();
        System.out.println("Recording 4K video");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectTonetwork(String network);
}


class MyCellPhone{
    void PickCall(int PhoneNumber){
        System.out.println("Pick call from "+PhoneNumber);
    }
    void RejectCall(int PhoneNumber){
        System.out.println("Reject call from "+PhoneNumber); 
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{
    //Defining methods of MyCamera
    public void TakingPicture(){
        System.out.println("Taking Picture using camera");
    }
    public void RecordVideo(){
        System.out.println("Recording Video using camera");
    }

    //Defining methods of MyWifi
    public String[] getNetworks(){
        System.out.println("Setting List of networks ");
        String[] NetworkList={"Kushagra","Noddy","LogicBomb"};
        return NetworkList;
    }
    public void connectTonetwork(String network){
        System.out.println("Connecting to "+network);
    }

    //We can also Re-defining default methods in class
    // public void Record4Kvideo(){
    //     System.out.println("Recording 4K video : via redefinig ");
    // }

}
public class tut57 {
    public static void main(String[] args) {
        MySmartPhone ms=new MySmartPhone();
        ms.Record4Kvideo();
        System.out.println("-------------------------");
        ms.RecordVideo();
        System.out.println("-------------------------");
        ms.TakingPicture();
        System.out.println("-------------------------");
        ms.connectTonetwork("Cellular Data");
        System.out.println("-------------------------");
        String ar[]=ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);

        }
        // ms.greet();Throws an error
    }
}
