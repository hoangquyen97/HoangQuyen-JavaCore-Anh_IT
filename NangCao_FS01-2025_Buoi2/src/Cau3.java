import java.util.Scanner;  // Thư viện Scanner để nhập dữ liệu từ bàn phím

public class Cau3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner để nhập điểm

        System.out.print("Nhập điểm (0-100): ");
        int score = scanner.nextInt(); // Nhập điểm từ bàn phím và lưu vào biến score

        if (score >= 50) { // Kiểm tra nếu điểm >= 50
            System.out.println("Qua môn"); // Nếu đúng thì in "Qua môn"
        } else {
            System.out.println("Trượt"); // Nếu sai thì in "Trượt"
        }

    }
}

