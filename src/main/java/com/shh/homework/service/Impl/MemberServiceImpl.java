package com.shh.homework.service.Impl;

import com.shh.homework.entity.Member;
import com.shh.homework.mapper.MemberMapper;
import com.shh.homework.service.MemberService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper memberMapper;
    // 添加并保存用户信息
    @Override
    public int save(@Param("member") Member member) {
        int count= memberMapper.insert(member);
        return count;
    }

    // 根据名字查询用户信息
    @Override
    public Member showByName(@Param("username") String username) {
        Member member = memberMapper.selectByName(username);
        return member;
    }

    // 根据id修改密码
    @Override
    public int updateById(@Param("member") Member member,@Param("id") int id) {
        int count = memberMapper.updateById(member, id);
        return count;
    }

    @Override
    public List<Member> showAll(@Param("limit") int limit,@Param("offset") int offset) {
        List<Member> members = memberMapper.selectAll(limit, offset);
        return members;
    }
}
