public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
    public Produkt() {
        this.nazwa = "Unknown";
        this.cena = 0;
        this.iloscNaMagazynie = 0;
    }

    public void wyswietlInformacje(){
        System.out.println("nazwa: " + this.nazwa);
        System.out.println("cena: " + this.cena);
        System.out.println("iloscNaMagazynie: " + this.iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int n){
        this.iloscNaMagazynie += n;
    }
    public void dodajDoMagazynu(){
        this.iloscNaMagazynie += 1;
    }

    public boolean usunZMagazynu(int n){
        if (this.iloscNaMagazynie - n >= 0) {
            this.iloscNaMagazynie -= n;
        }
        else {
            System.out.println("nie można usunąć");
            return false;
        }
        return true;
    }
    public void usunZMagazynu(){
        if (this.iloscNaMagazynie - 1 >= 0) {
            this.iloscNaMagazynie -= 1;
        }
        else {
            System.out.println("nie można usunąć więcej");
        }
    }
}
