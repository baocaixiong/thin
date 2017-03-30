package org.thin.ugc.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thin.ugc.model.Content;
import org.thin.ugc.model.mappers.ContentMapper;
import org.thin.ugc.service.usercenter.User;
import org.thin.ugc.service.usercenter.UserService;
import org.thin.ugc.view.View;

import java.math.BigInteger;
import java.util.List;


@RestController("content")
@RequestMapping("/content")
public class ContentController
{
    @Autowired
    private UserService userGetter;

    private final ContentMapper contentMapper;

    public ContentController(ContentMapper contentMapper)
    {
        this.contentMapper = contentMapper;
    }

    @JsonView(View.Summary.class)
    @RequestMapping(path = {"/{cid}", "/{cid}/"}, method = RequestMethod.GET)
    public Content get(@PathVariable(required = true) BigInteger cid)
    {
        Content content = this.contentMapper.findByCid(cid);

        User user = userGetter.getByIdentity(String.valueOf(cid));

        if (user != null) {
            System.out.println(userGetter.getByIdentity("1").getName());
        }

        if (content != null) {
            return content;
        }

        return null;
    }

    @RequestMapping(path = {"/", ""}, method = RequestMethod.POST)
    public String post()
    {
        return "post content";
    }

    @RequestMapping(path = {"/", ""}, method = RequestMethod.GET)
    public List<Content> index()
    {
        return null;
    }
}
