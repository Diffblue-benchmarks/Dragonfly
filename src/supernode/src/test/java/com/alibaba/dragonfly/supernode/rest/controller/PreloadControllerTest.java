package com.alibaba.dragonfly.supernode.rest.controller;

import com.alibaba.dragonfly.supernode.rest.controller.PreloadController;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PreloadControllerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void checkHealthOutputNotNull9993bf7dbf4513cf446() {

    // Arrange
    final PreloadController thisObj = new PreloadController();

    // Act
    final String actual = thisObj.checkHealth();

    // Assert result
    Assert.assertEquals("success", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a64f088c5171d690() {

    // Act, creating object to test constructor
    final PreloadController actual = new PreloadController();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
