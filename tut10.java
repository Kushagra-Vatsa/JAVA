public class tut10 {
    public static void main(String[] args) {
        /*
         * Resulting Data types of variable : 
         * var = byte + short = int
         * var = short + int = int
         * var = long + float = float
         * var = int + float = float
         * var = character + short= int
         * var = characyer + int = int
         * var = long + double = double
         * var = float + double = double
         */
        int x=56,y=56,z=56;
        int a=x++;//Value of a becomes 56,then x is incremented by 1
        int b=++y;//value of y increased by 1 and b becomes the current value of y
        System.out.println("The values of a and b are "+a+" and "+b);
        System.out.println("The values of x and y are "+x+" and "+y);
        char A='a';
        A++;
        System.out.println("Value of character A is "+A);
    }
}
