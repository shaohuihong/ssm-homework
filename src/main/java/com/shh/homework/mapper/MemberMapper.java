package com.shh.homework.mapper;

import com.shh.homework.entity.Member;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface MemberMapper {
    // 保存用户
    int insert(@Param("member") Member member);

    // 通过用户名查询或者手机号信息
    Member selectByName(@Param("username") String username);

    // 修改密码
    int updateById(@Param("member") Member member,@Param("id") int id);

    // 分页查询所有激活用户
    List<Member> selectAll(@Param("limit") int limit,@Param("offset") int offset);
}
