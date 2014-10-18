package com.test;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshpullayikodi
 * Date: 10/18/14
 * Time: 7:09 PM
 * To change this template use File | Settings | File Templates.
 *
 */


public class Sample {

    private static Logger log = Logger.getLogger(Sample.class.getName());

    @Test
    public void first(){
         log.debug("started first test");

    }
}
