public class Animal {
    int wiek;
    String imie;

    public Animal(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "wiek=" + wiek +
                ", imie='" + imie + '\'' +
                '}';
    }
}
