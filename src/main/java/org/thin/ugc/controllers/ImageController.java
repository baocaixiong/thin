package org.thin.ugc.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/img")
public class ImageController
{
    /**
     * @param imgId
     * @return
     */
    @RequestMapping(path = {"/:imgId", "/:imgId/"}, method = RequestMethod.GET)
    @ResponseBody
    public String index(@RequestParam(required = true) String imgId)
    {
        return "get img";
    }

    /**
     * @param imgId
     * @return
     */
    @RequestMapping(path = {"/:imgId/origin", "/:imgId/origin/"}, method = RequestMethod.GET)
    @ResponseBody
    public String origin(@RequestParam(required = true) String imgId)
    {
        return "get image belongs to content id";
    }

    /**
     * 上传内容包含的图片
     *
     * @param cid content id
     * @return
     */
    @RequestMapping(path = {"/:cid", "/:cid/"})
    @ResponseBody
    public String commit(@RequestParam(required = true) String cid)
    {
        return "commit image";
    }
}
