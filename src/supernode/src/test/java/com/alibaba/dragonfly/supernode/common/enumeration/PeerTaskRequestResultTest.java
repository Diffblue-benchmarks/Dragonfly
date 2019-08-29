package com.alibaba.dragonfly.supernode.common.enumeration;

import com.alibaba.dragonfly.supernode.common.enumeration.PeerTaskRequestResult;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

public class PeerTaskRequestResultTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getResultOutputPositive() {

    // Arrange
    final PeerTaskRequestResult peerTaskRequestResult = PeerTaskRequestResult.INVALID;

    // Act and Assert result
    Assert.assertEquals(502, peerTaskRequestResult.getResult());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isValidResultInputPositiveOutputTrue() {

    // Act and Assert result
    Assert.assertTrue(PeerTaskRequestResult.isValidResult(502));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isValidResultInputPositiveOutputTrue2() {

    // Act and Assert result
    Assert.assertTrue(PeerTaskRequestResult.isValidResult(501));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isValidResultInputZeroOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(PeerTaskRequestResult.isValidResult(0));
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.common.enumeration.PeerTaskRequestResult");

    // Assert side effects
    Assert.assertArrayEquals(
        new Object[] {PeerTaskRequestResult.INVALID, PeerTaskRequestResult.SUCCESS,
                      PeerTaskRequestResult.FAIL, PeerTaskRequestResult.SEMISUC},
        ((Object[])Reflector.getInstanceField(PeerTaskRequestResult.class, null, "$VALUES")));
  }

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException() {

    // Act
    thrown.expect(IllegalArgumentException.class);
    PeerTaskRequestResult.valueOf("!!!!!!!!!");

    // The method is not expected to return due to exception thrown
  }
}
