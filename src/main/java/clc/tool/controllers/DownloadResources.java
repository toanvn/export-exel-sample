package clc.tool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by qup on 11/21/16.
 */
@Controller
public class DownloadResources {

    @RequestMapping("/download/resource/{id}")
    @ResponseBody
    String downloadDocument(@PathVariable("id") String id) {
        return "Download!";
    }
}
