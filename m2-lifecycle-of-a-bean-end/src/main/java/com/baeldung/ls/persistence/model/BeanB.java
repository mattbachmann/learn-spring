package com.baeldung.ls.persistence.model;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanB {

    private static Logger log = LoggerFactory.getLogger(BeanB.class);

    public void initialize() {

        log.info("BeanB Custom initializer is called.");
    }

    @PostConstruct
    public void postConstruct() {

        log.info("BeanB @PostConstruct method is called.");
    }
}
