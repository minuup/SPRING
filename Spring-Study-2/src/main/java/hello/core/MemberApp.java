package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig(); //AppConfig에 의존
//        MemberService memberService = appConfig.memberService();
// 스프링커밋!
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        // 스프링의 시작 , 모든 Bean을 관리해줌 ,
        // new AnnotationConfigApplicationContext(AppConfig.class) 은 @Bean이 붙은것들의 객체들을 스프링빈(컨테이너)에 저장후 관리
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
//        OrderService orderService = appConfig.orderService();


        Member findMember = memberService.findMember(1L);
       System.out.println(findMember.getName());
        System.out.println(member.getName());
    }
}
