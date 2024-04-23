package ksmart.githubtest.member.mapper;

import ksmart.githubtest.member.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<Member> getMemberList();
}
