public class BankAccount {
    // Khai báo biến instant: số TK (accountNumber-kiểu dữ liệu string) và số dư (balance-kiểu dữ liệu double)
    // private: chỉ được dùng trong class này
    private String accountNumber;
    private double balance;

    // Khai báo biến static: lãi suất (interestRate, kiểu dữ liệu double, gán giá trị 5%)
    private static double interestRate = 0.05; // 5%

    // Tạo BankAccount bao gồm accountNumber và balance
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber; //Gán giá trị truyền vào cho biến instant
        this.balance = balance; //Gán giá trị truyền vào cho biến instant
    }

    // Phương thức tính tiền lãi
    //Tạo biến tính tiền lãi -calculateInterest
    public double calculateInterest() {
        double interest = balance * interestRate; // biến local "interest"
        return interest; //trả về tiền lãi tính được
    }

    // In ra thông tin TK
    public void printAccountInfo() {
        System.out.println("Số tài khoản: " + accountNumber);//in TK
        System.out.println("Số dư: " + balance);//in số dư
        System.out.println("Tiền lãi: " + calculateInterest());//gọi hàm calculateInterest đã tạo ở trên để tính và in ra tiền lãi
        System.out.println("-----------------------------");//dòng ngăn cách giữa các TK
    }

    // Hàm main để tạo TK
    public static void main(String[] args) {
        // Tạo 2 tài khoản-Gán giá trị cho biến instant, lưu vào biến acc1/acc2 bằng constructor
        BankAccount acc1 = new BankAccount("123456", 1000000);
        BankAccount acc2 = new BankAccount("789012", 2000000);

        // Gọi phương thức in thông tin cho từng TK
        acc1.printAccountInfo();
        acc2.printAccountInfo();
    }
}