package com.pudding.pp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Author: 🇨🇳MJLI° ✍
 * @Date: 2022/2/24 下午5:21
 * @Name: PuddingController
 */
@RestController
public class PuddingController {

    @GetMapping ("/test")
    public HashMap demo () {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("msg" , "成功！");
        objectObjectHashMap.put("code" , 200);
        objectObjectHashMap.put("data" , "null");
        return objectObjectHashMap;

    }
}
