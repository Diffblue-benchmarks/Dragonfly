package com.alibaba.dragonfly.supernode.common.domain;

import com.alibaba.dragonfly.supernode.common.domain.PeerTask;
import com.alibaba.dragonfly.supernode.common.enumeration.PeerTaskStatus;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class PeerTaskTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullZeroNotNullNullOutputNotNull() {

    // Act, creating object to test constructor
    final PeerTask actual = new PeerTask("@@@@", "", 0, "", null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getPieceSize());
    Assert.assertEquals("", actual.getTaskId());
    Assert.assertEquals(PeerTaskStatus.WAIT, actual.getStatus());
    Assert.assertEquals("", actual.getPath());
    Assert.assertEquals("@@@@", actual.getCid());
    Assert.assertEquals(0, actual.getPort());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final PeerTask actual = new PeerTask();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getPieceSize());
    Assert.assertNull(actual.getTaskId());
    Assert.assertEquals(PeerTaskStatus.WAIT, actual.getStatus());
    Assert.assertNull(actual.getPath());
    Assert.assertNull(actual.getCid());
    Assert.assertEquals(0, actual.getPort());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCidOutputNull() {

    // Arrange
    final PeerTask peerTask = new PeerTask();

    // Act and Assert result
    Assert.assertNull(peerTask.getCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPathOutputNull() {

    // Arrange
    final PeerTask peerTask = new PeerTask();

    // Act and Assert result
    Assert.assertNull(peerTask.getPath());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPieceSizeOutputNull() {

    // Arrange
    final PeerTask peerTask = new PeerTask();

    // Act and Assert result
    Assert.assertNull(peerTask.getPieceSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPortOutputZero() {

    // Arrange
    final PeerTask peerTask = new PeerTask();

    // Act and Assert result
    Assert.assertEquals(0, peerTask.getPort());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getStatusOutputWait() {

    // Arrange
    final PeerTask peerTask = new PeerTask();

    // Act
    final PeerTaskStatus actual = peerTask.getStatus();

    // Assert result
    Assert.assertEquals(PeerTaskStatus.WAIT, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTaskIdOutputNull() {

    // Arrange
    final PeerTask peerTask = new PeerTask();

    // Act and Assert result
    Assert.assertNull(peerTask.getTaskId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSuccessOutputFalse() {

    // Arrange
    final PeerTask peerTask = new PeerTask();

    // Act and Assert result
    Assert.assertFalse(peerTask.isSuccess());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(PeerTaskStatus.class)
  @Test
  public void isSuccessOutputTrue() throws Exception {

    // Arrange
    final PeerTask peerTask = new PeerTask();

    // Act and Assert result
    Assert.assertTrue(peerTask.isSuccess());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCidInputNotNullOutputVoid() {

    // Arrange
    final PeerTask peerTask = new PeerTask();

    // Act
    peerTask.setCid("");

    // Assert side effects
    Assert.assertEquals("", peerTask.getCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPathInputNotNullOutputVoid() {

    // Arrange
    final PeerTask peerTask = new PeerTask();

    // Act
    peerTask.setPath("");

    // Assert side effects
    Assert.assertEquals("", peerTask.getPath());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPieceSizeInputNullOutputVoid() {

    // Arrange
    final PeerTask peerTask = new PeerTask("00000000000000000000000000000000", "!!", 0,
                                           "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", null);

    // Act
    peerTask.setPieceSize(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPortInputZeroOutputVoid() {

    // Arrange
    final PeerTask peerTask = new PeerTask();

    // Act
    peerTask.setPort(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setStatusInputRunningOutputVoid() {

    // Arrange
    final PeerTask peerTask = new PeerTask();
    final PeerTaskStatus status = PeerTaskStatus.RUNNING;

    // Act
    peerTask.setStatus(status);

    // Assert side effects
    Assert.assertEquals(PeerTaskStatus.RUNNING, peerTask.getStatus());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setTaskIdInputNotNullOutputVoid() {

    // Arrange
    final PeerTask peerTask = new PeerTask();

    // Act
    peerTask.setTaskId("");

    // Assert side effects
    Assert.assertEquals("", peerTask.getTaskId());
  }
}
