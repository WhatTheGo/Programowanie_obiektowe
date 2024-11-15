public class Kolos2 {
    public static int[] zad1(int n, int m, int a1, int[] r){
        int [] wynik = new int[n];
        wynik[0] = a1;

        for(int i = 0; i < n; i++){
            int suma = a1;
            for(int j = 0; j < m; j++){
                suma += Math.pow(i, j+1)*r[j];
            }
            wynik[i] = suma;
        }
        return wynik;
    }

    public static boolean zad2(int[] tab){
        int r = tab[1] - tab[0];
        for(int i = 2; i < tab.length; i++){
            if(tab[i] - tab[i-1] != r){
                return false;
            }
        }
        return true;
    }

    public static boolean zad3(int[] tab, int m){
        int[] wynik = new int[tab.length - m + 1];
        for (int i = 0; i < m-1; i++){
            for (int j = 0; j < tab.length-1-i; j++){
                tab[j] = tab[j+1] - tab[j];
            }
        }
        for(int i = 0; i < wynik.length; i++){
            wynik[i] = tab[i];
            System.out.print(wynik[i] + " ");
        }
        return zad2(wynik);
    }

    public static void zad6(int n, int c){
        System.out.println(c);
        while(n>1){
            if(c%2==0){
                c/=2;
            }else{
                c=c*3+1;
            }
            n--;
            System.out.println(c);
        }
    }

    public static void zad7(int n, int c){
        int min=c;
        int max=c;
        while(n>1){
            if(c%2==0){
                c/=2;
            }else{
                c=c*3+1;
            }
            if(c>max){
                max=c;
            }
            if(c<min){
                min=c;
            }
            n--;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    public static void main(String[] args) {
        int[] tab = zad1(10,3,1,new int[]{3, 1, 3});
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println(zad2(tab));
        System.out.println(zad3(tab, 3));
        zad6(5,6);
        zad7(5,6);
    }
}
