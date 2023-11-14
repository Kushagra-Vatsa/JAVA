public class tut26 {
    public static void main(String[] args) {
       int [] marks1=new int[3];
       marks1[0]=10;
       marks1[1]=20;
       marks1[2]=30;
       //It can also be written as 
       // int [] marks1; declaration
       //marks1=new int[3]; memory allocation
       System.out.println("Marks stored in marks1[] arrays are "+marks1[0]+" "+marks1[1]+" "+marks1[2]);


       //We can also directly initialise and allocate arrays
       int [] marks2={70,80,90};
        System.out.println("Marks stored in marks2[] arrays are "+marks2[0]+" "+marks2[1]+" "+marks2[2]);


        System.out.println("To find the length of arrays we use <array_name>.length ");
        System.out.println("Length of marks1 array and marks2 array are "+marks1.length+" and "+marks2.length);
        

        //displaying using for loop
        System.out.println("Using for loop");
        for(int i=0;i<marks1.length;i++){
            System.out.println(marks1[i]);
        }

        //displaying using for each loop
        System.out.println("Displaying using simple for each loop");
        for (int i : marks2) {
            System.out.println(i);
        }
    }
}
