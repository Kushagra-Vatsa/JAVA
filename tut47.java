class Ekclass{
    int a;
    public Ekclass(int a){
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
    public int getA() {
        return a;
    }
    

}
public class tut47 {
    public static void main(String[] args) {
        Ekclass e=new Ekclass(1);
        System.out.println("value of a is "+e.getA());
    }

}
