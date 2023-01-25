public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("General Monkee", "Huge", 400);
        Dog dog = new Dog("Golden", "Medium", 100);

        doAnimalStuff(animal, "Slow");
        doAnimalStuff(dog, "V Fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("______________________");
    }
}