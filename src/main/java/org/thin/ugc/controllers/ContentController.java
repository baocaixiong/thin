package org.thin.ugc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("content")
@RequestMapping("/content")
public class ContentController
{
    @RequestMapping(path = {"/:cid", "/:cid/"}, method = RequestMethod.GET)
    @ResponseBody
    public String index()
    {
        return "Hello world!";
    }

    @RequestMapping(path = {"/", ""}, method = RequestMethod.POST)
    public String post()
    {
        return "post content";
    }
}
