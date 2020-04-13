package com.baeldung.ls.persistence.model;

import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanC {

    private static Logger log = LoggerFactory.getLogger(BeanC.class);

    @PreDestroy
    public void preDestroy() {

        log.info("BeanC @PreDestroy annotated method is called.");
    }

    public void destroy() {

        log.info("BeanC Custom destroy method is called.");
    }

}
