import java.util.Scanner;

class cylinder{
    private float radius;
    private float heigth;
    public void set_radius_heigth(){
        System.out.println("Enter the Radius ");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextFloat();
        System.out.println("Enter the heigth ");
        heigth=sc.nextFloat();
    }
    public void get_radius_heigth(){
        System.out.println("The entered radius and height are "+radius+" and "+heigth);
    }
    public void get_surface_area(){
        System.out.println("The surface area of cylinder with radius of "+radius+" units and heigth "+heigth+" is "+(2*3.14*radius*(radius+heigth)) );
    }
    public void get_volume(){
        System.out.println("Volume  of cylinder with radius of "+radius+" units and heigth "+heigth+" is "+3.14*radius*radius*heigth);
    }
    public cylinder(){
        System.out.println("Enter the Radius ");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextFloat();
        System.out.println("Enter the heigth ");
        heigth=sc.nextFloat();
        System.out.println("The entered radius and height are "+radius+" and "+heigth);
        System.out.println("The surface area of cylinder with radius of "+radius+" units and heigth "+heigth+" is "+(2*3.14*radius*(radius+heigth)) );
        System.out.println("Volume  of cylinder with radius of "+radius+" units and heigth "+heigth+" is "+3.14*radius*radius*heigth);
    }

}
public class tut44 {
    public static void main(String[] args) {
        cylinder c=new cylinder();
        //c.set_radius_heigth();
        //c.get_radius_heigth();
        //c.get_surface_area();
        //c.get_volume();
        cylinder c1=new cylinder();
    }
}
