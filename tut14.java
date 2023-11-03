//String methods : These merthods operate on java strings to find length of the strings ,
//conert to lowercase ,etc.
public class tut14 {
    public static void main(String[] args) {
        String str1="Kushagra";
        String str2=new String("Vatsa");
        String str3=new String("     Kushagra    ");
        String str4="range";
        System.out.println("Str1 and str2 are : "+str1+" and "+str2);
        //length() returns the length of the string
        int len1,len2;
        len1=str1.length();
        len2=str2.length();
        System.out.println("The length of str1 and str2 is "+len1+" and "+len2); 

        //lowercase() returns the string in lowercase and uppercase() returns in uppercase
        System.out.println("str1 in lowercase "+str1.toLowerCase());
        System.out.println("str2 in lowercase "+str2.toLowerCase());
        System.out.println("str1 in upperCase "+str1.toUpperCase());
        System.out.println("str2 in upperCase "+str2.toUpperCase());

        //trim() returns the string after removing all the leading and trailing spaces from the original string
        System.out.println("After using trim function on str1 and str2 : "+str1.trim()+" and "+str2.trim());
        System.out.println("After using trim function on str3 : "+str3.trim());//Removes spaces before and after the string


        //substring(int start_index) returns a subtring from start to end 
        //Note : Index starts from 0
        System.out.println(str1.substring(2));
        System.out.println(str2.substring(2));

        //substring(int start_index,int end_index) but the end_index is not included
        System.out.println(str1.substring(2,6));
        System.out.println(str2.substring(2, 4));

        //replace('a','b') returns a new string after replacing the letter a with b
        System.out.println(str4.replace('r', 'h'));
        System.out.println(str4.replace("r","Hange"));

        //startswith("ab") returns true if string starts with ab and vice versa
        //endswith("ab") returns true if string ends with ab 
        System.out.println(str1.startsWith("K"));
        System.out.println(str2.startsWith("v"));
        System.out.println(str1.endsWith("gra"));
        System.out.println(str2.endsWith("a"));

        //charAr(int index) returns the character at that position
        System.out.println(str1.charAt(0));
        System.out.println(str2.charAt(4));

        //indexOf(str) returns index of str " "
        System.out.println(str1.indexOf("sh"));

        //equals(str) returns true if str mathches string
        System.out.println(str1.equals("Kushagra")); 
        System.out.println(str2.equals("vatsa"));

        //equalsIgnorecase(str) returns true if str matches string ignoring cases
        System.out.println(str1.equalsIgnoreCase("kushAGRA"));
        System.out.println(str2.equalsIgnoreCase("Vatsa"));
    }
}
