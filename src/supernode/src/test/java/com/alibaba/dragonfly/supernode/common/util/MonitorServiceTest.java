package com.alibaba.dragonfly.supernode.common.util;

import com.alibaba.dragonfly.supernode.common.util.MonitorService;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MonitorServiceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99993176d5b60f80378() {

    // Act, creating object to test constructor
    final MonitorService actual = new MonitorService();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void highPressureOutputFalse999d121c12a68e69426() {

    // Arrange
    final MonitorService thisObj = new MonitorService();

    // Act
    final boolean actual = thisObj.highPressure();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void startMonitorOutputVoid999f1a4f32fce7ed7b7() {

    // Arrange
    final MonitorService thisObj = new MonitorService();

    // Act
    thisObj.startMonitor();

    // The method returns void, testing that no exception is thrown

  }
}
