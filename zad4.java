// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
        // First 
        for (int i=1; i<4; i++) {
            for (int j=0; j<10; j++) {
                System.out.print("  ");
            }
            for (int k=0; k<i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        
        for (int i=0; i<14; i++) {
            System.out.print(" *");
        }
        System.out.println();
        for (int i=0; i<15; i++) {
            System.out.print(" *");
        }
        System.out.println();
        for (int i=0; i<14; i++) {
            System.out.print(" *");
        }
        System.out.println();
        
        for (int i=3; i>0; i--) {
            for (int j=0; j<10; j++) {
                System.out.print("  ");
            }
            for (int k=0; k<i; k++) {
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
    }
}
