package com.alibaba.polardbx.common.utils;

import org.junit.Test;

public class ErrorExampleTest {

    @Test
    public void testOk() {
        Assert.assertTrue(1 < 2);
    }

    @Test
    public void testOk2() {
        Assert.assertTrue(1 < 2);
    }

    @Test
    public void testErr() {
        Assert.assertTrue(4 < 2);
    }
    
}
