public class tut33 {
    static void sum(int ...arr){
        int Sum=0;
        for (int i : arr) {
            Sum+=i;
        }
        System.out.println("the sum of the following query is "+Sum);
    }

    //If you want atleast one parameter to be passed change the syntax like this
    static void fun(int n,int ...args){
        System.out.println("Hello world");
    }
    public static void main(String[] args) {
        System.out.println("Intro to varargs tutorials");
        sum(1,2);
        sum(1,2,3);
        sum(1,2,3,4,5,6,7,8,9,10);

        fun(0,null);
    }
}
