package com.alibaba.dragonfly.supernode.common.exception;

import com.alibaba.dragonfly.supernode.common.exception.AssertException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AssertExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputZeroNotNullOutputNotNull() {

    // Act, creating object to test constructor
    final AssertException actual = new AssertException(0, "");

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCodeOutputZero() {

    // Arrange
    final AssertException assertException = new AssertException(0, "");

    // Act and Assert result
    Assert.assertEquals(0, assertException.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCodeInputZeroOutputVoid() {

    // Arrange
    final AssertException assertException = new AssertException(0, "");

    // Act
    assertException.setCode(0);

    // The method returns void, testing that no exception is thrown
  }
}
