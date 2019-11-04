package com.alibaba.dragonfly.supernode.common.view;

import com.alibaba.dragonfly.supernode.common.view.ResultCode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ResultCodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b52d2e4a2c2e9a91() {

    // Act, creating object to test constructor
    final ResultCode actual = new ResultCode();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getDescInputPositiveOutputVoid999c8168290f4690fbc() {

    // Arrange
    final int arg0 = 1;

    // Act
    final String actual = ResultCode.getDesc(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
