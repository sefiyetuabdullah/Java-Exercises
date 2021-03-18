import java.util.Scanner;

public class Main {
    
 // Create a methodHomenamed isPalindrome using Recursion
 // Given any input string, isPalindrome() evaluates whether the string is a palindrome
 // The method should return true if the input string is a palindrome and return false if the input string is not a palindrome. 
    
    public static void main (String[] args) {
    
        String str;
        Scanner kbs = new Scanner(System.in);
        
        System.out.println("This program will test whether a string entered is a palindrome!");
        System.out.println("----------------------------------------------------------------");
        System.out.print  ("Please enter a string : ");
        str = kbs.nextLine();
        
     // Remove white spaces & punctuation marks, and convert all letters to upper case
        str = str.replaceAll("[^A-Za-z]+", "").toUpperCase();
        
        System.out.println("Current String : " + str);
        int size = str.length();
        int length = size - 1;
        int i = 0;
        if (str.charAt(i) == str.charAt(length))
        {
        isPalindrome(str,length,i);
        }
        else
        System.out.println("String is not a palindrome.");

    } 
    // end of main
    public static boolean isPalindrome(String str, int length, int i)
    {
      if((str.charAt(i) == str.charAt(length - i)) && (i<length))
        {
          isPalindrome(str,length, i+1);
        }
      
      else if (str.charAt(i) != str.charAt(length - i))
      {
        System.out.println("String is not a palindrome.");
        return false;
      }

      else
      System.out.println("String is a palindrome.");
      return true;
      }
} // end of class
