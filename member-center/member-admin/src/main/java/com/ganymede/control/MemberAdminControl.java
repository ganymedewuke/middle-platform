package com.ganymede.control;

import com.ganymede.entity.MemberInfo;
import com.ganymede.service.MemberAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

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
    public String insert(MemberInfo memberInfo, Model model) {
        Map<String, Object> result = memberAdminService.insertMember(memberInfo);
        boolean flag = (boolean) result.get("flag");
        String message = (String) result.get("message");
        model.addAttribute("message", message);
        if (flag) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "toLogin")
    public String toLogin() {
        return "toLogin";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(MemberInfo memberInfo, Model model, HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        Map<String, Object> result = memberAdminService.loginMember(memberInfo);
        boolean flag = (boolean) result.get("flag");
        String message = (String) result.get("message");
        model.addAttribute("message", message);
        if (flag) {
            MemberInfo member = (MemberInfo) result.get("member");
            httpSession.setAttribute("member", member);
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "toComplete")
    public String toComplete(Model model, HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        MemberInfo memberInfo = (MemberInfo) httpSession.getAttribute("member");

        if (memberInfo == null) {
            return "toLogin";
        }

        model.addAttribute("memberInfo", memberInfo);

        return "toComplete";
    }


    @RequestMapping(value = "updateMember", method = RequestMethod.POST)
    public String updateMember(MemberInfo memberInfo, Model model, HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        MemberInfo member = (MemberInfo) httpSession.getAttribute("member");

        if (memberInfo == null) {
            return "toLogin";
        }

        model.addAttribute("memberInfo", member);
        member.setSex(memberInfo.getSex());
        member.setAge(memberInfo.getAge());
        member.setPhone(memberInfo.getPhone());


        memberAdminService.updateMember(member);

        model.addAttribute("message", "修改成功！");
        return "success";

    }

}
