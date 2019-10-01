package com.test.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TestDispatcherInitializer
    extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    /* Not needed for Test purpose */
    return null;
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {

    return new Class[] {TestControllerConfig.class};
  }

  @Override
  protected String[] getServletMappings() {

    return new String[] {"/"};
  }

}
