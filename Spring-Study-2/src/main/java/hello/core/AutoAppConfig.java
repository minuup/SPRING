package hello.core;

import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(

        basePackageClasses = {Member.class , Order.class}

)
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository")
//        public MemberRepository memberRepository() {
//            return new MemoryMemberRepository();
//        } //스프링빈에 컴포넌트 스캔으로 Repository가 등록되어있음에도 수동(@Bean)으로 채우려고 하다보니 충돌이 일어남!

    }


