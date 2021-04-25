/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labmanual9.pkg143.pkg068;

import java.util.Scanner;

/**
 *
 * @author BajwaTraders
 */
public class StringMethodFour {
   
    public static void main(String [] args)
    {
        Scanner obj = new Scanner(System.in);
        String inp;
        System.out.println("Finding number of spaces in the string , Enter the String : ");
        inp=obj.nextLine();
        countSpace(inp);
        String inpt;
        System.out.println("Enter Sting : ");
        inpt = obj.nextLine();
        ReverseString(inpt);
        String in;
        System.out.println("Enter the String : ");
        in = obj.nextLine();
        FindVowel(in);
        String s3;
        System.out.println("Enter the String : ");
        s3 = obj.nextLine();
        NumberOfConsonant(s3);
        String s4;
        s4 = obj.nextLine();
        StringNumber(s4);
    }
    
    /**
     * Function which tell us the number of spaces in the string 
     * 
     * @param inp 
     */
   public static void countSpace(String inp)
   {
   int count = 0;
   for(int i = 0 ; i <inp.length()  ; i++)
   {
       if(inp.charAt(i)==' ')
       {
           count = count+1;
       }
   }
        System.out.println("Number of spaces is : " +count);
    
}
   /**
    * Function which reverse the given string
    * 
    * @param inpt 
    */
   public static void ReverseString(String inpt)
   {
       System.out.println("Reverse string is :");
       for(int i = inpt.length()-1 ; i >= 0 ; i-- )
       {
           System.out.print(inpt.charAt(i));
       }
       
    }
   
   /**
    * Function which find vowel in the string
    * 
    * @param in 
    */
   public static void FindVowel(String in)
   {
       int size =in.length();
       for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == 'A' || in.charAt(i) == 'E' || in.charAt(i) == 'I' || in.charAt(i) == 'O' || in.charAt(i) == 'U') 
            {
                System.out.println("Vowels in the String "+in.charAt(i));
            } 
            else if (in.charAt(i) == 'a' || in.charAt(i) == 'e' || in.charAt(i) == 'i' || in.charAt(i) == 'o' || in.charAt(i) == 'u') 
            {
                System.out.println("Vowels in the string "+in.charAt(i));
            }
       
   }
}
   /**
    * Function which find number of consonant in the string 
    * @param s3 
    */
   public static void NumberOfConsonant (String s3)
   {
       int count = 0;
        int size = s3.length();
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) == 'A' || s3.charAt(i) == 'E' || s3.charAt(i) == 'I' || s3.charAt(i) == 'O' || s3.charAt(i) == 'U') 
            {
               
            } 
            else if (s3.charAt(i) == 'a' || s3.charAt(i) == 'e' || s3.charAt(i) == 'i' || s3.charAt(i) == 'o' || s3.charAt(i) == 'u') 
            {
              
            }
            else if (s3.charAt(i) >= 'a' && s3.charAt(i) <= 'z' || s3.charAt(i) >= 'A' && s3.charAt(i) <= 'Z')
            {
                count++;
            }
        }
        System.out.print("Count of consonanat : "+count);
    
        
   }
   
   /**
    * Function which find that the given string is number or not
    * @param s4 
    */
   public static void StringNumber(String s4)
        {
           char[] x=s4.toCharArray();
  boolean flag = false;
  for(int i=0;i<x.length;i++)
  {
   if(x[i] >= '0' && x[i] <= '9')
   {
     flag = true;
   }
   else
   {
     flag = false;
     break;
   } 
    
  }
  if (flag == true)
  {
    System.out.println("String is number");
  }
  else
  {
    System.out.println("String is not number");
  }
  }  
        }
