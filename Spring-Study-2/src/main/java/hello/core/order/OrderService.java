package hello.core.order;

public interface OrderService { //최종오더결과를 반환하는 역할!
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
