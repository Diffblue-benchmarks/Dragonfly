package com.alibaba.dragonfly.supernode.common.util;

import com.alibaba.dragonfly.supernode.common.util.PowerRateLimiter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PowerRateLimiterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void acquireInputPositiveTrueOutputNullPointerException99979af5ad65c65cc0c() {

    // Arrange
    final PowerRateLimiter thisObj = new PowerRateLimiter();
    final int arg0 = 1;
    final boolean arg1 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.acquire(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ea44361bf309e91b() {

    // Act, creating object to test constructor
    final PowerRateLimiter actual = new PowerRateLimiter();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initOutputNullPointerException99942d9f8fe9bfcdda6() {

    // Arrange
    final PowerRateLimiter thisObj = new PowerRateLimiter();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.init();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void tryAcquireInputPositiveTrueOutputNullPointerException999457f01e352d0b4bb() {

    // Arrange
    final PowerRateLimiter thisObj = new PowerRateLimiter();
    final int arg0 = 1;
    final boolean arg1 = true;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.tryAcquire(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
