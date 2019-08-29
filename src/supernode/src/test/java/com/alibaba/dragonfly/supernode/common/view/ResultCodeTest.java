package com.alibaba.dragonfly.supernode.common.view;

import com.alibaba.dragonfly.supernode.common.view.ResultCode;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class ResultCodeTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final ResultCode actual = new ResultCode();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getDescInputZeroOutputNull() {

    // Act and Assert result
    Assert.assertNull(ResultCode.getDesc(0));
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.common.view.ResultCode");

    // Assert side effects
    final HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
    hashMap.put(200, "success");
    hashMap.put(500, "system error");
    hashMap.put(600, "peer task end");
    hashMap.put(601, "peer task go on");
    hashMap.put(602, "peer task wait");
    hashMap.put(604, "super node sync source fail");
    hashMap.put(501, "param is illegal");
    hashMap.put(502, "target not found");
    hashMap.put(603, "peer down limit");
    hashMap.put(605, "unknown error");
    hashMap.put(606, "task conflict");
    hashMap.put(607, "url is not reachable");
    hashMap.put(608, "need auth");
    hashMap.put(609, "wait auth");
    Assert.assertEquals(hashMap, Reflector.getInstanceField(ResultCode.class, null, "descMap"));
  }
}
