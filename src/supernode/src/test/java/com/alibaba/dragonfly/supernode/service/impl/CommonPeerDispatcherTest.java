package com.alibaba.dragonfly.supernode.service.impl;

import com.alibaba.dragonfly.supernode.common.exception.ValidateException;
import com.alibaba.dragonfly.supernode.service.impl.CommonPeerDispatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CommonPeerDispatcherTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99935eacd2e829af1b9() {

    // Act, creating object to test constructor
    final CommonPeerDispatcher actual = new CommonPeerDispatcher();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void processInputNotNullNotNullNotNullNotNullNotNullNotNullOutputNumberFormatException999f902dad546347b69() throws ValidateException {

    // Arrange
    final CommonPeerDispatcher thisObj = new CommonPeerDispatcher();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";
    final String arg3 = "aaaaa";
    final String arg4 = "aaaaaaaaaaaaaaa";
    final String arg5 = "aaaaa";

    // Act
    thrown.expect(NumberFormatException.class);
    thisObj.process(arg0, arg1, arg2, arg3, arg4, arg5);

    // The method is not expected to return due to exception thrown

  }
}
