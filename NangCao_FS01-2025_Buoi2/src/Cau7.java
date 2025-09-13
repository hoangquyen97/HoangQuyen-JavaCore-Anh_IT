import java.util.Scanner;  // Thư viện Scanner để nhập dữ liệu

public class Cau7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner

        // Nhập tuổi từ bàn phím
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        // Xác định giá vé dựa vào độ tuổi
        if (age < 12) {
            System.out.println("Giá vé: 20.000đ");
        } else if (age <= 17) {  // từ 12 đến 17 tuổi
            System.out.println("Giá vé: 40.000đ");
        } else { // từ 18 tuổi trở lên
            System.out.println("Giá vé: 60.000đ");
        }

    }
}

