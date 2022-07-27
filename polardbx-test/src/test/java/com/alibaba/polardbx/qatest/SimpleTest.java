package com.alibaba.polardbx.qatest;

import com.alibaba.polardbx.common.utils.Assert;
import org.junit.Test;

public class SimpleTest {
    @Test
    public void SimpleTest0() {
        System.out.println("success");
        Assert.assertTrue(true);
    }

    @Test
    public void SimpleTest1() {
        System.out.println("success");
        Assert.assertTrue(false);
    }
}
