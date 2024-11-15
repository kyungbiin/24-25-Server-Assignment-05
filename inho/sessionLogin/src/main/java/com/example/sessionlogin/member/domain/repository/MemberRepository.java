package com.example.sessionlogin.member.domain.repository;

import com.example.sessionlogin.member.domain.Member;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends
        JpaRepository<Member, Long> {
    Optional<Member> findByLoginId(String loginId);
}
