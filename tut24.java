// Example for break statement
//public class tut24 {
//     public static void main(String[] args) {
//         int i = 10;
//         for (int j = 0; j < i; j++) {
//             if (j == 3) {
//                 System.out.println("Ending the loop ");
//                 break;
//             }
//             System.out.println(j);

//         }
//     }
// }

//Example for continue statement
public class tut24 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
             
            if(i==5){
                System.out.println("Using continue statement");
                continue;
                //Since continue is encountered System.out.println(i) will be jumped and control will go again to for loop
            }
            System.out.println(i);
        }
    }
    
}
