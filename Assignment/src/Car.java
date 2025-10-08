public class Car extends Vehicle {
    private int seatCount;

    public Car(String brand, String model, int year, double price, String color, int seatCount) {
        super(brand, model, year, price, color, "Car");
        this.seatCount = seatCount;
    }

    @Override
    public double applyDiscount() {
        return this.getPrice() * 0.85; // Giảm 15%
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Số ghế: %d | Giá sau giảm: %.2f",
                seatCount, applyDiscount());
    }

    // Getter và Setter cho seatCount
    public int getSeatCount() { return seatCount; }
    public void setSeatCount(int seatCount) { this.seatCount = seatCount; }
}