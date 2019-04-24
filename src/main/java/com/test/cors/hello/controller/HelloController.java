package com.test.cors.hello.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @author ly
 */
@Controller
public class HelloController {

    /**
     * 局部接口允许跨域
     * @param request
     * @return
     */
    @CrossOrigin("http://localhost:8080")
    @ResponseBody
    @RequestMapping("/hello")
    public Object hello(HttpServletRequest request){
        // 数据返回
        JSONObject json = new JSONObject();
        json.put("code", 200);
        json.put("msg", "你好");
        return json;
    }

    @ResponseBody
    @RequestMapping("/hello2")
    public Object hello2(HttpServletRequest request){
        // 数据返回
        JSONObject json = new JSONObject();
        json.put("code", 200);
        json.put("msg", "你好");
        return json;
    }

}
