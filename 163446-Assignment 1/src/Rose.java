class Rose extends Flower implements FlowerBehavior {

    public Rose(String color) {
        super(color);
    }

    @Override
    void fragrance() {
        System.out.println("Rose has a sweet fragrance.");
    }

    @Override
    public void bloom() {
        System.out.println("Rose blooms beautifully in spring!.");
    }
}