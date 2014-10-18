package com.test;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;


/**
 * Created with IntelliJ IDEA.
 * User: rakeshpullayikodi
 * Date: 10/18/14
 * Time: 7:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class NewTest {

    private static Logger log = Logger.getLogger(Sample.class.getName());

    @Test
    public void second(){
        log.info("started second test");

    }
}
