package clc.tool.controllers;

import clc.tool.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qup on 11/21/16.
 */
@RestController
public class DownloadResources {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/download/resource/{id}")
    @ResponseBody
    String downloadDocument(@PathVariable("id") String id) {
        return "Download!";
    }
}
