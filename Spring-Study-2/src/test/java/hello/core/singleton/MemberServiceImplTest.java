package hello.core.singleton;

import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import org.junit.jupiter.api.Test;

public class MemberServiceImplTest {

    @Test
    void createMember2(){
        MemberServiceImpl memberService = new MemberServiceImpl(new MemoryMemberRepository());
        memberService.findMember(1L);
    }
}
