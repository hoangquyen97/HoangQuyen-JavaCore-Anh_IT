//Nhập vào số n. Dùng for để in bảng cửu chương của n
import java.util.Scanner; // import lớp Scanner để đọc dữ liệu từ bàn phím
public class Cau5 { // khai báo lớp chính
    public static void main(String[] args) { // phương thức main — điểm bắt đầu của chương trình
        // Tạo đối tượng Scanner để đọc dữ liệu người dùng nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n để tính bảng cửu chương: "); // yêu cầu nhập từ người dùng
        int n = scanner.nextInt(); // đọc một số nguyên n từ bàn phím
        System.out.println("Bảng cửu chương " + n); // tiêu đề cho bảng cửu chương

        for (int i = 1; i <= 10; i++) { // in từ 1 đến 10
            System.out.println(n + " x " + i + " = " + (n * i)); // in dòng: n x i = kết quả
        }
    }
    }