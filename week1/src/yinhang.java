
public class yinhang {
    String name;
    double balance;

    public yinhang(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void showBalance() {
        System.out.println(balance);
    }

    public static void main(String[] args) {
        yinhang money = new yinhang("ZYH",1893.0);
        money.showBalance();
    }
}