package com.alibaba.dragonfly.supernode.common.exception;

import com.alibaba.dragonfly.supernode.common.exception.AuthenticationRequiredException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AuthenticationRequiredExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99980050d4bc7eff6a6() {

    // Act, creating object to test constructor
    final AuthenticationRequiredException actual = new AuthenticationRequiredException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999f72e3426266a2a36() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act, creating object to test constructor
    final AuthenticationRequiredException actual = new AuthenticationRequiredException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMessage());

  }
}
