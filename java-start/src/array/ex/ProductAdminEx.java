package array.ex;

import java.util.Scanner;

// 상품 관리 프로그램 만들기
public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0, productCount = 0, maxProducts = 10;

        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];

        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            option = sc.nextInt(); // 메뉴 선택
            sc.nextLine();

            if (option == 1) {

                if (productCount == maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCount] = sc.nextLine();

                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[productCount] = sc.nextInt();

                productCount++;

            } else if (option == 2) {

                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i] + "원");
                }

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("다른 옵션을 선택하세요.");
            }

        }

    }
}
