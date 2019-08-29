package com.alibaba.dragonfly.supernode.common.domain;

import com.alibaba.dragonfly.supernode.common.domain.DownloadMetaData;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DownloadMetaDataTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullZeroZeroZeroOutputNotNull() {

    // Act, creating object to test constructor
    final DownloadMetaData actual = new DownloadMetaData("", 0L, 0L, 0L);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0L, actual.getReadCost());
    Assert.assertEquals(0L, actual.getStartTime());
    Assert.assertEquals(0L, actual.getFileLength());
    Assert.assertEquals("", actual.getMd5());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getFileLengthOutputZero() {

    // Arrange
    final DownloadMetaData downloadMetaData = new DownloadMetaData("", 0L, 0L, 0L);

    // Act and Assert result
    Assert.assertEquals(0L, downloadMetaData.getFileLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getMd5OutputNotNull() {

    // Arrange
    final DownloadMetaData downloadMetaData = new DownloadMetaData("", 0L, 0L, 0L);

    // Act and Assert result
    Assert.assertEquals("", downloadMetaData.getMd5());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getReadCostOutputZero() {

    // Arrange
    final DownloadMetaData downloadMetaData = new DownloadMetaData("", 0L, 0L, 0L);

    // Act and Assert result
    Assert.assertEquals(0L, downloadMetaData.getReadCost());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getStartTimeOutputZero() {

    // Arrange
    final DownloadMetaData downloadMetaData = new DownloadMetaData("", 0L, 0L, 0L);

    // Act and Assert result
    Assert.assertEquals(0L, downloadMetaData.getStartTime());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setFileLengthInputZeroOutputVoid() {

    // Arrange
    final DownloadMetaData downloadMetaData = new DownloadMetaData("", 0L, 0L, 0L);

    // Act
    downloadMetaData.setFileLength(0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setMd5InputNotNullOutputVoid() {

    // Arrange
    final DownloadMetaData downloadMetaData = new DownloadMetaData("", 0L, 0L, 0L);

    // Act
    downloadMetaData.setMd5("");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setReadCostInputZeroOutputVoid() {

    // Arrange
    final DownloadMetaData downloadMetaData = new DownloadMetaData("", 0L, 0L, 0L);

    // Act
    downloadMetaData.setReadCost(0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setStartTimeInputZeroOutputVoid() {

    // Arrange
    final DownloadMetaData downloadMetaData = new DownloadMetaData("", 0L, 0L, 0L);

    // Act
    downloadMetaData.setStartTime(0L);

    // The method returns void, testing that no exception is thrown
  }
}
