package com.alibaba.dragonfly.supernode.rest.controller;

import com.alibaba.dragonfly.supernode.rest.controller.ConfigController;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConfigControllerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9994458524d13c49440() {

    // Act, creating object to test constructor
    final ConfigController actual = new ConfigController();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void updateInputNotNullNotNullOutputNullPointerException999b98302a58ec9320f() {

    // Arrange
    final ConfigController thisObj = new ConfigController();
    final Integer arg0 = new Integer(1);
    final Boolean arg1 = new Boolean(true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.update(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
