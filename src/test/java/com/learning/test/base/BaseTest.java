package com.learning.test.base;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * create by lixihao on 2017/11/24.
 **/

@ContextConfiguration(locations = { "classpath:spring/applicationContext-mvc.xml","classpath:spring/applicationContext-db.xml", "classpath:spring/applicationContext-mybatis.xml","classpath:spring/applicationContext.xml"})
public class BaseTest extends AbstractTestNGSpringContextTests {

}
