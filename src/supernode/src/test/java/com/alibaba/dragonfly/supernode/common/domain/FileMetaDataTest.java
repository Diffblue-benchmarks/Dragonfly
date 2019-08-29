package com.alibaba.dragonfly.supernode.common.domain;

import com.alibaba.dragonfly.supernode.common.domain.FileMetaData;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class FileMetaDataTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final FileMetaData actual = new FileMetaData();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMd5());
    Assert.assertEquals(0L, actual.getAccessTime());
    Assert.assertNull(actual.getBizId());
    Assert.assertNull(actual.getTaskId());
    Assert.assertEquals(0L, actual.getInterval());
    Assert.assertNull(actual.getRealMd5());
    Assert.assertNull(actual.getHttpFileLen());
    Assert.assertNull(actual.getFileLength());
    Assert.assertNull(actual.getUrl());
    Assert.assertEquals(0L, actual.getLastModified());
    Assert.assertNull(actual.getPieceSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getAccessTimeOutputZero() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertEquals(0L, fileMetaData.getAccessTime());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBizIdOutputNull() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertNull(fileMetaData.getBizId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getFileLengthOutputNull() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertNull(fileMetaData.getFileLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHttpFileLenOutputNull() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertNull(fileMetaData.getHttpFileLen());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIntervalOutputZero() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertEquals(0L, fileMetaData.getInterval());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLastModifiedOutputZero() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertEquals(0L, fileMetaData.getLastModified());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getMd5OutputNull() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertNull(fileMetaData.getMd5());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPieceSizeOutputNull() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertNull(fileMetaData.getPieceSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRealMd5OutputNull() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertNull(fileMetaData.getRealMd5());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTaskIdOutputNull() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertNull(fileMetaData.getTaskId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getUrlOutputNull() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertNull(fileMetaData.getUrl());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isFinishOutputFalse() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertFalse(fileMetaData.isFinish());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSuccessOutputFalse() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertFalse(fileMetaData.isSuccess());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setAccessTimeInputZeroOutputVoid() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act
    fileMetaData.setAccessTime(0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setBizIdInputNotNullOutputVoid() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act
    fileMetaData.setBizId("");

    // Assert side effects
    Assert.assertEquals("", fileMetaData.getBizId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setFileLengthInputNullOutputVoid() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act
    fileMetaData.setFileLength(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setFinishInputFalseOutputVoid() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act
    fileMetaData.setFinish(false);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setHttpFileLenInputNullOutputVoid() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act
    fileMetaData.setHttpFileLen(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setIntervalInputZeroOutputVoid() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act
    fileMetaData.setInterval(0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLastModifiedInputZeroOutputVoid() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act
    fileMetaData.setLastModified(0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setMd5InputNotNullOutputVoid() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act
    fileMetaData.setMd5("");

    // Assert side effects
    Assert.assertEquals("", fileMetaData.getMd5());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPieceSizeInputNullOutputVoid() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act
    fileMetaData.setPieceSize(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setRealMd5InputNotNullOutputVoid() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act
    fileMetaData.setRealMd5("");

    // Assert side effects
    Assert.assertEquals("", fileMetaData.getRealMd5());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setSuccessInputFalseOutputVoid() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act
    fileMetaData.setSuccess(false);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setTaskIdInputNotNullOutputVoid() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act
    fileMetaData.setTaskId("");

    // Assert side effects
    Assert.assertEquals("", fileMetaData.getTaskId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setUrlInputNotNullOutputVoid() {

    // Arrange
    final FileMetaData fileMetaData = new FileMetaData();

    // Act
    fileMetaData.setUrl("");

    // Assert side effects
    Assert.assertEquals("", fileMetaData.getUrl());
  }
}
