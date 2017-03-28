package org.thin.ugc.listeners;


import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyRequestListener implements ServletRequestListener
{
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent)
    {
        System.out.print("-------" + servletRequestEvent);
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent)
    {
        System.out.print("++++++++" + servletRequestEvent);
    }
}
