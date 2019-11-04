package com.alibaba.dragonfly.supernode.common.domain;

import com.alibaba.dragonfly.supernode.common.domain.PeerTask;
import com.alibaba.dragonfly.supernode.common.enumeration.PeerTaskStatus;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PeerTaskTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999b882cb38dfc1419e() {

    // Act, creating object to test constructor
    final PeerTask actual = new PeerTask();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getPath());
    Assert.assertNull(actual.getCid());
    Assert.assertEquals(0, actual.getPort());
    Assert.assertNull(actual.getPieceSize());
    Assert.assertEquals(PeerTaskStatus.WAIT, actual.getStatus());
    Assert.assertNull(actual.getTaskId());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullPositiveNotNullNotNullOutputNotNull999007162e01c3d3b10() {

    // Arrange
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final int arg2 = 1;
    final String arg3 = "aaaaa";
    final Integer arg4 = new Integer(1);

    // Act, creating object to test constructor
    final PeerTask actual = new PeerTask(arg0, arg1, arg2, arg3, arg4);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getPath());
    Assert.assertEquals("aaaaa", actual.getCid());
    Assert.assertEquals(1, actual.getPort());
    Assert.assertNotNull(actual.getPieceSize());
    Assert.assertEquals(PeerTaskStatus.WAIT, actual.getStatus());
    Assert.assertEquals("aaaaa", actual.getTaskId());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCidOutputVoid999e1b514013ddf40d6() {

    // Arrange
    final PeerTask thisObj = new PeerTask();

    // Act
    final String actual = thisObj.getCid();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPathOutputVoid9998288bd84fa2fe23a() {

    // Arrange
    final PeerTask thisObj = new PeerTask();

    // Act
    final String actual = thisObj.getPath();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceSizeOutputVoid999b8fcb7dfeafc24c2() {

    // Arrange
    final PeerTask thisObj = new PeerTask();

    // Act
    final Integer actual = thisObj.getPieceSize();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPortOutputZero99984d931784645126b() {

    // Arrange
    final PeerTask thisObj = new PeerTask();

    // Act
    final int actual = thisObj.getPort();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getStatusOutputWait999720058e442a027f3() {

    // Arrange
    final PeerTask thisObj = new PeerTask();

    // Act
    final PeerTaskStatus actual = thisObj.getStatus();

    // Assert result
    Assert.assertEquals(PeerTaskStatus.WAIT, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTaskIdOutputVoid99921355aece47084ba() {

    // Arrange
    final PeerTask thisObj = new PeerTask();

    // Act
    final String actual = thisObj.getTaskId();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isSuccessOutputFalse999afd3ae65dd0b3283() {

    // Arrange
    final PeerTask thisObj = new PeerTask();

    // Act
    final boolean actual = thisObj.isSuccess();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setCidInputNotNullOutputVoid999ccdc26d8c6e7b41b() {

    // Arrange
    final PeerTask thisObj = new PeerTask();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setCid(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getCid());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPathInputNotNullOutputVoid9993da7701cf4038fd2() {

    // Arrange
    final PeerTask thisObj = new PeerTask();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setPath(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getPath());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPieceSizeInputNotNullOutputVoid999f6f67437d5c15b52() {

    // Arrange
    final PeerTask thisObj = new PeerTask();
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setPieceSize(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getPieceSize());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPortInputPositiveOutputVoid9995266ea58b5311d00() {

    // Arrange
    final PeerTask thisObj = new PeerTask();
    final int arg0 = 1;

    // Act
    thisObj.setPort(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getPort());

  }

  // Test written by Diffblue Cover
  @Test
  public void setStatusInputWaitOutputVoid9998ebf267c9f240238() {

    // Arrange
    final PeerTask thisObj = new PeerTask();
    final PeerTaskStatus arg0 = PeerTaskStatus.WAIT;

    // Act
    thisObj.setStatus(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setTaskIdInputNotNullOutputVoid999bdfa38ea3a0bd601() {

    // Arrange
    final PeerTask thisObj = new PeerTask();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setTaskId(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getTaskId());

  }
}
