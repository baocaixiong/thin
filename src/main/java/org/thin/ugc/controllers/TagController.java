package org.thin.ugc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/tag")
public class TagController
{
    @RequestMapping(path = {"/:targetId", "/:targetId/"})
    @ResponseBody
    public String index(@RequestParam(required = true) String targetId)
    {
        return "get target content";
    }
}
