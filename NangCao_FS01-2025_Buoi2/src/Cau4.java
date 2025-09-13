import java.util.Scanner;  // Thư viện Scanner để nhập dữ liệu

public class Cau4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để nhập điểm

        System.out.print("Nhập điểm (0-100): ");
        int score = scanner.nextInt(); // Nhập điểm từ bàn phím

        // Sử dụng if-else để phân loại theo thang điểm
        if (score >= 85) {
            System.out.println("Giỏi");
        } else if (score >= 65) {
            System.out.println("Khá");
        } else if (score >= 50) {
            System.out.println("Trung bình");
        } else {
            System.out.println("Yếu");
        }

    }
}
