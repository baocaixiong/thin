package org.thin.ugc.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thin.ugc.models.Content;
import org.thin.ugc.models.mappers.ContentMapper;
import org.thin.ugc.view.View;

@RestController("content")
@RequestMapping("/content")
public class ContentController
{
    private final ContentMapper contentMapper;

    public ContentController(ContentMapper contentMapper)
    {
        this.contentMapper = contentMapper;
    }

    @JsonView(View.Summary.class)
    @RequestMapping(path = {"/{cid}", "/{cid}/"}, method = RequestMethod.GET)
    public Content index(@PathVariable(required = true) long cid)
    {
        Content content = this.contentMapper.findByCid(cid);

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
}
