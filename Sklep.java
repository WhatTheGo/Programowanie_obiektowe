import java.util.ArrayList;

public class Sklep {
    ArrayList<Produkt> listaProduktow;

    public Sklep() {
        listaProduktow = new ArrayList<>();
    }
    public Sklep(ArrayList<Produkt> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    public void dodajProdukt(Produkt produkt) {
        if (!listaProduktow.contains(produkt)) {
            listaProduktow.add(produkt);
        }
        else {
            System.out.println("Produkt juz znajduje się w magazynie!");
        }
    }

    public void wyswietlOferty() {
        System.out.println("Oferta:");
        for (Produkt produkt : listaProduktow) {
            System.out.println(produkt.nazwa + " " + produkt.iloscNaMagazynie);
        }
    }
}
