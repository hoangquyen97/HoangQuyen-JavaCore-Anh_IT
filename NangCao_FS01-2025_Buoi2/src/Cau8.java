import java.util.Scanner;  // Thư viện Scanner

public class Cau8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner

        // Nhập số tháng từ bàn phím
        System.out.print("Nhập số tháng (1-12): ");
        int month = scanner.nextInt();

        // Dùng switch-case để xác định mùa
        switch (month) {
            case 3: case 4: case 5:
                System.out.println("Mùa Xuân");
                break;
            case 6: case 7: case 8:
                System.out.println("Mùa Hạ");
                break;
            case 9: case 10: case 11:
                System.out.println("Mùa Thu");
                break;
            case 12: case 1: case 2:
                System.out.println("Mùa Đông");
                break;
            default:
                System.out.println("Tháng không hợp lệ!");
        }

    }
}

