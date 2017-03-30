package org.thin.ugc.listener;


import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.context.ConfigurableWebApplicationContext;

/**
 * 从 context.listener.classes 中加载用户自己的listener
 *
 * @see org.springframework.boot.context.config.DelegatingApplicationListener
 */
public class MyApplicationRunListener implements ApplicationListener
{
    @Override
    public void onApplicationEvent(ApplicationEvent event)
    {
        if (event instanceof ApplicationPreparedEvent) {
            System.out.println("++++++++catch ApplicationPreparedEvent event");
        }

        if (event.getSource() instanceof ConfigurableWebApplicationContext) {
            System.out.println(" &&&&&&&&&&" + ((ConfigurableWebApplicationContext) event.getSource()).getServletContext());
        }

        System.out.println("-------catch " + event.getSource() + " event");
    }
}
