class MyEmployee{
    private int id;
    private String name;
    public void setName(String n){
        name=n;
    }
    public void setId(int n){
        id=n;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
public class tut40 {
    public static void main(String[] args) {
        MyEmployee emp1=new MyEmployee();
        //emp1.id=101;
        //emp1.name="Kushagra";
        //So we cannot directly access properties/attributes of a class if they are private
        //So we use methods
        emp1.setId(101);
        emp1.setName("Kushagra");
        System.out.println("Id and Name of emp1 is "+emp1.getId()+" and "+emp1.getName());

    }
}
