/* 
public class tut34 {
    static int factorial(int n){
        if (n==1 || n==0) {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));    
        System.out.println(factorial(5));
    }
}

*/

//Wap to find first n terms of the  fibonaaci series 

public class tut34 {

    public static int recurFibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recurFibo(n - 1) + recurFibo(n - 2);
        }
    }

    public static void main(String[] args) {
        int nterms = 10;

        // check if the number of terms is valid
        if (nterms <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            System.out.println("Fibonacci sequence:");
            for (int i = 0; i < nterms; i++) {
                System.out.println(recurFibo(i));
            }
        }
    }
}


