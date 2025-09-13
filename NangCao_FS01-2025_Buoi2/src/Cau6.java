import java.util.Scanner;  // Import thư viện Scanner

public class Cau6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner

        // In menu ra màn hình
        System.out.println("Menu:");
        System.out.println("1. Cà phê");
        System.out.println("2. Trà sữa");
        System.out.println("3. Nước lọc");

        // Yêu cầu người dùng nhập lựa chọn
        System.out.print("Nhập số để chọn nước bạn muốn uống: ");
        int choice = scanner.nextInt(); // Đọc số người dùng nhập

        // Kiểm tra lựa chọn bằng switch-case
        switch (choice) {
            case 1:
                System.out.println("Cà phê");
                break;
            case 2:
                System.out.println("Trà sữa");
                break;
            case 3:
                System.out.println("Nước lọc");
                break;
            default:
                System.out.println("Không có trong menu");
        }

    }
}

