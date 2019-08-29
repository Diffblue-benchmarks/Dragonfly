package com.alibaba.dragonfly.supernode.rest.request;

import com.alibaba.dragonfly.supernode.rest.request.ReportPieceRequest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ReportPieceRequestTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue() {

    // Arrange
    final ReportPieceRequest reportPieceRequest = new ReportPieceRequest();
    final ReportPieceRequest o = new ReportPieceRequest();

    // Act and Assert result
    Assert.assertTrue(reportPieceRequest.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse() {

    // Arrange
    final ReportPieceRequest reportPieceRequest = new ReportPieceRequest();

    // Act and Assert result
    Assert.assertFalse(reportPieceRequest.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCidOutputNull() {

    // Arrange
    final ReportPieceRequest reportPieceRequest = new ReportPieceRequest();

    // Act and Assert result
    Assert.assertNull(reportPieceRequest.getCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getDstCidOutputNull() {

    // Arrange
    final ReportPieceRequest reportPieceRequest = new ReportPieceRequest();

    // Act and Assert result
    Assert.assertNull(reportPieceRequest.getDstCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPieceRangeOutputNull() {

    // Arrange
    final ReportPieceRequest reportPieceRequest = new ReportPieceRequest();

    // Act and Assert result
    Assert.assertNull(reportPieceRequest.getPieceRange());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTaskIdOutputNull() {

    // Arrange
    final ReportPieceRequest reportPieceRequest = new ReportPieceRequest();

    // Act and Assert result
    Assert.assertNull(reportPieceRequest.getTaskId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive() {

    // Arrange
    final ReportPieceRequest reportPieceRequest = new ReportPieceRequest();

    // Act and Assert result
    Assert.assertEquals(21_100_921, reportPieceRequest.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCidInputNotNullOutputVoid() {

    // Arrange
    final ReportPieceRequest reportPieceRequest = new ReportPieceRequest();

    // Act
    reportPieceRequest.setCid("");

    // Assert side effects
    Assert.assertEquals("", reportPieceRequest.getCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setDstCidInputNotNullOutputVoid() {

    // Arrange
    final ReportPieceRequest reportPieceRequest = new ReportPieceRequest();

    // Act
    reportPieceRequest.setDstCid("");

    // Assert side effects
    Assert.assertEquals("", reportPieceRequest.getDstCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPieceRangeInputNotNullOutputVoid() {

    // Arrange
    final ReportPieceRequest reportPieceRequest = new ReportPieceRequest();

    // Act
    reportPieceRequest.setPieceRange("");

    // Assert side effects
    Assert.assertEquals("", reportPieceRequest.getPieceRange());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setTaskIdInputNotNullOutputVoid() {

    // Arrange
    final ReportPieceRequest reportPieceRequest = new ReportPieceRequest();

    // Act
    reportPieceRequest.setTaskId("");

    // Assert side effects
    Assert.assertEquals("", reportPieceRequest.getTaskId());
  }
}
