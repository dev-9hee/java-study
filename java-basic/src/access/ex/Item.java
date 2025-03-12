package access.ex;

public class Item {
    private String name; // 상품 이름
    private int price; // 상품 가격
    private int quantity; // 상품 수량

    // 객체를 생성할 때 초기화
    public Item(String itemName, int itemPrice, int itemQuantity) {
        this.name = itemName;
        this.price = itemPrice;
        this.quantity = itemQuantity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}
