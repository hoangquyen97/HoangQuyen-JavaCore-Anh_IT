import java.util.Scanner;

public class Cau9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số thứ nhất
        System.out.print("Nhập số thứ nhất: ");
        double so1 = scanner.nextDouble();

        // Nhập số thứ hai
        System.out.print("Nhập số thứ hai: ");
        double so2 = scanner.nextDouble();

        // Nhập toán tử (+, -, *, /)
        System.out.print("Nhập toán tử (+, -, *, /): ");
        char toanTu = scanner.next().charAt(0);

        double ketQua;

        // Sử dụng switch-case để xử lý toán tử
        switch (toanTu) {
            case '+':
                ketQua = so1 + so2;
                System.out.println("Kết quả: " + ketQua);
                break;
            case '-':
                ketQua = so1 - so2;
                System.out.println("Kết quả: " + ketQua);
                break;
            case '*':
                ketQua = so1 * so2;
                System.out.println("Kết quả: " + ketQua);
                break;
            case '/':
                if (so2 != 0) { // kiểm tra mẫu khác 0
                    ketQua = so1 / so2;
                    System.out.println("Kết quả: " + ketQua);
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0!");
                }
                break;
            default:
                System.out.println("Toán tử không hợp lệ!");
        }

    }
}
