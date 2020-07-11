package com.shh.homework.controller;

import com.shh.homework.entity.Member;
import com.shh.homework.service.MemberService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SelectByNameController {
    @Resource
    MemberService memberService;
    @GetMapping("/select")
    public Member select(@Param("username") String username) {
        Member member = memberService.showByName(username);
        return member;
    }
}
