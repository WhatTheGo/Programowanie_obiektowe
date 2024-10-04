// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        String myStr = "Grzesiek nie wiedzial dlaczego %s jest tak drapieznym %s mimo, ze jego %s na to nie wskazuje.";
        String result = String.format(myStr, "hello", "World!", "wzrost");
        System.out.println(result);

    }
}
