package com.alibaba.dragonfly.supernode.rest.controller;

import com.alibaba.dragonfly.supernode.common.view.ResultInfo;
import com.alibaba.dragonfly.supernode.rest.controller.ConfigController;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;

import java.lang.reflect.InvocationTargetException;

@RunWith(PowerMockRunner.class)
public class ConfigControllerTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final ConfigController actual = new ConfigController();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.rest.controller.ConfigController");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(ConfigController.class, null, "log"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void updateInputNotNullNullOutputNullPointerException() {

    // Arrange
    final ConfigController configController = new ConfigController();
    final Integer netRate = new Integer(0);

    // Act
    thrown.expect(NullPointerException.class);
    configController.update(netRate, null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Logger.class)
  @Test
  public void updateInputNullNullOutputNotNull() throws Exception {

    // Arrange
    final ConfigController configController = new ConfigController();

    // Act
    final ResultInfo actual = configController.update(null, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getData());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertEquals(200, actual.getCode());
  }
}
