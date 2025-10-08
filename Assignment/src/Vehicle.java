public class Vehicle {
    // Biến static - thuộc về class, không thuộc về object
    private static int nextId = 1;  // Dùng chung cho tất cả Vehicle, tự động tăng

    // Biến instance - mỗi object có giá trị riêng
    private int id;          // Mã xe (unique)
    private String brand;    // Hãng xe
    private String model;    // Dòng xe
    private int year;        // Năm sản xuất
    private double price;    // Giá xe
    private String color;    // Màu xe
    private String type;     // Loại xe

    // Constructor overloading
    public Vehicle() {
        this.id = nextId++; // Gán id = nextId hiện tại, SAU ĐÓ tăng nextId lên 1
    }

    public Vehicle(String brand, String model, int year, double price, String color, String type) {
        this();
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    // Getter và Setter cho tất cả thuộc tính
     // GETTERS- để ĐỌC giá trị
    public int getId() { return id; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getColor() { return color; }

    // SETTERS- để GHI giá trị
    public void setId(int id) { this.id = id; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(double price) { this.price = price; }
    public void setColor(String color) { this.color = color; }

    // Phương thức applyDiscount()
    public double applyDiscount() {
        return this.price;
        // Giá mặc định chưa giảm=> Mặc định: Trả về giá gốc this.price (không giảm giá)
        //Trong class con(Car & Truck): Có thể override để áp dụng công thức giảm giá riêng
    }

    @Override
    public String toString() {
        return String.format("ID: %d | %s %s | Năm: %d | Giá: %.2f | Màu: %s | Loại: %s",
                id, brand, model, year, price, color, type);
        //Trả về chuỗi mô tả đối tượng dưới dạng dễ đọc, Tự động gọi khi in đối tượng ra console
    }
}