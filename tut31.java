public class tut31 {
    //This is a static method . It can be called without the use of an object
    static int logic(int x,int y){
        int z;
        if (x>y) {
            z=x+y;
        }
        else{
            z=x*y;
        }
        return z;
    }
    //This is non-static function . It is called by creating object of the class.
    //Note we can also call static method using object but it is not necessary
    int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        //calling sttaic methods
        System.out.println("Method using static keyword");
        int n=logic(1,2);
        int m=logic(2,1);
        System.out.println(n);
        System.out.println(m);

        //Calling non-staic methods
        System.out.println("Method using class and object ie non static");
        tut31 obj=new tut31();
        int ans=obj.sum(n, m);
        System.out.println(ans);
    }
}
