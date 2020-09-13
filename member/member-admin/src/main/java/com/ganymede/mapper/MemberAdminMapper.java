package com.ganymede.mapper;

import com.ganymede.entity.MemberInfo;

public interface MemberAdminMapper {
    void insertMember(MemberInfo memberInfo);

    MemberInfo loginMember(MemberInfo memberInfo);

    void updateMember(MemberInfo memberInfo);
}
