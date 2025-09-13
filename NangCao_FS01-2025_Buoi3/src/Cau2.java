//Dùng while in ra các số chẵn trong khoảng 2 → 200
public class Cau2 { // khai báo lớp chính
    public static void main(String[] args) { // phương thức main — điểm bắt đầu của chương trình
        System.out.println("In các số chẵn từ 2 đến 200"); // tiêu đề bài 2
        int i = 2; // bắt đầu từ 2 (số chẵn đầu tiên trong dải)
        while (i <= 200) { // lặp tới khi even vượt quá 200
            System.out.print(i + " "); // in giá trị hiện tại
            i += 2; // tăng thêm 2 để luôn giữ số chẵn
        }
    }
}