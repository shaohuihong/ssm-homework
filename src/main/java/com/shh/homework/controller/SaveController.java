package com.shh.homework.controller;
import com.shh.homework.entity.Member;
import com.shh.homework.service.MemberService;
import org.apache.ibatis.annotations.Param;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SaveController {
    @Resource
    MemberService memberService;
    // 保存添加的用户信息
    @PostMapping("/save")
    public int save(@Param("member") Member member) {
        int count = memberService.save(member);
        return count;
    }
}
