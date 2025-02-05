package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(); // 객체 생성

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);

        System.out.println("잔고: " + account.balance);
    }
}
