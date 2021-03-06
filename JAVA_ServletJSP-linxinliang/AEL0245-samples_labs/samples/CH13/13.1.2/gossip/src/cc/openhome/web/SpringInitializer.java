package cc.openhome.web;

import org.springframework.web.servlet.support.*;

public class SpringInitializer
     extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}