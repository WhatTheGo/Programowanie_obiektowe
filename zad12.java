// Zad 12

class HelloWorld {
    public static void main(String[] args) {
        String myStr = "Dzisiaj jest (%d-%d-%d) godzina (%d:%d:%d)";
        String result = String.format(myStr, 10, 12, 2024, 21, 12, 23);
        System.out.println(result);
    }
}
