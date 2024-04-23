package ksmart.githubtest.member.controller;

import ksmart.githubtest.member.dto.Member;
import ksmart.githubtest.member.service.MemberSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/member")
public class MemberController {

    private final MemberSevice memberSevice;

    @GetMapping("/memberList")
    public String memberList(Model model) {
        List<Member> memberList = memberSevice.getMemberList();
        model.addAttribute("title", "회원 목록");
        model.addAttribute("memberList", memberList);
        return "member/memberList";
    }
}
