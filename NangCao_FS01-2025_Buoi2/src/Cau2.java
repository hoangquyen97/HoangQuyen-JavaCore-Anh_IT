import java.util.Scanner;  // Thư viện Scanner để nhập dữ liệu từ bàn phím

public class Cau2 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập vào tuổi
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();  // Đọc số nguyên người dùng nhập vào, lưu vào biến age

        // Kiểm tra tuổi có đủ điều kiện lái xe hay không
        if (age >= 18) {
            // Nếu tuổi lớn hơn hoặc bằng 18 thì in ra thông báo đủ điều kiện
            System.out.println("Đủ điều kiện lái xe");
        } else {
            // Ngược lại thì in ra thông báo chưa đủ điều kiện
            System.out.println("Chưa đủ điều kiện");
        }


    }
}
