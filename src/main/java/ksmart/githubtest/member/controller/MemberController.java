package ksmart.githubtest.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

    @GetMapping("/memberList")
    public String memberList(Model model) {

        model.addAttribute("tiotle", "회원 목록");
        return "member/memberList";
    }
}
