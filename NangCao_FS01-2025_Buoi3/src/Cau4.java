// Nhập vào số nguyên n. Dùng for để tính n! (giai thừa của n) ---
import java.util.Scanner; // import lớp Scanner để đọc dữ liệu từ bàn phím
public class Cau4 { // khai báo lớp chính
    public static void main(String[] args) { // phương thức main — điểm bắt đầu của chương trình
        // Tạo đối tượng Scanner để đọc dữ liệu người dùng nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n để tính n!: "); // yêu cầu nhập từ người dùng
        int n = scanner.nextInt(); // đọc một số nguyên n từ bàn phím
        long factorial = 1L; // dùng long để giảm khả năng tràn số; khởi tạo giai thừa = 1
        for (int i = 1; i <= n; i++) { // nhân dần từ 1 đến n
            factorial *= i; // factorial = factorial * i
        }
        System.out.println(n + "! = " + factorial); // in kết quả giai thừa
    }
}