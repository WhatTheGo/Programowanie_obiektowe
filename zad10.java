// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        String myStr = "%s to najlepsza ksiazka napisana przez %s.";
        String result = String.format(myStr, "Wiedzmin", "Andrzeja Sapkowskiego");
        System.out.println(result);

    }
}
