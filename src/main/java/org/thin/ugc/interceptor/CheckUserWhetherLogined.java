package org.thin.ugc.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckUserWhetherLogined extends HandlerInterceptorAdapter
{
    private final Logger logger = LoggerFactory.getLogger(CheckUserWhetherLogined.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        logger.info("before handler; request=request=org.apache.catalina.connector.RequestFacade; context_path=" + request.getContextPath());
        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
    {
        logger.info("post handler");
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception
    {
        logger.info("after completion");
        super.afterCompletion(request, response, handler, ex);
    }
}
