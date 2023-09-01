package hello.core.autowired;


import hello.core.discount.DiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;

public class AllbeanTest {

    @Test
    void findAllBean() {
        ApplicationContext ac =  new AnnotationConfigApplicationContext(DiscountService.class);

        DiscountService discountService = ac.getBean(DiscountService.class);
        Member member = new Member(1L, "userA", Grade.VIP);
        int discountPrice = discountService.discount(member, 10000, "fixDiscountPolicy");
        Assertions.assertThat(discountService).isInstanceOf((DiscountService.class));
        Assertions.assertThat(discountPrice).isEqualTo(1000);
        System.out.println("할인금액 = "+discountPrice);
    }

    static class DiscountService{

        private final Map<String, DiscountPolicy> policyMap;
        private final List<DiscountPolicy> policies;

        @Autowired
        public DiscountService(Map<String, DiscountPolicy> policyMap, List<DiscountPolicy> policies) {
            this.policyMap = policyMap;
            this.policies = policies;
            System.out.println("policyMap = " + policyMap);
            System.out.println("policies = " + policies);
        }

        public int discount(Member member, int price, String discointCode) {
            DiscountPolicy discountPolicy = policyMap.get(discointCode);
            return discountPolicy.discount(member, price);
            //Map에 저장된 FixDiscpuntPolicy의 discount에 member와 price 넣어서 할인금액을 반환
        }
    }
}
