package com.alibaba.dragonfly.supernode.common.domain;

import com.alibaba.dragonfly.supernode.common.domain.DownloadMetaData;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DownloadMetaDataTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullPositivePositivePositiveOutputNotNull999dc4862217809752b() {

    // Arrange
    final String arg0 = "aaaaa";
    final long arg1 = 1L;
    final long arg2 = 1L;
    final long arg3 = 1L;

    // Act, creating object to test constructor
    final DownloadMetaData actual = new DownloadMetaData(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getMd5());
    Assert.assertEquals(1L, actual.getReadCost());
    Assert.assertEquals(1L, actual.getFileLength());
    Assert.assertEquals(1L, actual.getStartTime());

  }

  // Test written by Diffblue Cover
  @Test
  public void getFileLengthOutputPositive999081051dc95b9a2b1() {

    // Arrange
    final DownloadMetaData thisObj = new DownloadMetaData("aaaaa", 1L, 1L, 1L);

    // Act
    final long actual = thisObj.getFileLength();

    // Assert result
    Assert.assertEquals(1L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMd5OutputNotNull9990474bf4b757124a6() {

    // Arrange
    final DownloadMetaData thisObj = new DownloadMetaData("aaaaa", 1L, 1L, 1L);

    // Act
    final String actual = thisObj.getMd5();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getReadCostOutputPositive999e2e61a7154c0819b() {

    // Arrange
    final DownloadMetaData thisObj = new DownloadMetaData("aaaaa", 1L, 1L, 1L);

    // Act
    final long actual = thisObj.getReadCost();

    // Assert result
    Assert.assertEquals(1L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getStartTimeOutputPositive9996e0c103905b96bb2() {

    // Arrange
    final DownloadMetaData thisObj = new DownloadMetaData("aaaaa", 1L, 1L, 1L);

    // Act
    final long actual = thisObj.getStartTime();

    // Assert result
    Assert.assertEquals(1L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setFileLengthInputPositiveOutputVoid9999aef0346938fccd9() {

    // Arrange
    final DownloadMetaData thisObj = new DownloadMetaData("aaaaa", 1L, 1L, 1L);
    final long arg0 = 1L;

    // Act
    thisObj.setFileLength(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setMd5InputNotNullOutputVoid999422f8130cbeb3e4e() {

    // Arrange
    final DownloadMetaData thisObj = new DownloadMetaData("aaaaa", 1L, 1L, 1L);
    final String arg0 = "aaaaa";

    // Act
    thisObj.setMd5(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setReadCostInputPositiveOutputVoid99914b636fbbd5c581c() {

    // Arrange
    final DownloadMetaData thisObj = new DownloadMetaData("aaaaa", 1L, 1L, 1L);
    final long arg0 = 1L;

    // Act
    thisObj.setReadCost(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setStartTimeInputPositiveOutputVoid9998930594b3f6b7aec() {

    // Arrange
    final DownloadMetaData thisObj = new DownloadMetaData("aaaaa", 1L, 1L, 1L);
    final long arg0 = 1L;

    // Act
    thisObj.setStartTime(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
