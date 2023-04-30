package com.laowengs.ms.register.eureka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class VersionController {

    @GetMapping
    public String currentVersion(@RequestParam("app_id") String appId){

        return "";
    }

    @GetMapping("/nextValue")
    public String nextVersion(@RequestParam("app_id") String appId){

        return "";
    }



}
