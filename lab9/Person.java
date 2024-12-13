public record Person(String imie, int wiek) {
    public Person(String imie, int wiek) {
        this.imie = imie;
        if (wiek >= 0) this.wiek = wiek;
        else this.wiek = 0;
    }
}
