package com.alibaba.dragonfly.supernode.common.enumeration;

import com.alibaba.dragonfly.supernode.common.enumeration.PeerTaskRequestStatus;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class PeerTaskRequestStatusTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void getStatusOutputPositive99918d825e375c43601() {

    // Arrange
    final PeerTaskRequestStatus thisObj = PeerTaskRequestStatus.START;

    // Act
    final int actual = thisObj.getStatus();

    // Assert result
    Assert.assertEquals(700, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isValidStatusInputPositiveOutputFalse99919c493ad3c55247c() {

    // Arrange
    final int arg0 = 1;

    // Act
    final boolean actual = PeerTaskRequestStatus.isValidStatus(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException999cca2a93586ff8e1a() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(IllegalArgumentException.class);
    PeerTaskRequestStatus.valueOf(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput3999c0fa67c4cf19c5b9() {

    // Act
    final PeerTaskRequestStatus[] actual = PeerTaskRequestStatus.values();

    // Assert result
    Assert.assertArrayEquals(new PeerTaskRequestStatus[]{ PeerTaskRequestStatus.START, PeerTaskRequestStatus.RUNNING, PeerTaskRequestStatus.FINISH }, actual);

  }
}
