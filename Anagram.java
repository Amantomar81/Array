import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first string");
        String str1 = sc.nextLine();
        str1 = str1.toLowerCase();
        System.out.println("Enter a second string");
        String str2 = sc.nextLine();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length())
        {
            char[] x = str1.toCharArray();
            char[] y = str2.toCharArray();

            Arrays.sort(x);
            Arrays.sort(y);

           boolean result  = Arrays.equals(x,y);

           if (result){
               System.out.println(str1 + " and " + str2 + " are anagram. ");
           }
           else {
               System.out.println(str1 + " and " + str2 + " are not anagram ");
           }
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagram ");
        }
        sc.close();
    }
}
