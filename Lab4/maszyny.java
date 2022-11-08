import java.util.Scanner;

public class maszyny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe jednostek towaru do wyprodukowania");
        int x = sc.nextInt();
        System.out.println("Podaj liczbe maszyn");
        int y = sc.nextInt();
        System.out.println("Podaj szybkosci produkcji dla danych maszyn (liczba jednostek/dzień)");
        int[] tab = new int[y];
        for (int j = 0; j < y; j++){
            int sz = sc.nextInt();
            tab[j] = sz;
        }

        System.out.println("Min liczba dni to: " + minDays(x,y, tab));
    }
    public static int minDays(int x, int y, int[] tab){
        int n, d;
        n = 0;
        d = 0;
        do{
            d++;
            for (int i = 0; i < y; i++){
                if ((d % tab[i]) == 0){
                    n++;
                }
                if (n == x) break;
            }
        } while (n < x);
        return d;
    }
}
