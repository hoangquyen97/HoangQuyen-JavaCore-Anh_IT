public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String model, int year, double price, String color, double loadCapacity) {
        super(brand, model, year, price, color, "Truck");
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double applyDiscount() {
        return this.getPrice() * 0.80; // Giảm 20%
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Tải trọng: %.1f | Giá sau giảm: %.2f",
                loadCapacity, applyDiscount());
    }

    // Getter và Setter cho loadCapacity
    public double getLoadCapacity() { return loadCapacity; }
    public void setLoadCapacity(double loadCapacity) { this.loadCapacity = loadCapacity; }
}