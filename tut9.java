// c:\Users\kusha\OneDrive\Pictures\Screenshots\Operator Predence & Associativity.png
public class tut9 {
    public static void main(String[] args) {
        int a=6*5-34/2;
        /*
         * a=30-34/2
         * a=30-17
         * a=13
         */
        int b=60/5-34*2;
        /*
         * since the precedence of * and / are same we use associativity
         * we go from LEFT TO RIGHT
         * b=12-68
         * b=-56
         */
        System.out.println(a);
        System.out.println(b);
    }
}
