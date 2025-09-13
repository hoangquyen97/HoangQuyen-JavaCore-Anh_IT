//Cho mảng {1,2,3,4,5,6}. Dùng for-each để tính tổng các số chẵn trong mảng
public class Cau8 { // khai báo lớp chính
    public static void main(String[] args) { // phương thức main — điểm bắt đầu của chương trình
        int[] arr2 = {1, 2, 3, 4, 5, 6}; // khai báo mảng chứa các số
        int sumEven = 0; // biến để cộng tổng các số chẵn, khởi tạo 0
        for (int v : arr2) { // for-each duyệt từng phần tử v trong arr2
            if (v % 2 == 0) { // kiểm tra v có chia hết cho 2 hay không (số chẵn)
                sumEven += v; // cộng phần tử chẵn vào sumEven
            }
        }
        System.out.println("Tổng các số chẵn = " + sumEven); // in kết quả
    }
}