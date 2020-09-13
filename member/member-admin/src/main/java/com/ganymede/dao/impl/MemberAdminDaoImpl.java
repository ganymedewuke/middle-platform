package com.ganymede.dao.impl;

import com.ganymede.dao.MemberAdminDao;
import com.ganymede.entity.MemberInfo;
import com.ganymede.mapper.MemberAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberAdminDaoImpl implements MemberAdminDao {

    @Autowired
    private MemberAdminMapper memberAdminMapper;

    public void insertMember(MemberInfo memberInfo) {
        memberAdminMapper.insertMember(memberInfo);
    }
}
