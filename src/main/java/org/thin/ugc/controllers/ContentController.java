package org.thin.ugc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thin.common.constant.DataResult;
import org.thin.common.constant.RestConst;
import org.thin.ugc.model.Content;
import org.thin.ugc.model.mappers.ContentMapper;
import org.thin.ugc.service.usercenter.User;
import org.thin.ugc.service.usercenter.UserService;

import java.math.BigInteger;
import java.util.List;


@RestController("content")
@RequestMapping("/content")
public class ContentController
{
    @Autowired
    private UserService userService;

    @Autowired
    private ContentMapper contentMapper;

    @RequestMapping(path = {"/{cid}", "/{cid}/"}, method = RequestMethod.GET)
    public DataResult<Content> get(@PathVariable(required = true) BigInteger cid)
    {
        Content content = this.contentMapper.findByCid(cid);

        User user = userService.getByIdentity(String.valueOf(cid));

        if (user != null) {
            System.out.println(user.getName());
        }

        if (content != null) {
            return new DataResult<>(content);
        }

        DataResult<Content> result = new DataResult<>(null);

        result.setRestCode(RestConst.RESULT_NOT_FOUND);

        return result;
    }

    @RequestMapping(path = {"/{cid}", "/{cid}/"}, method = RequestMethod.POST)
    public String post(@PathVariable(required = true) BigInteger cid)
    {
        return "post content";
    }

    @RequestMapping(path = {"/", ""}, method = RequestMethod.GET)
    public List<Content> index()
    {
        return null;
    }
}
