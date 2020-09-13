package com.ganymede.service;

import com.ganymede.entity.MemberInfo;

import java.util.Map;

public interface MemberAdminService {
    Map<String,Object> insertMember(MemberInfo memberInfo);

    Map<String,Object> loginMember(MemberInfo memberInfo);

    void updateMember(MemberInfo memberInfo);
}
