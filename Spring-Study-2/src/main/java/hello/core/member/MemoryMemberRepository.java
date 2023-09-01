package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository {

    private Map<Long, Member> store = new HashMap<>();
    //참고 : 실무에선 동시성이슈가 있을수있어 ConcurrentHashMap사용
    //key 와 value, long-> id value는 멤버타입(id,name,grade)
    @Override
    public void save(Member member) {
        store.put(member.getId(), member); // store에 저장
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);//입력한 아이디와 일치하면 store에 저장한곳에서 검색후 반환;
    }
}
