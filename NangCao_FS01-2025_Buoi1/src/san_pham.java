// Định nghĩa lớp SanPham
public class san_pham {
    // ====== Biến instance (mỗi sản phẩm có giá trị riêng) ======
    private String tenSanPham;  // khai báo tên sản phẩm
    private double gia;         //khai báo giá sản phẩm

    // ====== Biến static (dùng chung cho tất cả sản phẩm) ======
    private static int count = 0;  // biến đếm số lượng sản phẩm đã được tạo

    // ====== Constructor ======
    // hàm khởi tạo biến san_pham, truyền vào tên và giá
    public san_pham(String tenSanPham, double gia) {
        this.tenSanPham = tenSanPham;  // gán tên cho sản phẩm
        this.gia = gia;                // gán giá cho sản phẩm
        count++;  // mỗi lần tạo sản phẩm mới thì biến count tăng thêm 1
    }

    // ====== Phương thức in thông tin sản phẩm-tạo hàm hienThiThongTin ======
    public void hienThiThongTin() {
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Giá: " + gia + " VND");
        System.out.println("-------------------------");
    }

    // ====== Phương thức static in tổng số sản phẩm đã tạo ======
    public static void hienThiTongSoSanPham() {
        System.out.println("Tổng số sản phẩm đã tạo: " + count); //in ra màn hình biến count
    }

    // ====== Hàm main  ======
    public static void main(String[] args) {
        // Tạo 3 sản phẩm mới bằng constructor
        san_pham sp1 = new san_pham("Laptop", 15000000);
        san_pham sp2 = new san_pham("Điện thoại", 8000000);
        san_pham sp3 = new san_pham("Tai nghe", 1200000);

        // In thông tin từng sản phẩm
        sp1.hienThiThongTin();
        sp2.hienThiThongTin();
        sp3.hienThiThongTin();

        // In ra tổng số sản phẩm đã tạo
        san_pham.hienThiTongSoSanPham();
    }
}

