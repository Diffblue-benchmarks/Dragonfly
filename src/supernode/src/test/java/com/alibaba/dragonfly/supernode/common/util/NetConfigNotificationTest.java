package com.alibaba.dragonfly.supernode.common.util;

import com.alibaba.dragonfly.supernode.common.util.NetConfigNotification;
import com.google.common.util.concurrent.RateLimiter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class NetConfigNotificationTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addRateLimiterInputNullOutputVoid99965e60bd6d73c4069() {

    // Arrange
    final NetConfigNotification thisObj = new NetConfigNotification();
    final RateLimiter arg0 = null;

    // Act
    thisObj.addRateLimiter(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e762ad384cda9353() {

    // Act, creating object to test constructor
    final NetConfigNotification actual = new NetConfigNotification();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void freshNetRateInputPositiveOutputNullPointerException9998f51bd40e067b272() {

    // Arrange
    final NetConfigNotification thisObj = new NetConfigNotification();
    final int arg0 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.freshNetRate(arg0);

    // The method is not expected to return due to exception thrown

  }
}
