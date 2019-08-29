package com.alibaba.dragonfly.supernode.common.exception;

import com.alibaba.dragonfly.supernode.common.exception.TaskIdDuplicateException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TaskIdDuplicateExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputNotNull() {

    // Act, creating object to test constructor
    final TaskIdDuplicateException actual = new TaskIdDuplicateException("@@", "@@@@@");

    // Assert result
    Assert.assertNotNull(actual);
  }
}
