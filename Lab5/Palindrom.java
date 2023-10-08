import java.util.Hashtable;
import java.util.Objects;
import java.util.Scanner;

public class Palindrom {
    /*
    This method returns text of the entered palindrome
     */
    private String palindrome = null;

    /*
    This method returns a part of the entered word, that is a palindrome
     */

    public String getPalindrome() {
        return palindrome;
    }
    /*
    This method returns a palindrome without spaces or special characters
     */
    private String rawPalindrome(){
        return makeRawPalindrome();
    }
    /*
    This method converts palindrome into a string without spaces or special characters
     */
    public String makeRawPalindrome(){
        String raw = "";
        StringBuilder sB = new StringBuilder(raw);
        for (int i =0; i < palindrome.length(); i++) {
            if (Character.isLetter(palindrome.charAt(i))){
                sB.append(palindrome.charAt(i));
            }
        }
        raw = sB.toString();
        return raw;
    }
    /*
    This method returns an original text of palindrome
     */
    @Override
    public String toString(){
        return palindrome;
    }
    /*
    This method checks whether palindrome and rawpalindrome are the same string
     */
    @Override
    public boolean equals(Object anObject){
        return this == anObject;
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(palindrome);
    }


    public static int indeks;
    public static void main (String[] arguments) {
        Palindrome p1 = new Palindrome("kobyłamamałybok");
        Palindrome p2 = new Palindrome("kobyła ma mały bok!");
        Palindrome p3 = new Palindrome("elf układał kufle");
        System.out.println("p1 == p2 : " + (p1 == p2));
        System.out.println("p1.equals(p2) : " + p1.equals(p2));
        Hashtable<Palindrome, String> ps = new Hashtable<>();
        ps.put(new Palindrome("a car boso kokos obraca"), "Andrzej Pacierpnik");
        ps.put(p2, "autor nieznany");
        ps.put(new Palindrome("muzo, raz daj jad za rozum"), "Julian Tuwim");
        ps.put(p3, "Tadeusz Morawski");
        System.out.println("Autorem palindromu " + p3 + " jest " + ps.get(p3));
        String word = "rrrrr abccba kobyłamamałybok";
        String longestPalindrome = findLongestPalindrome(word);
        System.out.println("longestPalindrome: " + longestPalindrome);
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj slowo do sprawdzenia");
        word = sc.next();
        indeks = word.length();
        longestPalindrome = findLongestPalindrome(word);
        System.out.println(longestPalindrome);
    }
    public static String findLongestPalindrome(String word) {
        String longestPalindrome = "";
        for (int i = 0; i < word.length(); i++) {
            String current = "";
            String subword = word.substring(i, word.length());
            indeks = subword.length();
            String temp = analyzeSubstring(subword);
            current = temp.substring(0,indeks);
            if (longestPalindrome.length() < current.length()){
                longestPalindrome = current;
            }
        }
        return longestPalindrome;
    }
    public static String analyzeSubstring(String word) {
        String substring = "";
        while(indeks > 0){
            substring = word.substring(0, indeks);
            if (isPalindrome(substring)){
                return substring;
            }

        }
        return substring;
    }
    public static boolean isPalindrome(String word) {
        int a1 = 0;
        int a2 = word.length();
        boolean isPalindrome = true;
        while(a2 > a1){
            if(word.charAt(a1) != word.charAt(a2 - 1)){
                isPalindrome = false;
                break;
            }
            a1 = a1 +1;
            a2 = a2 -1;
        }
        if ((!isPalindrome)){
            indeks = indeks - 1;
        }
        return isPalindrome;
    }
}
