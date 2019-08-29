package com.alibaba.dragonfly.supernode.rest.request;

import com.alibaba.dragonfly.supernode.rest.request.PullPieceTaskRequest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PullPieceTaskRequestTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();
    final PullPieceTaskRequest o = new PullPieceTaskRequest();

    // Act and Assert result
    Assert.assertTrue(pullPieceTaskRequest.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act and Assert result
    Assert.assertFalse(pullPieceTaskRequest.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getDstCidOutputNull() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act and Assert result
    Assert.assertNull(pullPieceTaskRequest.getDstCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRangeOutputNull() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act and Assert result
    Assert.assertNull(pullPieceTaskRequest.getRange());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getResultOutputNull() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act and Assert result
    Assert.assertNull(pullPieceTaskRequest.getResult());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSrcCidOutputNull() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act and Assert result
    Assert.assertNull(pullPieceTaskRequest.getSrcCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getStatusOutputNull() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act and Assert result
    Assert.assertNull(pullPieceTaskRequest.getStatus());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTaskIdOutputNull() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act and Assert result
    Assert.assertNull(pullPieceTaskRequest.getTaskId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act and Assert result
    Assert.assertEquals(437_864_549, pullPieceTaskRequest.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setDstCidInputNotNullOutputVoid() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act
    pullPieceTaskRequest.setDstCid("");

    // Assert side effects
    Assert.assertEquals("", pullPieceTaskRequest.getDstCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setRangeInputNotNullOutputVoid() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act
    pullPieceTaskRequest.setRange("");

    // Assert side effects
    Assert.assertEquals("", pullPieceTaskRequest.getRange());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setResultInputNotNullOutputVoid() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act
    pullPieceTaskRequest.setResult("");

    // Assert side effects
    Assert.assertEquals("", pullPieceTaskRequest.getResult());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setSrcCidInputNotNullOutputVoid() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act
    pullPieceTaskRequest.setSrcCid("");

    // Assert side effects
    Assert.assertEquals("", pullPieceTaskRequest.getSrcCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setStatusInputNotNullOutputVoid() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act
    pullPieceTaskRequest.setStatus("");

    // Assert side effects
    Assert.assertEquals("", pullPieceTaskRequest.getStatus());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setTaskIdInputNotNullOutputVoid() {

    // Arrange
    final PullPieceTaskRequest pullPieceTaskRequest = new PullPieceTaskRequest();

    // Act
    pullPieceTaskRequest.setTaskId("");

    // Assert side effects
    Assert.assertEquals("", pullPieceTaskRequest.getTaskId());
  }
}
