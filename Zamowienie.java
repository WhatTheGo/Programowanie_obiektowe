public class Zamowienie {
    KoszykZakupowy koszyk;
    String status;

    public Zamowienie(){
        this.koszyk = new KoszykZakupowy();
        this.status = "Unkown";
    }
    public Zamowienie(KoszykZakupowy koszyk){
        this.koszyk = koszyk;
        this.status = "Unkown";
    }
    public Zamowienie(KoszykZakupowy koszyk, String status){
        this.koszyk = koszyk;
        this.status = status;
    }

    public void ustawStatusZamowienia(String status) {
        this.status = status;
    }

    public void wyswietlZamowienie() {
        this.koszyk.wyswietlZawartoscKoszyka();
        System.out.println("status: " + this.status);
    }
}
