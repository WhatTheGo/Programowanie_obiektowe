public class Main {
    public static <T> boolean isEqualOrNull(T o1, T o2){
        if (o1 == null && o2 == null) return true;
        if (o1 == null || o2 == null) return false;
        return o1.equals(o2);
    }

    public static void main(String[] args) {

    }
}