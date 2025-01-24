package method.ex;

public class MethodEx3 {
    static int balance = 10000;

    public static void main(String[] args) {

        // 입금 1000원
        deposit( 1000);

        // 출금 2000
        withdraw( 2000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
    }

    public static void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
    }
}
