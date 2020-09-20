package com.ganymede.dao;

import com.ganymede.entity.MemberInfo;

public interface MemberAdminDao {
    void insertMember(MemberInfo memberInfo);

    MemberInfo loginMember(MemberInfo MemberInfo);

    void updateMember(MemberInfo memberInfo);
}
