import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        BookDTO book = new BookDTO("tutuł", "Bob", 2.50, 1234);
        System.out.println(book);

        MusicAlbum musicAlbum = new MusicAlbum("Budowa", "Bob Budowniczy", new ArrayList<>());
        System.out.println(musicAlbum);
        musicAlbum.DodajOcene(5.2);
        System.out.println(musicAlbum);

        RockAlbum rockAlbum = new RockAlbum("Foreigner", "Foreigner", new ArrayList<>(), "Rock");
        System.out.println(rockAlbum);

        Person2 person2 = new Person2("Bob", "Budowniczy",
                new Address("ulica", 1231, "213123-342", "Olsztyn"));
        System.out.println(person2);

        PointC p = new PointC(5, 10);
        System.out.println(p);
        PointR p2 = p.konwertujDoPointR();
        System.out.println(p2);
        PointC p3 = p2.konwertujDoPointC();
        p3.setX(45);
        System.out.println(p3);

        Book ksiazka = new Book("Wiedźmin", "Andrzej Sapkowski", 1999);
        System.out.println(ksiazka.Describe());

        Point2D point = new Point2D(5, 10);
        Point2D point2 = new Point2D(10, 15);
        System.out.println(point.distance(point2));

        Car car = new Car("brand", "model", 8.5);
        System.out.println(car.fuelCost(5.5, 524.5));

        Person person = new Person("asdas", 567);
        System.out.println(person);

        BankAccount bankAccount = new BankAccount(12312334);
        System.out.println(bankAccount);

        System.out.println(Objects.equals(null, "das"));
    }
}