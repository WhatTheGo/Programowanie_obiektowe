import java.util.Arrays;

public class Zestaw4 {
    public static void main(String[] args) {
        System.out.println("Zad1");
        double[] tab1 = generujTablice(5, 1.25, 26);
        System.out.println(Arrays.toString(tab1));

        System.out.println("Zad2");
        double[] tab2 = generujZakres(6,1, 6);
        System.out.println(Arrays.toString(tab2));
    }


    public static double[] generujTablice(int n, double minWartosc, double maxWartosc) {
        double[] tab1 = new double[n];
        for (int i = 0; i < n; i++) {
            double random = Math.random() * (maxWartosc-minWartosc) + minWartosc;
            tab1[i] = random;
        }

        return tab1;
    }

    public static double[] generujZakres(int n, double minWartosc, double maxWartosc) {
        double[] tab1 = new double[n];
        tab1[0] = minWartosc;
        double odstep = (maxWartosc - minWartosc)/(n-1);
        for (int i = 1; i < n; i++) {
            tab1[i] = tab1[i-1] + odstep;
        }

        return tab1;
    }

    public static void wypiszTablice(double[] tab, int n, int m) {
        for (int i = 0; i < n; i++) {

        }
    }
}
