package com.ino9dev.jmeter.controller;

import java.io.Serializable;

import org.apache.avalon.framework.logger.Logger;
import org.apache.jmeter.control.GenericController;
import org.apache.jorphan.logging.LoggingManager;

public class LastOneController extends GenericController implements Serializable {
   
    private static final Logger log = (Logger) LoggingManager.getLoggerForClass();

    private static final long serialVersionUID = 232L;

    private static final String CONDITION = "LastOneController.condition"; // $NON-NLS-1$

    public LastOneController() {
        
    }

}
