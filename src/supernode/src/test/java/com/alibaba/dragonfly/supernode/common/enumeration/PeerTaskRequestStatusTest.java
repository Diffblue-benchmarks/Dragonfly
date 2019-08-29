package com.alibaba.dragonfly.supernode.common.enumeration;

import com.alibaba.dragonfly.supernode.common.enumeration.PeerTaskRequestStatus;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

public class PeerTaskRequestStatusTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getStatusOutputPositive() {

    // Arrange
    final PeerTaskRequestStatus peerTaskRequestStatus = PeerTaskRequestStatus.RUNNING;

    // Act and Assert result
    Assert.assertEquals(701, peerTaskRequestStatus.getStatus());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isValidStatusInputPositiveOutputTrue() {

    // Act and Assert result
    Assert.assertTrue(PeerTaskRequestStatus.isValidStatus(700));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isValidStatusInputPositiveOutputTrue2() {

    // Act and Assert result
    Assert.assertTrue(PeerTaskRequestStatus.isValidStatus(701));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isValidStatusInputZeroOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(PeerTaskRequestStatus.isValidStatus(0));
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.common.enumeration.PeerTaskRequestStatus");

    // Assert side effects
    Assert.assertArrayEquals(
        new Object[] {PeerTaskRequestStatus.START, PeerTaskRequestStatus.RUNNING,
                      PeerTaskRequestStatus.FINISH},
        ((Object[])Reflector.getInstanceField(PeerTaskRequestStatus.class, null, "$VALUES")));
  }

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException() {

    // Act
    thrown.expect(IllegalArgumentException.class);
    PeerTaskRequestStatus.valueOf("!");

    // The method is not expected to return due to exception thrown
  }
}
