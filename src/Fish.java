public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles() {
        System.out.println("Move Muscles");
    }

    private void moveBackfin() {
        System.out.println("Move back fin!");
    }

    @Override
    public void move(String speed) {
        System.out.println(type + " swims " + speed + " in the ocean.");
        moveMuscles();
        if (speed == "Fast") {
            moveBackfin();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
