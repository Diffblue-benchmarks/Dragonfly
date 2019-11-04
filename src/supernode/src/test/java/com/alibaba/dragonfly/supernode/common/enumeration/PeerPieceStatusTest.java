package com.alibaba.dragonfly.supernode.common.enumeration;

import com.alibaba.dragonfly.supernode.common.enumeration.PeerPieceStatus;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class PeerPieceStatusTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getStatusOutputNegative999ad4071083cea79a4() {
//
//    // Arrange
//    final PeerPieceStatus thisObj = PeerPieceStatus.WAIT;
//
//    // Act
//    final int actual = thisObj.getStatus();
//
//    // Assert result
//    Assert.assertEquals(-1, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void isSuccessOutputFalse999e592c6b2c419ae6c() {

    // Arrange
    final PeerPieceStatus thisObj = PeerPieceStatus.WAIT;

    // Act
    final boolean actual = thisObj.isSuccess();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setStatusInputPositiveOutputVoid999f16bd92cc232f3e9() {

    // Arrange
    final PeerPieceStatus thisObj = PeerPieceStatus.WAIT;
    final int arg0 = 1;

    // Act
    thisObj.setStatus(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getStatus());

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException9996c3666a4c58af370() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(IllegalArgumentException.class);
    PeerPieceStatus.valueOf(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput5999ef7f36400af7cd8d() {

    // Act
    final PeerPieceStatus[] actual = PeerPieceStatus.values();

    // Assert result
    Assert.assertArrayEquals(new PeerPieceStatus[]{ PeerPieceStatus.WAIT, PeerPieceStatus.RUNNING, PeerPieceStatus.SUCCESS, PeerPieceStatus.FAIL, PeerPieceStatus.SEMISUC }, actual);

  }
}
