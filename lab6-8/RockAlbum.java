import java.util.ArrayList;

public class RockAlbum extends MusicAlbum{
    private String rockGenre;

    public RockAlbum(String title, String artist, ArrayList<Double> ratings, String rockGenre) {
        super(title, artist, ratings);
        this.rockGenre = rockGenre;
    }

    public String getRockGenre() {
        return rockGenre;
    }

    public void setRockGenre(String rockGenre) {
        this.rockGenre = rockGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RockAlbum rockAlbum = (RockAlbum) o;
        return getRockGenre().equals(rockAlbum.getRockGenre());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getRockGenre().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "RockAlbum{" +
                "title='" + getTitle() + '\'' +
                ", artist='" + getArtist() + '\'' +
                ", ratings=" + getRatings() +
                ", rockGenre='" + rockGenre + '\'' +
                '}';
    }
}
