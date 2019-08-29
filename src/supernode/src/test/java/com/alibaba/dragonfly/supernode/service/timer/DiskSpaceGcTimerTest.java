package com.alibaba.dragonfly.supernode.service.timer;

import com.alibaba.dragonfly.supernode.service.timer.DiskSpaceGcTimer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DiskSpaceGcTimerTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final DiskSpaceGcTimer actual = new DiskSpaceGcTimer();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void gcOutputNullPointerException() {

    // Arrange
    final DiskSpaceGcTimer diskSpaceGcTimer = new DiskSpaceGcTimer();

    // Act
    thrown.expect(NullPointerException.class);
    diskSpaceGcTimer.gc();

    // The method is not expected to return due to exception thrown
  }
}
