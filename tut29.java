import java.util.Scanner;
public class tut29 {
    public static void main(String[] args) {
        /* 
        Create an array of 5 floats and calculate their sums
        float [] arr1={1.1f,1.2f,1.3f,1.4f,1.5f};
        float sum=0;
        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i];
        }
        System.out.println("Sum of floats element in the arrays are "+sum);

        Find if a given integer is present in an array or not 
        int arr2[]={0,1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        for(int i=0;i<arr2.length;i++){
            if (num==arr2[i]) {
                System.out.println("Matching number found "+arr2[i]);
            }
        }  
        */  

        /* 
        Calculate marks of all elements in an array using for each loop
        int [] phy_marks={10,20,30,40,50};
        int phy_sum=0;
        for (int i : phy_marks) {
            phy_sum+=i;
        }
        System.out.println("Sum of all physics marks are "+phy_sum);
        */


        /* 
        Find the largest and smallest element in an array
        int []arr3={56,78,34,67,90};
        int max=arr3[0];
        ;
        for(int i=0;i<arr3.length;i++){
            if(arr3[i]>max){
                max=arr3[i];
            }
        }
         System.out.println("The largest marks in the array is "+max);
        int min=arr3[0];
        for(int i=0;i<arr3.length;i++){
            if(arr3[i]<min){
                min=arr3[i];
            }
        }
        System.out.println("The lowest marks in the arrays is "+min);
        */


        /* 
        Addition of 2 matrices
        int [][] mat1={{1,2,3},
                       {4,5,6}};
        int [][] mat2={{7,8,9},
                       {10,11,12}};
        int [][] result={{0,0,0},
                        {0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        } 
        System.out.println("The sum of the 2 matrices are ");
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        */


        /* 
        WAP to reverse an array
        int arr4[]={1,2,3,4,5};
        System.out.print("Elements in arr4[] before reversing are ");
        for(int i=0;i<arr4.length;i++){
            System.out.print(arr4[i]+" ");
        }
        int l=arr4.length;
        int n=Math.floorDiv(l, 2);
        
        for(int i=0;i<n;i++){
            int temp=arr4[i];
            arr4[i]=arr4[l-1-i];
            arr4[l-1-i]=temp;
        }
        System.out.print("\nElements in arr4[] after reversing is ");
        for(int i=0;i<arr4.length;i++){
            System.out.print(arr4[i]+" ");
        }
        */

        
        //WAP to find if an array is sorted or not 
        int arr5[]={1,1,3,4,5};
        boolean check=true;
        System.out.println("To check if the array is sorted or not ");
        for(int i=0;i<arr5.length-1;i++){
            //We use i<arr5.length-1 instead of i<arr5.length as it would make arr5[i+1] go out of bounds
            if(arr5[i+1]<arr5[i]){
                check=false;
                break;
            }  
        }
        if (check) {
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }

    }
}
