public class test {
    private static boolean f1true() {
        System.out.format("f1true()%n");
        //System.out.printf("f1true()%n");// try this
        //System.out.println("f1true()");// try this
        return true;
    }

    private static boolean f1false() {
        System.out.printf("f1false()%n");
        return false;
    }

    public static void main(String[] args) {
        boolean a, b, c, d, e;
        //a = f1true() | f1true();
        //b = f1true() || f1true();
        int n = 1;
        System.out.println(n << 33);
    }
}
