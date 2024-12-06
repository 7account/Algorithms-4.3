import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int twoLetter = twoLetter();
        int numberOfLongestWord = numberOfLongestWord();
        // int palindrome = palindrome();
        System.out.println("Total Number of Two Letter Words: " + twoLetter);
        System.out.println("Total Number of Longest Words: " + numberOfLongestWord());
        // System.out.println("Toral Number of Palindromes: " + palindromes());
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

    public static int numberOfLongestWord() throws FileNotFoundException{
        s = new Scanner(f);
        int numberOfLongestWord = 0;
        int lengthOfLongestWord = 0;
        while (s.hasNext()) {
            int i = (s.next()).length();
            if (i > lengthOfLongestWord) lengthOfLongestWord = i;
        }
        while (s.hasNext()) {
            int i = (s.next()).length();
            if (i == lengthOfLongestWord) numberOfLongestWord++;
        }
        return numberOfLongestWord;
    }
}