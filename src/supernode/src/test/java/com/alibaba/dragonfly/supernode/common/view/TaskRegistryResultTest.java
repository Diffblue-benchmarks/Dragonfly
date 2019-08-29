package com.alibaba.dragonfly.supernode.common.view;

import com.alibaba.dragonfly.supernode.common.view.TaskRegistryResult;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TaskRegistryResultTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final TaskRegistryResult actual = new TaskRegistryResult();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0L, actual.getFileLength());
    Assert.assertNull(actual.getTaskId());
    Assert.assertNull(actual.getPieceSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getFileLengthOutputZero() {

    // Arrange
    final TaskRegistryResult taskRegistryResult = new TaskRegistryResult();

    // Act and Assert result
    Assert.assertEquals(0L, taskRegistryResult.getFileLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPieceSizeOutputNull() {

    // Arrange
    final TaskRegistryResult taskRegistryResult = new TaskRegistryResult();

    // Act and Assert result
    Assert.assertNull(taskRegistryResult.getPieceSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTaskIdOutputNull() {

    // Arrange
    final TaskRegistryResult taskRegistryResult = new TaskRegistryResult();

    // Act and Assert result
    Assert.assertNull(taskRegistryResult.getTaskId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setFileLengthInputZeroOutputVoid() {

    // Arrange
    final TaskRegistryResult taskRegistryResult = new TaskRegistryResult();

    // Act
    taskRegistryResult.setFileLength(0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPieceSizeInputNullOutputVoid() {

    // Arrange
    final TaskRegistryResult taskRegistryResult = new TaskRegistryResult();

    // Act
    taskRegistryResult.setPieceSize(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setTaskIdInputNotNullOutputVoid() {

    // Arrange
    final TaskRegistryResult taskRegistryResult = new TaskRegistryResult();

    // Act
    taskRegistryResult.setTaskId("");

    // Assert side effects
    Assert.assertEquals("", taskRegistryResult.getTaskId());
  }
}
