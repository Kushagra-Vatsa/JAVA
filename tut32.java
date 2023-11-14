public class tut32 {
    static void change1(int x){
        x=45;
    }

    static void change2(int arr[]){
        arr[0]=0;
    }

    static void foo(){
        System.out.println("Good morning bro");
    }

    static void foo(int n){
        System.out.println("Good morning bro :"+n);
    }

    public static void main(String[] args) {
        //Case 1:Trying to change the integer using method
        int x=10;
        System.out.println("Value of x before change1() is "+x);
        change1(x);
        System.out.println("Value of x after change1() is "+x);
        //Here the value is not updated as a copy of x is being passed to the method


        //Case 2:Trying to change the array using methods
        int []arr={1,2,3,4,5};
        System.out.println("arr[0] before change2() is "+arr[0]);
        change2(arr);
        System.out.println("arr[0] after change2() is "+arr[0]);
        //Here the value can be changed as the address of the array is passed to the method . Here the 
        // reference is being passed to the methods , so we are able to update the value of the array


        //Method overloading
        //Note we cannot do method overloading by changing return_types
        foo();
        foo(x);

    }
}
