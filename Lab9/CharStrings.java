import java.util.ArrayList;
import java.util.Collections;

public class CharStrings {
    public static void main(String[] args) {
        String a = "apfojtle";
        String b = "joapfelt";
        if (isSimilar(a, b)) System.out.println("Podane łańcuchy mogą być podobne");
        else System.out.println("Podane łańcuchy nie mogą być podobne");
    }

    public static boolean isSimilar(String a, String b){
        if (a.length() == b.length()){
            return getCharList(a, 0).equals(getCharList(b, 0)) && getCharList(a,1).equals(getCharList(b,1));
        }
        else return false;
    }

    public static ArrayList getCharList(String x, int n){
        ArrayList<Character> List = new ArrayList<>();
        int i = n;
        do {
            List.add(x.charAt(i));
            i = i + 2;
        } while (i < x.length());
        Collections.sort(List);
        return List;
    }

}
