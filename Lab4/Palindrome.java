import java.util.Scanner;

public class Palindrome {
        public static int indeks;

    public Palindrome(String a_car_boso_kokos_obraca) {

    }

    public static void main (String[] arguments) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj slowo do sprawdzenia");
            String word = sc.next();
            indeks = word.length();
            String longestPalindrome = findLongestPalindrome(word);
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