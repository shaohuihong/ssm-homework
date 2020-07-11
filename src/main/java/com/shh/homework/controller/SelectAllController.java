package com.shh.homework.controller;

import com.shh.homework.entity.Member;
import com.shh.homework.service.MemberService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SelectAllController {
    @Resource
    MemberService memberService;
    @GetMapping("/selectAll")
    public List<Member> selectAll(@Param("limit") int limit,@Param("offset") int offset) {
        List<Member> members = memberService.showAll(limit, offset);
        return members;
    }
}
