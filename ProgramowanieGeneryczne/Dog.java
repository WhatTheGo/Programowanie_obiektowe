public class Dog extends Animal {
    private int age;
    public Dog(int wiek, String imie, int age) {
        super(wiek, imie);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", wiek=" + wiek +
                ", imie='" + imie + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
