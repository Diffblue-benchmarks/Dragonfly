package com.alibaba.dragonfly.supernode.common.exception;

import com.alibaba.dragonfly.supernode.common.exception.DataNotFoundException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DataNotFoundExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullNotNullOutputNotNull() {

    // Act, creating object to test constructor
    final DataNotFoundException actual = new DataNotFoundException("!!!!!!!!!", "!!!!!!!", "!!!!!");

    // Assert result
    Assert.assertNotNull(actual);
  }
}
