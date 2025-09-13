import java.util.Scanner;  // Thư viện Scanner để nhập dữ liệu từ bàn phím

public class Cau1 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu người dùng nhập vào
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập vào một số nguyên
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();  // Đọc giá trị số nguyên do người dùng nhập

        // Kiểm tra số đó có chia hết cho 2 hay không
        if (number % 2 == 0) {
            // Nếu chia hết cho 2 thì in ra "Số chẵn"
            System.out.println("Số chẵn");
        } else {
            // Ngược lại thì in ra "Số lẻ"
            System.out.println("Số lẻ");
        }


    }
}
