import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine().toLowerCase();

        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("The words are Anagrams");
        else
            System.out.println("The words are not Anagrams");
    }
}