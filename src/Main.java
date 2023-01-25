public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("General Monkee", "Huge", 400);
        Dog dog = new Dog("Golden", 100, "Medium", "rounnd", "long");
        Dog defaultDoge = new Dog("Shelty", 20);

        doAnimalStuff(animal, "Slow");
        doAnimalStuff(dog, "V Fast");
        doAnimalStuff(defaultDoge, "Slow");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("______________________");
    }
}