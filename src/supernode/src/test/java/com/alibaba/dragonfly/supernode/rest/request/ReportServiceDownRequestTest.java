package com.alibaba.dragonfly.supernode.rest.request;

import com.alibaba.dragonfly.supernode.rest.request.ReportServiceDownRequest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ReportServiceDownRequestTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue() {

    // Arrange
    final ReportServiceDownRequest reportServiceDownRequest = new ReportServiceDownRequest();
    final ReportServiceDownRequest o = new ReportServiceDownRequest();

    // Act and Assert result
    Assert.assertTrue(reportServiceDownRequest.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse() {

    // Arrange
    final ReportServiceDownRequest reportServiceDownRequest = new ReportServiceDownRequest();

    // Act and Assert result
    Assert.assertFalse(reportServiceDownRequest.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCidOutputNull() {

    // Arrange
    final ReportServiceDownRequest reportServiceDownRequest = new ReportServiceDownRequest();

    // Act and Assert result
    Assert.assertNull(reportServiceDownRequest.getCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTaskIdOutputNull() {

    // Arrange
    final ReportServiceDownRequest reportServiceDownRequest = new ReportServiceDownRequest();

    // Act and Assert result
    Assert.assertNull(reportServiceDownRequest.getTaskId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive() {

    // Arrange
    final ReportServiceDownRequest reportServiceDownRequest = new ReportServiceDownRequest();

    // Act and Assert result
    Assert.assertEquals(6061, reportServiceDownRequest.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCidInputNotNullOutputVoid() {

    // Arrange
    final ReportServiceDownRequest reportServiceDownRequest = new ReportServiceDownRequest();

    // Act
    reportServiceDownRequest.setCid("");

    // Assert side effects
    Assert.assertEquals("", reportServiceDownRequest.getCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setTaskIdInputNotNullOutputVoid() {

    // Arrange
    final ReportServiceDownRequest reportServiceDownRequest = new ReportServiceDownRequest();

    // Act
    reportServiceDownRequest.setTaskId("");

    // Assert side effects
    Assert.assertEquals("", reportServiceDownRequest.getTaskId());
  }
}
