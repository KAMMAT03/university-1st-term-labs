import java.util.Scanner;

public class pierwiastki {
    public static void main(String[] args) {
        System.out.println("Podaj typ funkcji: 1 - kwadratowa, 2 - liniowa");
        Scanner sc  =new Scanner(System.in);
        int typ = sc.nextInt();
        switch (typ){
            case 1:
                System.out.println("Podaj wspolczynniki a, b, c");
                float a = sc.nextFloat();
                float b = sc.nextFloat();
                float c = sc.nextFloat();
                if (a == 0) calculateRoot(b,c);
                else calculateRoot(a,b,c);
                break;
            case 2:
                System.out.println("Podaj wspolczynniki a, b");
                float d = sc.nextFloat();
                float e = sc.nextFloat();
                a = d;
                b = e;
                calculateRoot(a, b);
        }
    }
    public static void calculateRoot(float a, float b, float c) {
        double delta, x1, x2, x;
        delta = b*b - 4*a*c;
        if (delta > 0){
        x1 = (-b + Math.sqrt(delta))/2*a;
        x2 = (-b - Math.sqrt(delta))/2*a;
        System.out.println("Pierwiastki to: " + x1 + " i " + x2);
        } else if (delta == 0) {
            x = (-b)/2*a;
            System.out.println("Pierwiastek to: " + x);
        }
        else {
            System.out.println("To rownanie nie ma pierwiastkow rzeczywistych!");
        }
    }
    public static void calculateRoot(float a, float b) {
        float x;
        x = (-b)/a;
        System.out.println("Pierwiastek to: " + x);
    }
}
