/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
package com.testshared_19jan2017.myjavaservice.controller;

import com.testshared_19jan2017.myjavaservice.MyJavaService;
import java.lang.String;
import java.lang.Integer;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

@RestController
@RequestMapping(value = "/myJava")
public class MyJavaController {

    @Autowired
    private MyJavaService myJavaService;

    @RequestMapping(value = "/sampleJavaOperation", produces = "application/json", method = RequestMethod.GET)
    public String sampleJavaOperation(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "id", required = false) Integer id, HttpServletRequest request) {
        return myJavaService.sampleJavaOperation(name, id, request);
    }
}
