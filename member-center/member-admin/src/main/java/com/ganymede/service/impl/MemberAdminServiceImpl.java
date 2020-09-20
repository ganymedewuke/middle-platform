package com.ganymede.service.impl;

import com.ganymede.dao.MemberAdminDao;
import com.ganymede.entity.MemberInfo;
import com.ganymede.service.MemberAdminService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class MemberAdminServiceImpl implements MemberAdminService {

    @Autowired
    private MemberAdminDao memberAdminDao;

    public Map<String, Object> insertMember(MemberInfo memberInfo) {
        Map<String, Object> resultMap = new HashMap<>();
        boolean flag = true;

        String message = "注册成功";
        String account = memberInfo.getAccount();
        String passwd = memberInfo.getPassword();
        String rePasswd = memberInfo.getRepassword();

        if (StringUtils.isBlank(account) || StringUtils.isBlank(passwd) || StringUtils.isBlank(rePasswd)) {
            flag = false;
            message = "注册失败!! 账户或者密码不能为空！";
        } else {
            if (!passwd.equals(rePasswd)) {
                flag = false;
                message = "注册失败!! 两次输入密码不一致！";
            }
        }

        resultMap.put("flag", flag);
        resultMap.put("message", message);
        if (flag) {
            memberInfo.setStatus(0);
            memberInfo.setCreateTime(new Date());
            memberAdminDao.insertMember(memberInfo);
        }

        return resultMap;
    }

    @Override
    public Map<String, Object> loginMember(MemberInfo memberInfo) {
        Map<String, Object> resultMap = new HashMap<>();
        boolean flag = true;

        String message = "登录成功";

        String account = memberInfo.getAccount();
        String passwd = memberInfo.getPassword();

        if (StringUtils.isBlank(account) || StringUtils.isBlank(passwd)) {
            flag = false;
            message = "登录失败!! 账户或者密码不能为空！";
        }

        if (flag) {
            MemberInfo resMember = memberAdminDao.loginMember(memberInfo);
            resultMap.put("member", resMember);

            if (resMember == null) {
                flag = false;
                message = "登录失败!! 账户或者密码不正确！";
            }
        }


        resultMap.put("flag", flag);
        resultMap.put("message", message);

        return resultMap;
    }

    @Override
    public void updateMember(MemberInfo memberInfo) {
        memberAdminDao.updateMember(memberInfo);
    }


}
