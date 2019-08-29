package com.alibaba.dragonfly.supernode.rest.controller;

import com.alibaba.dragonfly.supernode.rest.controller.PreloadController;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PreloadControllerTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void checkHealthOutputNotNull() {

    // Arrange
    final PreloadController preloadController = new PreloadController();

    // Act and Assert result
    Assert.assertEquals("success", preloadController.checkHealth());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final PreloadController actual = new PreloadController();

    // Assert result
    Assert.assertNotNull(actual);
  }
}
