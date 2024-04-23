package ksmart.githubtest.member.service;

import ksmart.githubtest.member.dto.Member;

import java.util.List;

public interface MemberSevice {

    // 회원 목록 조회
    List<Member> getMemberList();
}
