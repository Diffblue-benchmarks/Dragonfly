package com.alibaba.dragonfly.supernode.common.util;

import com.alibaba.dragonfly.supernode.common.util.RangeParseUtil;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;

public class RangeParseUtilTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void calculateBreakRangeInputNegativePositiveNegativeOutputIllegalArgumentException() {

    // Act
    thrown.expect(IllegalArgumentException.class);
    RangeParseUtil.calculateBreakRange(-1, 3L, -7);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void calculateBreakRangeInputPositiveNegativePositiveOutputIllegalArgumentException() {

    // Arrange
    final int startPieceNum = 1;
    final long rangeLength = -1L;
    final int pieceContSize = 6;

    // Act
    thrown.expect(IllegalArgumentException.class);
    RangeParseUtil.calculateBreakRange(startPieceNum, rangeLength, pieceContSize);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void calculateBreakRangeInputPositivePositivePositiveOutputIndexOutOfBoundsException() {

    // Arrange
    final int startPieceNum = 1;
    final long rangeLength = 3L;
    final int pieceContSize = 7;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    RangeParseUtil.calculateBreakRange(startPieceNum, rangeLength, pieceContSize);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void calculateBreakRangeInputPositivePositivePositiveOutputNotNull() {

    // Arrange
    final int startPieceNum = 1;
    final long rangeLength = 7L;
    final int pieceContSize = 6;

    // Act
    final String actual =
        RangeParseUtil.calculateBreakRange(startPieceNum, rangeLength, pieceContSize);

    // Assert result
    Assert.assertEquals("6-6", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void calculatePieceRangeInputZeroNullOutputNullPointerException() {

    // Act
    thrown.expect(NullPointerException.class);
    RangeParseUtil.calculatePieceRange(0, null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final RangeParseUtil actual = new RangeParseUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.common.util.RangeParseUtil");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(RangeParseUtil.class, null, "logger"));
  }
}
