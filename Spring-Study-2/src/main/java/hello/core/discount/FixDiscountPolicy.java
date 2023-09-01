package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class FixDiscountPolicy implements DiscountPolicy {

    private int discoountFixAmount = 1000;//1000원 할인

    @Override
    public int discount(Member member, int price) {
        //Enum은 == 으로 비교한다.
        //멤버쉽이 VIP면 할인해준다.
        if (member.getGrade() == Grade.VIP) {
            return discoountFixAmount;
        }else {
            //아니면 할인없어
            return 0;
        }
    }
}
