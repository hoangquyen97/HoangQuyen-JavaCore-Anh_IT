// 4 Thư viện Java
import java.util.ArrayList; //danh sách động có thể thay đổi kích thước
import java.util.Collections; //Chứa các phương thức static để sắp xếp, tìm kiếm, đảo ngược,...
import java.util.Comparator; //Định nghĩa cách so sánh các đối tượng để sắp xếp
import java.util.Scanner; //Đọc dữ liệu đầu vào từ người dùng

public class GarageManager {
    private ArrayList<Vehicle> vehicles; // Danh sách tất cả xe
    private static int totalVehicles = 0;  // Tổng số xe - biến static
    private Scanner scanner;

    public GarageManager() {
        vehicles = new ArrayList<>(); // Khởi tạo danh sách rỗng
        scanner = new Scanner(System.in); // Khởi tạo scanner để nhập liệu
    }

    public void runMenu() {
        int choice; // Biến lưu lựa chọn người dùng
        do {
            displayMenu(); // Hiển thị menu
            choice = scanner.nextInt(); // Đọc số nguyên từ bàn phím
            scanner.nextLine(); //QUAN TRỌNG: Xóa ký tự xuống dòng trong bộ nhớ đệm

            switch (choice) {
                case 1: addVehicle(); break;
                case 2: removeVehicle(); break;
                case 3: displayAllVehicles(); break;
                case 4: searchByBrand(); break;
                case 5: sortByPrice(); break;
                case 6: sortByYear(); break;
                case 0: System.out.println("Thoát chương trình!");break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    private void displayMenu() {
        System.out.println("\n===== QUẢN LÝ GARA XE =====");
        System.out.println("1. Thêm xe mới");
        System.out.println("2. Xóa xe theo ID");
        System.out.println("3. Hiển thị danh sách xe");
        System.out.println("4. Tìm kiếm xe theo hãng");
        System.out.println("5. Sắp xếp xe theo giá tăng dần");
        System.out.println("6. Sắp xếp xe theo năm sản xuất giảm dần");
        System.out.println("0. Thoát");
        System.out.println("===========================");
        System.out.print("Nhập lựa chọn: ");
    }

    //CHỨC NĂNG 1-THÊM XE MỚI
    private void addVehicle() {
        System.out.println("\n--- THÊM XE MỚI ---");
        System.out.print("Chọn loại xe (1-Car, 2-Truck): ");
        int type = scanner.nextInt();  // Đọc lựa chọn loại xe
        scanner.nextLine(); // Xóa ký tự enter

        System.out.print("Hãng xe: ");
        String brand = scanner.nextLine();
        //Đọc giá trị user nhập không bao gồm enter, lưu giá trị vào biến brand- kiểu String

        System.out.print("Dòng xe: ");
        String model = scanner.nextLine();

        System.out.print("Năm sản xuất: ");
        int year = scanner.nextInt();

        System.out.print("Giá xe: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Màu xe: ");
        String color = scanner.nextLine();

        if (type == 1) { // Nếu chọn Car
            System.out.print("Số ghế: ");
            int seatCount = scanner.nextInt();
            vehicles.add(new Car(brand, model, year, price, color, seatCount));
            // Tạo object Car và thêm vào ArrayList Vehicles

        } else if (type == 2) { // Nếu chọn Truck
            System.out.print("Tải trọng: ");
            double loadCapacity = scanner.nextDouble();
            vehicles.add(new Truck(brand, model, year, price, color, loadCapacity));
            // Tạo object Car và thêm vào vào ArrayList Vehicles
        }

        totalVehicles++; // Tăng biến đếm tổng số xe
        System.out.println("Thêm xe thành công!");
    }

    //CHỨC NĂNG 2-XÓA XE THEO ID
    private void removeVehicle() {
        System.out.print("\nNhập ID xe cần xóa: ");
        int id = scanner.nextInt();

        for (int i = 0; i < vehicles.size(); i++) {
            // So sánh ID của xe thứ i với ID cần tìm
            if (vehicles.get(i).getId() == id) {
                vehicles.remove(i);
                totalVehicles--;
                System.out.println("Xóa xe thành công!");
                return;
            }
        }
        // Nếu chạy đến đây = không tìm thấy xe
        System.out.println("Không tìm thấy xe với ID: " + id);
    }

    //CHỨC NĂNG 3-HIỂN THỊ DANH SÁCH XE
    private void displayAllVehicles() {
        System.out.println("\n--- DANH SÁCH XE ---");
        if (vehicles.isEmpty()) {
            System.out.println("Danh sách xe trống!");
            return;
        }

        // Sử dụng for-each loop
        for (Vehicle vehicle : vehicles) { //Với mỗi XE trong Vehicles
            System.out.println(vehicle); // Gọi in ra ToString của Vehicles
        }

        System.out.println("\nTổng số xe: " + totalVehicles);
        if (totalVehicles > 20) {
            System.out.println("Gara lớn");
        } else {
            System.out.println("Gara nhỏ");
        }
    }

    //CHỨC NĂNG 4-TÌM KIẾM THEO HÃNG XE
    private void searchByBrand() {
        System.out.print("\nNhập hãng xe cần tìm: ");
        String brand = scanner.nextLine();

        boolean found = false; //Mặc định chưa tìm thấy xe nào
        System.out.println("--- KẾT QUẢ TÌM KIẾM ---");

        // Sử dụng for loop
        for (int i = 0; i < vehicles.size(); i++) { //Với mỗi XE trong Vehicles
            if (vehicles.get(i).getBrand().equalsIgnoreCase(brand)) { // equalsIgnoreCase: so sánh KHÔNG phân biệt hoa thường
                System.out.println(vehicles.get(i));
                found = true; //Gán found = true - in ra xe đó
            }
        }

        if (!found) { // !found = not found
            System.out.println("Không tìm thấy xe hãng: " + brand);
        }
    }

    //CHỨC NĂNG 5-SẮP XẾP THEO GIÁ TĂNG DẦN
    private void sortByPrice() {
        Collections.sort(vehicles, new Comparator<Vehicle>() { //Phương thức sắp xếp danh sách
            @Override
            public int compare(Vehicle v1, Vehicle v2) {
                return Double.compare(v1.getPrice(), v2.getPrice()); //Nếu v1-v2 <0 v1 đứng trước v2
            }
        });
        System.out.println("Đã sắp xếp theo giá tăng dần!");
        displayAllVehicles();  // Hiển thị kết quả sau khi sắp xếp
    }

    //CHỨC NĂNG 6-SẮP XẾP THEO NĂM SẢN XUẤT GIẢM DẦN
    private void sortByYear() {
        Collections.sort(vehicles, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle v1, Vehicle v2) {
                return Integer.compare(v2.getYear(), v1.getYear()); //Nếu v1-v2 <0 v2 đứng trước v1
            }
        });
        System.out.println("Đã sắp xếp theo năm sản xuất giảm dần!");
        displayAllVehicles();
    }
}
