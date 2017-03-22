package org.thin.ugc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/list")
public class ListController
{
    @RequestMapping(path = {"/:targetId", "/:targetId/"})
    public String index(@RequestParam(required = true) String targetId)
    {
        return "Hello List";
    }
}
