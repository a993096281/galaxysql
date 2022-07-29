package com.alibaba.polardbx.qatest.dml;

import com.alibaba.polardbx.common.utils.Assert;
import org.junit.Test;

public class SimpleDmlTest {
    @Test
    public void SimpleDmlTest0() {
        System.out.println("success");
        Assert.assertTrue(true);
    }

    @Test
    public void SimpleDmlTest1() {
        System.out.println("success");
        Assert.assertTrue(false);
    }
}
