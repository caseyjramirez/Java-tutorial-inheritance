public class Dog extends Animal {
    private String earShape, tailShape;

//    default value constructor
    public Dog(String type, double weight) {
        this(type, weight, (weight < 15) ? "Small" : (weight < 35 ? "Medium" : "Large"), "DefaultValue", "DefaultValue");
    }

    public Dog(String type, double weight, String size, String earShape, String tailShape) {
        super(type, size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        System.out.println(type + " usually barks!");
        bark();

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed == "Slow") {
            walk();
        } else {
            run();
        }
    }

    private void bark() {
        System.out.println("bark!");
    }

    private void run() {
        System.out.println("Dog running!");
    }

    private void walk() {
        System.out.println("Dog walking!");
    }
}
