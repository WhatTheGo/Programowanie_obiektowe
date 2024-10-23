import java.util.Arrays;

public class Zestaw4 {
    public static void main(String[] args) {
        System.out.println("Zad1");
        int[] tab1 = generujTablice(5, 10, 26);
        System.out.println(Arrays.toString(tab1));

        System.out.println("Zad7");
        double[] tab2 = generujZakres(4, 1, 6);
        System.out.println(Arrays.toString(tab2));

        System.out.println("Zad2");
        wypiszTablice(tab1, 2, 3);

        System.out.println("Zad3");
        System.out.println("Nieparzystych = " + ileNieparzystch(tab1));
        System.out.println("Parzystych = " + ileParzystch(tab1));
        System.out.println("Dodatnich = " + ileDodatnich(tab1));
        System.out.println("Ujemnych = " + ileUjemnych(tab1));
        System.out.println("Zerowych = " + ileZerowych(tab1));
        System.out.println("Maksymalnych = " + ileMaksymalnych(tab1));
        System.out.println("Minimalnych = " + ileMinimalnych(tab1));
        System.out.println("Uniklanych = " + ileUnikalnych(tab1));

        System.out.println("Zad4");
        System.out.println("sumaDodatnich = " + sumaDodatnich(tab1));
        System.out.println("sumaUjemnych = " + sumaUjemnych(tab1));
        System.out.println("sumaOdwrotnosci = " + sumaOdwrotnosci(tab1));
        System.out.println("sredniaArytmetyczna = " + sredniaArytmetyczna(tab1));
        System.out.println("sredniaGeometryczna = " + sredniaGeometryczna(tab1));
        System.out.println("sredniaHarmoniczna = " + sredniaHarmoniczna(tab1));
    }


    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        int[] tab1 = new int[n];
        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * (maxWartosc - minWartosc) + minWartosc);
            tab1[i] = random;
        }

        return tab1;
    }

    public static double[] generujZakres(int n, double minWartosc, double maxWartosc) {
        double[] tab1 = new double[n];
        tab1[0] = minWartosc;
        double odstep = (maxWartosc - minWartosc) / (n - 1);
        for (int i = 1; i < n; i++) {
            tab1[i] = tab1[i - 1] + odstep;
        }

        return tab1;
    }

    public static void wypiszTablice(int[] tab, int n, int m) {
        int dlugosc = tab.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (k < dlugosc) {
                    System.out.print(tab[k] + " ");
                } else {
                    System.out.print(" ");
                }
                k++;
            }
            System.out.print("\n");
        }
    }

    public static int ileNieparzystch(int[] tab) {
        int ile = 0;
        for (int j : tab) {
            if (j % 2 != 0) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileParzystch(int[] tab) {
        int ile = 0;
        for (int j : tab) {
            if (j % 2 == 0) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileDodatnich(int[] tab) {
        int ile = 0;
        for (int j : tab) {
            if (j > 0) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileUjemnych(int[] tab) {
        int ile = 0;
        for (int j : tab) {
            if (j < 0) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileZerowych(int[] tab) {
        int ile = 0;
        for (int j : tab) {
            if (j == 0) {
                ile++;
            }
        }
        return ile;
    }

    public static int max(int[] tab) {
        int max = tab[0];

        for (int i = 1; i < tab.length; i++) {
            max = Math.max(max, tab[i]);
        }
        return max;
    }

    public static int ileMaksymalnych(int[] tab) {
        int ile = 0;
        int max = max(tab);

        for (int j : tab) {
            if (j == max) {
                ile++;
            }
        }
        return ile;
    }

    public static int min(int[] tab) {
        int min = tab[0];

        for (int i = 1; i < tab.length; i++) {
            min = Math.min(min, tab[i]);
        }
        return min;
    }

    public static int ileMinimalnych(int[] tab) {
        int ile = 0;
        int min = min(tab);

        for (int j : tab) {
            if (j == min) {
                ile++;
            }
        }
        return ile;
    }

    public static int ileUnikalnych(int[] tab) {
        int ile = 1;
        int n = tab.length;
        int j;
        for (int i = 1; i < n; i++) {
            for (j = 0; j < i; j++)
                if (tab[i] == tab[j])
                    break;

            if (i == j)
                ile++;
        }
        return ile;
    }

    public static int sumaDodatnich(int[] tab) {
        int suma = 0;
        for (int j : tab) {
            if (j > 0) {
                suma += j;
            }
        }
        return suma;
    }

    public static int sumaUjemnych(int[] tab) {
        int suma = 0;
        for (int j : tab) {
            if (j < 0) {
                suma += j;
            }
        }
        return suma;
    }

    public static double sumaOdwrotnosci(int[] tab) {
        double suma = 0;
        for (int j : tab) {
            suma += (double) 1 / j;
        }
        return suma;
    }

    public static float sredniaArytmetyczna(int[] tab) {
        int suma = 0;
        for (int j : tab) {
                suma += j;
        }
        return (float) suma /tab.length;
    }

    public static double sredniaGeometryczna(int[] tab) {
        double iloczyn = 1;
        for (int j : tab) {
            if (j < 0) { return 0.0; }
            iloczyn *= j;
        }
        return Math.pow(iloczyn, 1.0/ tab.length);
    }

    public static double sredniaHarmoniczna (int[] tab) {
        return (double) tab.length/sumaOdwrotnosci(tab);
    }
}
