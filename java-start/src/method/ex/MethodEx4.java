package method.ex;

import java.util.Scanner;

// 문제 - 은행 계좌 입출금
public class MethodEx4 {
    static int balance = 0; // 초기 잔액

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("----------------------------------------");
            System.out.print("선택 : ");
            int option = sc.nextInt();
            int amount; // 입출금 금액

            switch (option) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = sc.nextInt();
                    deposit(amount);
                    break;

                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = sc.nextInt();
                    withdraw(amount);
                    break;

                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;

                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return; // main 메서드 종료 -> 프로그램 종료

                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
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
