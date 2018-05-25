/*
 * Author: George <GeorgeNiceWorld@gmail.com> | <Georgeinfo@163.com>
 * Copyright (C) George (www.georgeinfo.com), All Rights Reserved.
 */
package test.logger;

import org.junit.*;


/**
 * 日志测试类
 *
 * @author George <Georgeinfo@163.com>
 */
public class LoggerTest {

    public LoggerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    // 综合测试
    @Test
    public void hello() {
        MainTest.main(null);
    }
}
