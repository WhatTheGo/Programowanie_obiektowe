import java.util.Scanner;

public class Zestaw2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Zad1");
        System.out.println(23.0 + 76);
        System.out.println(41 * 2.0 + 3);
        System.out.println(5 - 33);
        System.out.println(109 % 3);
        System.out.println(50 / 2);
        System.out.println(4 | 2);
        System.out.println(3 ^ 5);
        System.out.println(7 & 9);

        System.out.println("\nZad2");
        System.out.println((int) ((Math.sqrt(7) - 1) / 2 + Math.pow(3, 3) % 2));
        System.out.println((int) (2005 / (14 * 6)));
        System.out.println((int) (((3 + Math.sqrt(3)) / ((Math.sqrt(5) / 2) / 3)) + 1));
        System.out.println((int) 10 % 4 % 3);
        System.out.println((int) (9 % 6 + 1) / Math.pow(Math.sqrt(2), 4));

        zad3();
        zad4();
        zad5();
    }

    public static void zad3() {
        System.out.println("Zad3");
        System.out.println("Słowo 1: ");
        String word1 = scanner.nextLine();
        System.out.println("Słowo 2: ");
        String word2 = scanner.nextLine();
        System.out.println(word1 + " " + word2);
    }

    public static void zad4() {
        System.out.println("Zad4");
        System.out.println("Liczba 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Liczba 2: ");
        int num2 = scanner.nextInt();
        System.out.println("suma = " + (num1 + num2));
        System.out.println("różnica = " + (num1 - num2));
        System.out.println("iloczyn = " + (num1 * num2));
        System.out.println("iloraz = " + (num1 / num2));
    }

    public static void zad5() {
        System.out.println("Zad5");
        System.out.println("x: ");
        int x = scanner.nextInt();
        System.out.println("x+140 = " + (x + 140));
        System.out.println("x-31 = " + (x - 31));
        System.out.println("x*7= " + (x * 7));
        System.out.println("x/13 = " + (x / 13));
        System.out.println("x%4 = " + (x % 4));
        System.out.println("x^45 = " + (Math.pow(x, 45)));
        System.out.println("x|59 = " + (x | 59));
        System.out.println("x XOR 4 = " + (x ^ 4));
        System.out.println("x << 5 = " + (x << 5));
        System.out.println("x >> 6 = " + (x >> 6));
    }
}
