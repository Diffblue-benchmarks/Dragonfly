package com.alibaba.dragonfly.supernode.common.view;

import com.alibaba.dragonfly.supernode.common.view.TaskRegistryResult;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TaskRegistryResultTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999af40f6685d53314a() {

    // Act, creating object to test constructor
    final TaskRegistryResult actual = new TaskRegistryResult();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0L, actual.getFileLength());
    Assert.assertNull(actual.getPieceSize());
    Assert.assertNull(actual.getTaskId());

  }

  // Test written by Diffblue Cover
  @Test
  public void getFileLengthOutputZero99909936609c6244501() {

    // Arrange
    final TaskRegistryResult thisObj = new TaskRegistryResult();

    // Act
    final long actual = thisObj.getFileLength();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceSizeOutputVoid999b13fc93e1093b832() {

    // Arrange
    final TaskRegistryResult thisObj = new TaskRegistryResult();

    // Act
    final Integer actual = thisObj.getPieceSize();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTaskIdOutputVoid9994e7400786cb4b7fc() {

    // Arrange
    final TaskRegistryResult thisObj = new TaskRegistryResult();

    // Act
    final String actual = thisObj.getTaskId();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setFileLengthInputPositiveOutputVoid999faefc0349c31a0a3() {

    // Arrange
    final TaskRegistryResult thisObj = new TaskRegistryResult();
    final long arg0 = 1L;

    // Act
    thisObj.setFileLength(arg0);

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getFileLength());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPieceSizeInputNotNullOutputVoid999fc85d38ee2c71403() {

    // Arrange
    final TaskRegistryResult thisObj = new TaskRegistryResult();
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setPieceSize(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getPieceSize());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTaskIdInputNotNullOutputVoid999305c7cbae24e6b37() {

    // Arrange
    final TaskRegistryResult thisObj = new TaskRegistryResult();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setTaskId(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getTaskId());

  }
}
