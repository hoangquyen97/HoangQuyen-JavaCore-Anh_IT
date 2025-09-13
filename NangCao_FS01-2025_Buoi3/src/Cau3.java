// Dùng for tính tổng các số từ 1 → 100 và in ra kết quả
public class Cau3 { // khai báo lớp chính
    public static void main(String[] args) { // phương thức main — điểm bắt đầu của chương trình
        int sum = 0; // biến tích lũy tổng, khởi tạo bằng 0
        for (int i = 1; i <= 100; i++) { // duyệt i từ 1 tới 100
            sum += i; // cộng dồn: sum = sum + i
        }
        System.out.println("Tổng = " + sum); // in kết quả tổng

    }
}