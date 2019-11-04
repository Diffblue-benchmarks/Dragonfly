package com.alibaba.dragonfly.supernode.common.enumeration;

import com.alibaba.dragonfly.supernode.common.enumeration.PeerTaskRequestResult;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class PeerTaskRequestResultTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void getResultOutputPositive99902c95a07b99de011() {

    // Arrange
    final PeerTaskRequestResult thisObj = PeerTaskRequestResult.INVALID;

    // Act
    final int actual = thisObj.getResult();

    // Assert result
    Assert.assertEquals(502, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isValidResultInputPositiveOutputFalse999756b1746db50efd8() {

    // Arrange
    final int arg0 = 1;

    // Act
    final boolean actual = PeerTaskRequestResult.isValidResult(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException99954f7ddd2b85e7c94() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(IllegalArgumentException.class);
    PeerTaskRequestResult.valueOf(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput4999792e4ef1256ddfc5() {

    // Act
    final PeerTaskRequestResult[] actual = PeerTaskRequestResult.values();

    // Assert result
    Assert.assertArrayEquals(new PeerTaskRequestResult[]{ PeerTaskRequestResult.INVALID, PeerTaskRequestResult.SUCCESS, PeerTaskRequestResult.FAIL, PeerTaskRequestResult.SEMISUC }, actual);

  }
}
