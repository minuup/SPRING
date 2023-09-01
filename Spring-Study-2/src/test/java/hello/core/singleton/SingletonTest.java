package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {

//    @Test
//    @DisplayName("스프링 없는 순수한 DI 컨테이너")
//    void pureContainer() {
//        AppConfig appConfig = new AppConfig();
//        //1.조회: 호출할 때 마다 객체를 생성
//        MemberService memberService1 = appConfig.memberService();
//
//        //2.조회: 호출할 때 마다 객체를 생성
//        MemberService memberService2 = appConfig.memberService();
//
//        //참조값이 다른 것을 확인
//        System.out.println("memberService1 = " + memberService1);
//        System.out.println("memberService2 = " + memberService2);
//
//        Assertions.assertThat(memberService1).isNotSameAs(memberService2);
//    }
//
//    @Test
//    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
//    void singletonServiceTest(){
//       // new SingletonService(); 이제 new 로 새로 생성불가능
//        SingletonService singletonService1 = SingletonService.getInstance();
//        SingletonService singletonService2 = SingletonService.getInstance();
//
//        System.out.println(singletonService1);
//        System.out.println(singletonService2);
//        Assertions.assertThat(singletonService1).isSameAs(singletonService2);
//        System.out.println(singletonService1 == singletonService2);
//        //싱글톤은 이미 생성한 객체를 사용하기 위한 패턴임!
//    }

    @Test
    @DisplayName("스프링 컨테이너와 싱글톤")
    void springContainer() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //1.조회: 호출할 때 마다 객체를 생성
        MemberService memberService1 = applicationContext.getBean("memberService", MemberService.class);

        //2.조회: 호출할 때 마다 객체를 생성
        MemberService memberService2 = applicationContext.getBean("memberService",MemberService.class);

        //참조값이 같은 것을 확인
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);

        Assertions.assertThat(memberService1).isSameAs(memberService2); // 똑같은

        //스프링의 기본 빈 등록 방식은 싱글톤이다.
    }
}
