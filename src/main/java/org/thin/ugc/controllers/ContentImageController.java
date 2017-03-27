package org.thin.ugc.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/img")
public class ContentImageController
{
    /**
     * @param imgId
     * @return
     */
    @RequestMapping(path = {"/{imgId}", "/{imgId}/"}, method = RequestMethod.GET)
    public String index(@PathVariable(required = true) String imgId)
    {
        return "get img";
    }

    /**
     * @param imgId
     * @return
     */
    @RequestMapping(path = {"/{imgId}/content", "/{imgId}/content/"}, method = RequestMethod.GET)
    public String origin(@PathVariable(required = true) String imgId)
    {
        return "get image belongs to content id";
    }

    /**
     * 上传内容包含的图片
     *
     * @param cid content id
     * @return
     */
    @RequestMapping(path = {"/{cid}", "/{cid}/"})
    public String commit(@PathVariable(required = true) String cid)
    {
        return "commit image";
    }
}
