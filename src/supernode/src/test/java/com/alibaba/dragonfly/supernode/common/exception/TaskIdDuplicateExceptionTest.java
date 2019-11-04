package com.alibaba.dragonfly.supernode.common.exception;

import com.alibaba.dragonfly.supernode.common.exception.TaskIdDuplicateException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TaskIdDuplicateExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999cfc55383c2d10590() {

    // Arrange
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act, creating object to test constructor
    final TaskIdDuplicateException actual = new TaskIdDuplicateException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("taskId:aaaaa msg:aaaaa", actual.getMessage());

  }
}
