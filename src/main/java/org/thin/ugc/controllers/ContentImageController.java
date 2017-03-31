package org.thin.ugc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.thin.common.constant.DataResult;
import org.thin.ugc.service.imgservice.FrontUpload;
import org.thin.ugc.service.imgservice.ImgServiceFactory;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/img")
public class ContentImageController
{
    @Autowired
    private ImgServiceFactory imgServiceFactory;

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
     * @return
     */
    @RequestMapping(path = {"/", ""}, method = RequestMethod.GET)
    public DataResult<Map<String, String>> commit()
    {
        FrontUpload imgService = (FrontUpload) imgServiceFactory.getImgService();
        System.out.println("--------------" + imgService);
        String token = imgService.simpleFrontUploadToken("test");

        Map<String, String> tokenMap = new LinkedHashMap<>();
        tokenMap.put("token", token);

        return new DataResult<>(tokenMap);
    }
}
