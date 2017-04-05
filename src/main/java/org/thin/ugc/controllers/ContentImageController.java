package org.thin.ugc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.thin.common.constant.DataResult;
import org.thin.ugc.service.imgservice.FrontUpload;
import org.thin.ugc.service.imgservice.ImgServiceFactory;

import java.util.HashMap;
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

    @RequestMapping(path = {"/upload-token/{bucket}", "/upload-token/{bucket}/"}, method = RequestMethod.GET)
    public DataResult<Map<String, String>> token(@PathVariable(required = true) String bucket)
    {
        FrontUpload imgService = (FrontUpload) imgServiceFactory.getImgService();
        String token = imgService.simpleFrontUploadToken(bucket);

        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);

        return new DataResult<>(tokenMap);
    }
}
