package com.ljh.controller.base;


import com.ljh.bean.VAppDept;
import com.ljh.service.VAppDeptService;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@Controller
@RequestMapping("/vAppDept")
public class VAppDeptController {

    @Autowired
    private VAppDeptService vAppDeptService;

    @RequestMapping("/app")
    public String appDept() throws DocumentException {
        System.out.println("appDept");
        String vAppDepts = vAppDeptService.appDept();

        System.out.println("apps:" + vAppDepts);
        return "";
    }
}

