package oop1.ex;

public class Account {
    int balance; // 잔액

    /**
     * 입금
     */
    void deposit(int amount) {
        balance += amount; // 잔액 증가
    }

    /**
     * 출금
     */
    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount; // 잔액 감소
        } else {
            System.out.println("잔액 부족");
        }
    }
}
