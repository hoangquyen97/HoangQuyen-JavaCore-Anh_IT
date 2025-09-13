//Cho mảng {3, 7, 2, 9, 5}. Dùng for-each để tìm số lớn nhất
public class Cau7 { // khai báo lớp chính
    public static void main(String[] args) { // phương thức main — điểm bắt đầu của chương trình
        int[] arr = {3, 7, 2, 9, 5}; // khai báo và khởi tạo mảng
        int max = arr[0]; // khởi tạo max bằng phần tử đầu tiên (tiêu chuẩn khi tìm max)
        for (int value : arr) { // for-each: duyệt từng phần tử value trong mảng arr
            if (value > max) { // nếu phần tử hiện tại lớn hơn max hiện tại
                max = value; // cập nhật lại max
            }
        }
        System.out.println("Số lớn nhất = " + max); // in kết quả số lớn nhất
    }
}