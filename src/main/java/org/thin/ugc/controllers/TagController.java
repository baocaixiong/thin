package org.thin.ugc.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/tag")
public class TagController
{
    @RequestMapping(path = {"/{targetId}", "/{targetId}/"})
    public String index(@PathVariable(required = true) String targetId)
    {
        return "get target content";
    }
}
