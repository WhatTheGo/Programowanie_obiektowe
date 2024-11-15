public class Kolokwium_1 {
    public static void main(String[] args) {
        System.out.println("Zad1");
        System.out.println(dokladnosc(5, 5.02, 2));
        System.out.println("Zad2");
        System.out.println(najblizszySasiad(48));
        System.out.println("Zad3");
        System.out.println(pierwiastek(125, 3, 4));

        int[] tab1 = {4, 5, 8, 7, 6, 5, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Zad4");
        System.out.println(podciag(tab1));
        int[] tab2 = {8, 6, 4, 5, 10, 8};
        System.out.println("Zad5");
        System.out.println(podciag(tab2, 2));
        System.out.println("Zad6");
        System.out.println(czyPalindrom(12321));
        System.out.println("Zad7");
        palindromLiczbowy(2);
    }

    public static void palindromLiczbowy(int m){
        int num1 = 1;
        for(int i=0; i<m-1; i++){
            num1 = num1*10;
        }
        int num2 = num1;
        for (int x = num1; x<num1*10; x++){
            for (int y = num2; y<num2*10; y++){
                int wynik = x*y;
                if (czyPalindrom(wynik)){
                    System.out.println(x + " * " + y + " = " + wynik);
                    return;
                };
            }
        }
        System.out.println("nie znaleziono");
    }

    public static int numberLength(int n) {
        int numLen = 1;
        while(n >= 10){
            n = n/10;
            numLen++;
        }
        return numLen;
    }

    public static int[] numToArray(int n) {
        int numLen = numberLength(n);
        int[] tab = new int[numLen];
        for (int i = 0; i < numLen; i++) {
            int pom = n;
            n = n/10;
            tab[i] = pom - (n*10);
        }
        return tab;
    }

    public static boolean czyPalindrom(int n){
        int numLen = numberLength(n);
        int[] tab = numToArray(n);
        for (int i = 0; i < numLen/2; i++) {
            if(tab[i] != tab[numLen - i - 1]){
                return false;
            }
        }
        return true;
    }

    public static int podciag(int[] tab, int r){
        int wynik = 1;
        int max = wynik;
        for (int i=0; i<tab.length-1; i++) {
            if (tab[i+1] + r == tab[i]) {
                wynik++;
            }
            else {
                if(wynik>max) {
                    max = wynik;
                }
                wynik=1;
            }
        }
        if(wynik>max) {
            max = wynik;
        }
        return max;
    }

    public static int podciag(int[] tab){
        int wynik = 1;
        int max = wynik;
        for (int i=0; i<tab.length-1; i++) {
            if (tab[i+1]<tab[i]) {
                wynik++;
            }
            else {
                if(wynik>max) {
                    max = wynik;
                }
                wynik=1;
            }
        }
        if(wynik>max) {
            max = wynik;
        }
        return max;
    }

    public static double bezwzegledna(double x){
        if (x<0){ return -x; }
        return x;
    }

    public static boolean dokladnosc(double x, double y, int k){
        double roznica = bezwzegledna(x-y);
        if (roznica <= Math.pow(10, -k)){
            return true;
        }
        return false;
    }

    public static int najblizszySasiad(double S){
        int x = (int) Math.sqrt(S);
        if(Math.abs(S-Math.pow(x,2)) > Math.abs((S-Math.pow(x+1, 2)))){
            return x+1;
        }
        return x;
    }

    public static double pierwiastek(double S, int n, int k){
        double x = (double) najblizszySasiad(S);
        double x_next = ((n-1)*x + (S/(Math.pow(x,n-1))))/n;

        while (!dokladnosc(x, x_next, k)){
            x = x_next;
            x_next = ((n-1)*x + (S/(Math.pow(x,n-1))))/n;
        }
        return x_next;
    }
}
