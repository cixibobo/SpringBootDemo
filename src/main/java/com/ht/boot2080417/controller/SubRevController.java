package com.ht.boot2080417.controller;

import com.ht.boot2080417.service.SubRevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class SubRevController {
    @Autowired
    private SubRevService subRevService;

    //
    @RequestMapping("/subRevControllerSelect")
        public Object SubRevControllerSelectOne(HttpServletRequest req, HttpServletResponse resp) {
            String id=req.getParameter("bossId");
            System.out.print(id);
            return JSON.toJSONString(subRevService.subRevSelectOne(Integer.parseInt(id))) ;
        }

}
