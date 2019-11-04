package com.alibaba.dragonfly.supernode.service.timer;

import com.alibaba.dragonfly.supernode.service.timer.DiskSpaceGcTimer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DiskSpaceGcTimerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b0ad2b9d4113b353() {

    // Act, creating object to test constructor
    final DiskSpaceGcTimer actual = new DiskSpaceGcTimer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void gcOutputNullPointerException9993c7f3bc7a8591b5a() {

    // Arrange
    final DiskSpaceGcTimer thisObj = new DiskSpaceGcTimer();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.gc();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void initOutputNullPointerException999f28117a432c22b56() {

    // Arrange
    final DiskSpaceGcTimer thisObj = new DiskSpaceGcTimer();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.init();

    // The method is not expected to return due to exception thrown

  }
}
