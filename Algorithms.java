import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int twoLetter = twoLetter();
        int lengthOfLongestWord = lengthOfLongestWord();
        int numberOfLongestWord = numberOfLongestWord();
        int palindrome = palindromes();
        System.out.println("Total Number of Two Letter Words: " + twoLetter);
        System.out.println("Length of Longest Word: " + lengthOfLongestWord);
        System.out.println("Total Number of Longest Words: " + numberOfLongestWord);
        System.out.println("Total Number of Palindromes: " + palindromes());
        s.close();
    }

    public static int twoLetter() throws FileNotFoundException{
        s = new Scanner(f);
        int twoLetter = 0;
        while (s.hasNext()) {
            if ((s.next()).length() == 2) twoLetter++;
        }
        return twoLetter;
    }

    public static int lengthOfLongestWord() throws FileNotFoundException{
        s = new Scanner(f);
        int lengthOfLongestWord = 0;
        while (s.hasNext()) {
            String i = s.next();
            if (i.length() > lengthOfLongestWord) lengthOfLongestWord = i.length();
        }
        return lengthOfLongestWord;
    }

    public static int numberOfLongestWord() throws FileNotFoundException{
        s = new Scanner(f);
        int numberOfLongestWord = 0;
        while (s.hasNext()) {
            String i = s.next();
            if (i.length() == 14) numberOfLongestWord++;
        }
        return numberOfLongestWord;
    }
    
    public static int palindromes() throws FileNotFoundException{
        s = new Scanner(f);
        int palindromes = 0;
        boolean isPalindrome = true;
        while (s.hasNext()) {
            String i = s.next();
            int end = i.length()/2;
            if (i.length() % 2 == 0) end = (i.length()/2) - 1;
            for (int x = 0; x <= end; x++) {
                if (!((i.substring(x, x + 1)).equals(i.substring(i.length() - x -1, i.length() - x)))) isPalindrome = false;
            }
            if (isPalindrome) palindromes++;
            isPalindrome = true;
        }
        return palindromes;
    }
}