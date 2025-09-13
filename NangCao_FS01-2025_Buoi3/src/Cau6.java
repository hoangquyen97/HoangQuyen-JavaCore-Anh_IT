// Dùng while in ra dãy số đếm ngược từ 10 → 1. Sau đó in "Hết giờ!"
public class Cau6 { // khai báo lớp chính
    public static void main(String[] args) { // phương thức main — điểm bắt đầu của chương trình
        int count = 10; // bắt đầu từ 10
        while (count >= 1) { // lặp tới khi count xuống còn 1
            System.out.println(count); // in giá trị hiện tại
            count--; // giảm count đi 1 sau mỗi vòng
        }
        System.out.println("Hết giờ!"); // in thông báo khi kết thúc
    }
}