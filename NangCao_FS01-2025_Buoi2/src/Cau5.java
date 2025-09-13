import java.util.Scanner;  // Import thư viện Scanner để nhập dữ liệu từ bàn phím

public class Cau5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner

        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt(); // Nhập số nguyên từ bàn phím

        // Kiểm tra số
        if (number > 0) {
            System.out.println("Số dương");
        } else if (number < 0) {
            System.out.println("Số âm");
        } else {
            System.out.println("Bằng 0");
        }

    }
}

