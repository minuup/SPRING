//package hello.core.order;
//
//import hello.core.AppConfig;
//import hello.core.member.Grade;
//import hello.core.member.Member;
//import hello.core.member.MemberService;
//import hello.core.member.MemberServiceImpl;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class OrderServiceTest {
//
//    MemberService memberService ;
//    OrderService orderService;
//
//    @BeforeEach // 테스트실행하기전 작동
//
//    public void beforeEach(){
//        AppConfig appConfig = new AppConfig();
//        memberService = appConfig.memberService();
//        orderService = appConfig.orderService();
//    }
//
//    @Test
//    void createOrder(){
//
//        Long memberId = 1L;
//        Member member = new Member(memberId, "memberA", Grade.VIP);
//        memberService.join(member);
//
//        Order order = orderService.createOrder(memberId, "마라탕", 15000);
////        System.out.println(order);
////        System.out.println(order.calculatePrice()); // 테스트에선 검증을 Assertions으로 한다.
//
//        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
//    }
//
//}
