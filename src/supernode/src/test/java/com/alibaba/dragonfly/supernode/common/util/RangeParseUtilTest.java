package com.alibaba.dragonfly.supernode.common.util;

import com.alibaba.dragonfly.supernode.common.util.RangeParseUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class RangeParseUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void calculateBreakRangeInputPositivePositivePositiveOutputIndexOutOfBoundsException9997383ed93327d2d22() {

    // Arrange
    final int arg0 = 1;
    final long arg1 = 1L;
    final int arg2 = 1;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    RangeParseUtil.calculateBreakRange(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void calculatePieceNumInputNotNullOutputNegative9996c0099bc3d36736e() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final int actual = RangeParseUtil.calculatePieceNum(arg0);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void calculatePieceRangeInputPositiveNotNullOutputNotNull999ad060c816e880ac3() {

    // Arrange
    final int arg0 = 1;
    final Integer arg1 = new Integer(1);

    // Act
    final String actual = RangeParseUtil.calculatePieceRange(arg0, arg1);

    // Assert result
    Assert.assertEquals("1-1", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999cd1ae32f0b74cf9c() {

    // Act, creating object to test constructor
    final RangeParseUtil actual = new RangeParseUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
