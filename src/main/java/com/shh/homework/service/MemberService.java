package com.shh.homework.service;

import com.shh.homework.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberService {
     // 添加保存用户信息
     int save(@Param("member") Member member);

     // 通过用户名查询或者手机号信息
     Member showByName(@Param("username") String username);

     // 根据id修改密码
     int updateById(@Param("member") Member member,@Param("id") int id);

     // 分页查询所有激活用户
     List<Member> showAll(@Param("limit") int limit,@Param("offset") int offset);

}
