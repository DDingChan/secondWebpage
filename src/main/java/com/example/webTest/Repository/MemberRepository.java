package com.example.webTest.Repository;

import com.example.webTest.Domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByUserId(String userId);
    Optional<Member> findByName(String name);
    Optional<Member> findByEmail(String email);
    Optional<Member> findByTellNum(String telNum);
    Optional<Member> findByDigitNum(String digitNum);
    List<Member> findAll();

}
