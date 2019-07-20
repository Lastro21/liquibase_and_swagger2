package com.example.demo.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/rest")
public class MainController {

    @ApiOperation(value = "This controller return simple STRING")
    @RequestMapping(value = "/hello")
    public String showHello() {
        return "Hello world from hello controller";
    }

    @ApiOperation(value = "This controller return simple STRING too")
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String showHi() {
        return "Hello world from hi controller";
    }

}
