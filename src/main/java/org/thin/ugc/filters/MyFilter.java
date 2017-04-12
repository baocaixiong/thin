package org.thin.ugc.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author baidu
 */
class MyFilter implements Filter
{
    private static Logger logger = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {
        logger.info("my filter initialize");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        logger.info("doing my filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy()
    {
        logger.info("destroy my filter");
    }
}
