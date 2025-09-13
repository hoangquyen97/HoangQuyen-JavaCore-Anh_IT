// Định nghĩa lớp HocSinh
public class hoc_sinh {
    // ====== Biến instance (mỗi đối tượng có riêng) ======
    private String name;   // khai báo tên học sinh
    private int age;       // khai báo  tuổi học sinh
    private double gpa;    // khai báo điểm trung bình (GPA) của học sinh

    // ====== Biến static (dùng chung cho tất cả đối tượng) ======
    private static String schoolName = "Trường THPT ABC";

    // ====== Constructor ======
    // Hàm khởi tạo biến hoc_sinh: gán giá trị ban đầu cho name, age, gpa
    public hoc_sinh(String name, int age, double gpa) {
        this.name = name;   // "this.name" là biến instance, "name" là tham số truyền vào
        this.age = age;
        this.gpa = gpa;
    }

    // ====== Phương thức hiển thị thông tin học sinh-tạo hàm displayInfo ======
    public void displayInfo() {
        // Biến local rank: dùng trong phạm vi phương thức để xác định xếp loại
        String rank;

        // Kiểm tra GPA để xếp loại
        if (gpa >= 8.0) {
            rank = "Giỏi";
        } else if (gpa >= 6.5) {
            rank = "Khá";
        } else {
            rank = "Trung bình";
        }

        // In ra thông tin chi tiết
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Xếp loại: " + rank);
        System.out.println("Trường: " + schoolName); // schoolName dùng chung cho tất cả học sinh
        System.out.println("-------------------------");
    }

    // ====== Hàm main:  ======
    public static void main(String[] args) {
        // Tạo 2 đối tượng học sinh bằng constructor-hàm hoc_sinh đã tạo ở trên
        hoc_sinh sv1 = new hoc_sinh("Nguyễn Văn A", 16, 8.5);
        hoc_sinh sv2 = new hoc_sinh("Trần Thị B", 17, 7.0);

        // Gọi phương thức hiển thị thông tin cho từng học sinh-hàm displayInfo đã tạo ở trên
        sv1.displayInfo();
        sv2.displayInfo();
    }
}
