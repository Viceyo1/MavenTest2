package com.haha;

import org.junit.Assert;
import org.junit.Test;

public class Demo1Test {
    @Test
    public void testSay(){
        Demo1 d = new Demo1();
        String haha = d.say("haha");
        Assert.assertEquals("hellohaha", haha);

    }
}
