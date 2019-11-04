package com.alibaba.dragonfly.supernode.common.exception;

import com.alibaba.dragonfly.supernode.common.exception.AuthenticationWaitedException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AuthenticationWaitedExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999366f433cce0a764e() {

    // Act, creating object to test constructor
    final AuthenticationWaitedException actual = new AuthenticationWaitedException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());

  }
}
