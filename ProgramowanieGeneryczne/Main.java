public class Main {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static <T> void swap(T[] array, int i, int j) {
        if (i > array.length || j > array.length) {
            return;
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T extends Animal> Animal findMax(T element1, T element2){
        if (element1.wiek > element2.wiek) {
            return element1;
        }
        return element2;
    }

    public static <T> void findMinMax(Dog[] tab, Pair<?super Dog> result){
        Dog min = tab[0];
        Dog max = tab[0];
        for (Dog d : tab) {
            if (d.getAge() > max.getAge())
                max = d;
            if (d.getAge() < min.getAge())
                min = d;
        }
        result.first = min;
        result.second = max;
    }

    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.setObiekt("4234");
        System.out.println(b1.getObiekt());

        Box<Integer> b2 = new Box<>();
        b2.setObiekt(123);
        System.out.println(b2.getObiekt());

        Box<Integer> b3 = b2;

        System.out.println(isEqual(b3, b2));

        Animal animal1 = new Animal(43, "Cat");
        Dog dog1 = new Dog(45, "Dog1", 45);
        System.out.println(findMax(animal1, dog1));

        Dog dog2 = new Dog(44, "Dog2", 48);
        Dog dog3 = new Dog(44, "Dog3", 49);
        Dog[] tab1 = new Dog[] {dog1, dog2, dog3};
        Pair<Dog> pair = new Pair<>();
        findMinMax(tab1, pair);
        System.out.println(pair);
    }
}