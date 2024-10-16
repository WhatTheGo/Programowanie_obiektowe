public class Zestaw1 {
    public static void main(String[] args) {
        System.out.println("Zad1");
        String imie = "michal bogdanski";
        System.out.println(imie);

        System.out.println("\nZad2");
        System.out.println(imie.length());


        System.out.println("\nZad3");
        String txt = "Ala".concat(" ma");
        txt = txt.concat(" kota");
        System.out.println(txt);


        System.out.println("\nZad4");

        // First
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 0; i < 14; i++) {
            System.out.print(" *");
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            System.out.print(" *");
        }
        System.out.println();
        for (int i = 0; i < 14; i++) {
            System.out.print(" *");
        }
        System.out.println();

        for (int i = 3; i > 0; i--) {
            for (int j = 0; j < 10; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }


        // Second

        System.out.println("     *     ");
        System.out.println("    * *    ");
        System.out.println("   * * *    ");
        System.out.println("  * * * *   ");
        System.out.println(" * * * * * ");
        System.out.println("* * * * * * ");
        System.out.println(" * * * * * ");
        System.out.println("  * * * *   ");
        System.out.println("   * * *    ");
        System.out.println("    * *    ");
        System.out.println("     *     ");


        System.out.println("\nZad5");
        System.out.println(txt.replace("a", "e"));


        System.out.println("\nZad6");
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());


        System.out.println("\nZad7");
        System.out.println((int) 'A');
        System.out.println((int) '!');
        System.out.println((int) '@');
        System.out.println((int) '>');
        System.out.println((int) '~');
        System.out.println((int) '\n');
        System.out.println((int) '\b');


        System.out.println("\nZad8");
        System.out.println("a-z = 97-122");
        System.out.println("A-B = 65-90");
        System.out.println("a-z = 48-57");


        System.out.println("\nZad9");
        String myStr1 = "Grzesiek nie wiedzial dlaczego %s jest tak drapieznym %s mimo, ze jego %s na to nie wskazuje.";
        String result1 = String.format(myStr1, "asd", "zxc", "qwe");
        System.out.println(result1);


        System.out.println("\nZad10");
        String myStr2 = "%s to najlepsza ksiazka napisana przez %s.";
        String result2 = String.format(myStr2, "Wiedzmin", "Andrzeja Sapkowskiego");
        System.out.println(result2);


        System.out.println("\nZad11");
        for (int i = 0; i < 5; i++) {
            System.out.print("wodrze ");
        }


        System.out.println("\n\nZad12");
        String myStr3 = "Dzisiaj jest (%d-%d-%d) godzina (%d:%d:%d)";
        String result3 = String.format(myStr3, 10, 12, 2024, 21, 12, 23);
        System.out.println(result3);


        System.out.println("\nZad13");
        System.out.println((char) 54);
        System.out.println((char) 103);
        System.out.println((char) 241);
        System.out.println((char) 67);
        System.out.println((char) 9999);
        System.out.println((char) imie.length());
        System.out.println((char) 174034);
    }
}
