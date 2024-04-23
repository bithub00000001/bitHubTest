package ksmart.githubtest.member.service;

import ksmart.githubtest.member.dto.Member;
import ksmart.githubtest.member.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberSevice {

private final MemberMapper memberMapper;

    @Override
    public List<Member> getMemberList() {
        return memberMapper.getMemberList();
    }
}
