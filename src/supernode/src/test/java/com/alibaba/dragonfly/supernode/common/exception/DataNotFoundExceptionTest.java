package com.alibaba.dragonfly.supernode.common.exception;

import com.alibaba.dragonfly.supernode.common.exception.DataNotFoundException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DataNotFoundExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullOutputNotNull99981ee46ca5239381b() {

    // Arrange
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";

    // Act, creating object to test constructor
    final DataNotFoundException actual = new DataNotFoundException(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("type:aaaaa id:aaaaa msg:aaaaa", actual.getMessage());

  }
}
