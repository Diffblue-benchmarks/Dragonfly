package com.alibaba.dragonfly.supernode.common.enumeration;

import com.alibaba.dragonfly.supernode.common.enumeration.PeerPieceStatus;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

public class PeerPieceStatusTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getStatusOutputZero() {

    // Arrange
    final PeerPieceStatus peerPieceStatus = PeerPieceStatus.RUNNING;

    // Act and Assert result
    Assert.assertEquals(0, peerPieceStatus.getStatus());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSuccessOutputFalse() {

    // Arrange
    final PeerPieceStatus peerPieceStatus = PeerPieceStatus.WAIT;

    // Act and Assert result
    Assert.assertFalse(peerPieceStatus.isSuccess());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setStatusInputZeroOutputVoid() {

    // Arrange
    final PeerPieceStatus peerPieceStatus = PeerPieceStatus.RUNNING;

    // Act
    peerPieceStatus.setStatus(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.common.enumeration.PeerPieceStatus");

    // Assert side effects
    Assert.assertArrayEquals(
        new Object[] {PeerPieceStatus.WAIT, PeerPieceStatus.RUNNING, PeerPieceStatus.SUCCESS,
                      PeerPieceStatus.FAIL, PeerPieceStatus.SEMISUC},
        ((Object[])Reflector.getInstanceField(PeerPieceStatus.class, null, "$VALUES")));
  }

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException() {

    // Act
    thrown.expect(IllegalArgumentException.class);
    PeerPieceStatus.valueOf("!!!!!!!!!");

    // The method is not expected to return due to exception thrown
  }
}
