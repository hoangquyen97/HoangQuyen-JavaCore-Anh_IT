import java.util.Random;  // Thư viện để sinh số ngẫu nhiên

// Định nghĩa lớp Player
public class Player {
    // ====== Biến instance (thuộc về từng người chơi) ======
    private String name;   // tên người chơi
    private int hp;        // số máu hiện tại của người chơi

    // ====== Biến static (dùng chung cho tất cả người chơi) ======
    private static final int MAX_HP = 100;  // số máu tối đa cho mọi người chơi

    // ====== Constructor ======
    // Hàm khởi tạo: khi tạo Player mới, gán tên và đặt số máu = MAX_HP
    public Player(String name) {
        this.name = name;    // gán tên cho người chơi
        this.hp = MAX_HP;    // khởi tạo số máu = 100
    }

    // ====== Phương thức attack: tấn công đối thủ ======
    public void attack(Player enemy) {
        // Biến local damage: sát thương gây ra (ngẫu nhiên từ 10 đến 30)
        Random rand = new Random();
        int damage = rand.nextInt(21) + 10; // nextInt(21) -> [0..20], +10 -> [10..30]

        // Trừ máu của đối thủ
        enemy.hp -= damage;

        // Nếu máu < 0 thì cho về 0 để tránh âm
        if (enemy.hp < 0) {
            enemy.hp = 0;
        }

        // In ra thông tin sau lượt tấn công
        System.out.println(this.name + " tấn công " + enemy.name +
                " gây " + damage + " sát thương.");
        System.out.println("Máu còn lại của " + enemy.name + ": " + enemy.hp);
        System.out.println("-------------------------");
    }

    // ====== Hàm main: chạy chương trình mô phỏng ======
    public static void main(String[] args) {
        // Tạo 2 người chơi
        Player p1 = new Player("Người chơi A");
        Player p2 = new Player("Người chơi B");

        // Mô phỏng 3 lượt đánh nhau
        System.out.println("=== Trận đấu bắt đầu! ===");
        for (int i = 1; i <= 3; i++) {
            System.out.println("== Lượt " + i + " ==");
            p1.attack(p2);  // Người chơi A tấn công B
            p2.attack(p1);  // Người chơi B tấn công A
        }

        // In kết quả sau 3 lượt
        System.out.println("=== Trận đấu kết thúc! ===");
        System.out.println(p1.name + " còn lại: " + p1.hp + " máu.");
        System.out.println(p2.name + " còn lại: " + p2.hp + " máu.");
    }
}

