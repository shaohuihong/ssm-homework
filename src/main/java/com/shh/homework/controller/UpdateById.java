package com.shh.homework.controller;

import com.shh.homework.entity.Member;
import com.shh.homework.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UpdateById {
    @Resource
    MemberService memberService;
    @GetMapping("/update")
    public int updateById(Member member,int id) {
        int count = memberService.updateById(member, id);
        return count;
    }
}
