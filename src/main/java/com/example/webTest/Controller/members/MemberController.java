package com.example.webTest.Controller.members;

import com.example.webTest.Controller.MemberForm;
import com.example.webTest.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.webTest.Domain.Member;

import java.util.List;

@Controller
public class MemberController {
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/member/new")
    public String createForm(){
        return "members/createForm";
    }
    @PostMapping("/member/new")
    public String create(MemberForm memberForm){
        Member member = new Member();
        member.setUserId(memberForm.getUserId());
        member.setPassword(memberForm.getPassword());
        member.setName(memberForm.getName());
        member.setEmail(memberForm.getEmail());
        member.setDigitNum(memberForm.getDigitNum());
        member.setTelNum(memberForm.getTelNum());
        memberService.join(member);
        return "redirect:/test";
    }

    @GetMapping("/members")
    public String list(Model model){
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";

    }
}
