abstract class Flower {
    String color;

    public Flower(String color) {
        this.color = color;
    }

    abstract void fragrance();

    void displayColor() {
        System.out.println("This flower's color is: " + color);
    }
}
