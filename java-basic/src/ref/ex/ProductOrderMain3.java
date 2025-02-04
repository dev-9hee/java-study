package ref.ex;

import java.util.Scanner;

// 상품 주문 시스템 - ProductOrderMain2 리펙토링
// 사용자 입력을 받도록 개선
public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 주문 수량 입력
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderNum = sc.nextInt();
        sc.nextLine(); // 입력 버퍼를 비우기 위함.

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[orderNum];

        // 가격, 수량, 상품명 입력
        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int productPrice = sc.nextInt();

            System.out.print("수량: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();

            // 상품 주문 생성 후 배열 저장
            orders[i] = createOrder(productName, productPrice, productQuantity);
        }

        // 상품 주문 정보 출력
        printOrders(orders);

        // 총 결제 금액 계산 및 출력
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    // 주문 생성
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    // 주문 내역 출력
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    // 주문 금액
    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.quantity * order.price;
        }
        return totalAmount;
    }

}
