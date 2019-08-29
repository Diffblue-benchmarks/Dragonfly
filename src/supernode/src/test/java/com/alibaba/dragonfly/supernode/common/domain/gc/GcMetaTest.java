package com.alibaba.dragonfly.supernode.common.domain.gc;

import com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class GcMetaTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNullFalseOutputNotNull() {

    // Act, creating object to test constructor
    final GcMeta actual = new GcMeta("", null, false);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("", actual.getTaskId());
    Assert.assertNull(actual.getCids());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCidsOutputNull() {

    // Arrange
    final GcMeta gcMeta = new GcMeta("", null, false);

    // Act and Assert result
    Assert.assertNull(gcMeta.getCids());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTaskIdOutputNotNull() {

    // Arrange
    final GcMeta gcMeta = new GcMeta("", null, false);

    // Act and Assert result
    Assert.assertEquals("", gcMeta.getTaskId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllOutputFalse() {

    // Arrange
    final GcMeta gcMeta = new GcMeta("", null, false);

    // Act and Assert result
    Assert.assertFalse(gcMeta.isAll());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setAllInputFalseOutputVoid() {

    // Arrange
    final GcMeta gcMeta = new GcMeta("", null, false);

    // Act
    gcMeta.setAll(false);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCidsInputNullOutputVoid() {

    // Arrange
    final GcMeta gcMeta = new GcMeta("", null, false);

    // Act
    gcMeta.setCids(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setTaskIdInputNotNullOutputVoid() {

    // Arrange
    final GcMeta gcMeta = new GcMeta("", null, false);

    // Act
    gcMeta.setTaskId("");

    // The method returns void, testing that no exception is thrown
  }
}
