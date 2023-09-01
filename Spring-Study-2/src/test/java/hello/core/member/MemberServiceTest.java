//package hello.core.member;
//
//import hello.core.AppConfig;
//import hello.core.order.OrderService;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//
//public class MemberServiceTest {
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
//
//    @Test
//    void join() {
//        //given
//        Member member = new Member(1L, "memberA", Grade.VIP);
//
//        //when
//        memberService.join(member);
//        Member findMember = memberService.findMember(1L);
//
//        //then
//        Assertions.assertThat(member).isEqualTo(findMember);
//    }
//}
