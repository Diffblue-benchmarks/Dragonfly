package com.alibaba.dragonfly.supernode.common.exception;

import com.alibaba.dragonfly.supernode.common.exception.ValidateException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ValidateExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNullNotNullOutputNotNull() {

    // Act, creating object to test constructor
    final ValidateException actual = new ValidateException(null, "");

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCodeOutputNull() {

    // Arrange
    final ValidateException validateException = new ValidateException(null, "");

    // Act and Assert result
    Assert.assertNull(validateException.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCodeInputNullOutputVoid() {

    // Arrange
    final ValidateException validateException = new ValidateException(null, "");

    // Act
    validateException.setCode(null);

    // The method returns void, testing that no exception is thrown
  }
}
