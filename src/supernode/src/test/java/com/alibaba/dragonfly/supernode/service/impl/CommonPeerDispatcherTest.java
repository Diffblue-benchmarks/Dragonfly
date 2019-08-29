package com.alibaba.dragonfly.supernode.service.impl;

import com.alibaba.dragonfly.supernode.common.exception.ValidateException;
import com.alibaba.dragonfly.supernode.service.impl.CommonPeerDispatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CommonPeerDispatcherTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final CommonPeerDispatcher actual = new CommonPeerDispatcher();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void processInputNotNullNotNullNotNullNotNullNotNullNotNullOutputNullPointerException()
      throws ValidateException {

    // Arrange
    final CommonPeerDispatcher commonPeerDispatcher = new CommonPeerDispatcher();

    // Act
    thrown.expect(NullPointerException.class);
    commonPeerDispatcher.process("????????????????????????????????????????????????????????????????",
                                 "??", "?", "?????????????????????????????????????????", "9", "7");

    // The method is not expected to return due to exception thrown
  }
}
