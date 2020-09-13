package com.ganymede.control;

import com.ganymede.entity.MemberInfo;
import com.ganymede.service.MemberAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("admin")
public class MemberAdminControl {

    @Autowired
    private MemberAdminService memberAdminService;

    @RequestMapping(value = "toInsert")
    public String toInsert() {
        return "toInsert";
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public void insert(MemberInfo memberInfo) {
        memberAdminService.insertMember(memberInfo);
    }
}
