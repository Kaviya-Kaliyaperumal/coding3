import java.util.*;
class Main
{
    static void string(String str)
    {
    StringBuffer alpha=new StringBuffer(),numeric=new StringBuffer(),special=new StringBuffer();
    for(int i=0;i<str.length();i++)
    {
        if(Character.isDigit(str.charAt(i)))
         numeric.append(str.charAt(i));
         else if(Character.isAlphabetic(str.charAt(i)))
         alpha.append(str.charAt(i));
         else
         special.append(str.charAt(i));
    }
    System.out.println("NUMBERS  "+numeric);
    System.out.println("ALPHABETS "+alpha);
    System.out.println("SPECIAL "+special);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
       String str=s.next();
       string(str);
    }
   
}

