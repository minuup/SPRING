package hello.core.member;

public interface MemberService { // 회원가입, 회원조회

    void join(Member member); // 회원가입

    Member findMember(Long memberId); // 회원조회 메서드
}
