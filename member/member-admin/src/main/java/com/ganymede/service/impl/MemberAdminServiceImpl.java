package com.ganymede.service.impl;

import com.ganymede.dao.MemberAdminDao;
import com.ganymede.entity.MemberInfo;
import com.ganymede.service.MemberAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberAdminServiceImpl implements MemberAdminService {

    @Autowired
    private MemberAdminDao memberAdminDao;

    public void insertMember(MemberInfo memberInfo) {
        memberAdminDao.insertMember(memberInfo);
    }
}
