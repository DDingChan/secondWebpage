package com.example.webTest.Service;

import com.example.webTest.Domain.Member;
import com.example.webTest.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {
    private MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long join(Member member){
        validateDuplicateMember(member);
        memberRepository.save(member);

        return member.getId();
    }

    private void validateDuplicateMember(Member member){
        memberRepository.findByUserId(member.getUserId())
                .ifPresent(m->{throw new IllegalStateException("이미 존재하는 ID입니다.");});
        memberRepository.findByTellNum(member.getTelNum())
                .ifPresent(m->{throw new IllegalStateException("이미 존재하는 전화번입니다.");});
        memberRepository.findByEmail(member.getEmail())
                .ifPresent(m->{throw new IllegalStateException("이미 존재하는 이메일입니다.");});
        memberRepository.findByDigitNum(member.getDigitNum())
                .ifPresent(m->{throw new IllegalStateException("이미 존재하는 주민번호입니다.");});
    }

    public List<Member> findMembers() {return memberRepository.findAll();}

    public Optional<Member> findOne(Long memberId){return memberRepository.findById(memberId);}
}
