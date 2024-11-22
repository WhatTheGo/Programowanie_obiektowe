public class Main {
    public static void main(String[] args) {
        System.out.println("Produkt\n");
        Produkt produkt = new Produkt("ziemniak", 2.50, 5);
        Produkt produkt2 = new Produkt("ziemniakPremium", 2.90, 5);
        produkt.wyswietlInformacje();

        System.out.println("\nKoszykZakupowy\n");
        KoszykZakupowy koszyk = new KoszykZakupowy();
        koszyk.dodajProdukt(produkt);
        koszyk.dodajProdukt(produkt);
        koszyk.dodajProdukt(produkt2);
        koszyk.wyswietlZawartoscKoszyka();
        koszyk.obliczCalkowitaWartosc();

        System.out.println("\nZamowienie\n");
        Zamowienie zamowienie = new Zamowienie(koszyk, "w drodze");
        zamowienie.wyswietlZamowienie();

        
    }
}