package com.alibaba.dragonfly.supernode.common.domain;

import com.alibaba.dragonfly.supernode.common.domain.PeerInfo;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PeerInfoTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final PeerInfo actual = new PeerInfo();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getCid());
    Assert.assertNull(actual.getHostName());
    Assert.assertNull(actual.getIp());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCidOutputNull() {

    // Arrange
    final PeerInfo peerInfo = new PeerInfo();

    // Act and Assert result
    Assert.assertNull(peerInfo.getCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHostNameOutputNull() {

    // Arrange
    final PeerInfo peerInfo = new PeerInfo();

    // Act and Assert result
    Assert.assertNull(peerInfo.getHostName());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIpOutputNull() {

    // Arrange
    final PeerInfo peerInfo = new PeerInfo();

    // Act and Assert result
    Assert.assertNull(peerInfo.getIp());
  }

  // Test written by Diffblue Cover.
  @Test
  public void newInstanceInputNotNullNotNullNotNullOutputNotNull() {

    // Act
    final PeerInfo actual = PeerInfo.newInstance("", "", "");

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("", actual.getCid());
    Assert.assertEquals("", actual.getHostName());
    Assert.assertEquals("", actual.getIp());
  }

  // Test written by Diffblue Cover.
  @Test
  public void newInstanceInputNullOutputNullPointerException() {

    // Act
    thrown.expect(NullPointerException.class);
    PeerInfo.newInstance(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCidInputNotNullOutputVoid() {

    // Arrange
    final PeerInfo peerInfo = new PeerInfo();

    // Act
    peerInfo.setCid("");

    // Assert side effects
    Assert.assertEquals("", peerInfo.getCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setHostNameInputNotNullOutputVoid() {

    // Arrange
    final PeerInfo peerInfo = new PeerInfo();

    // Act
    peerInfo.setHostName("");

    // Assert side effects
    Assert.assertEquals("", peerInfo.getHostName());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setIpInputNotNullOutputVoid() {

    // Arrange
    final PeerInfo peerInfo = new PeerInfo();

    // Act
    peerInfo.setIp("");

    // Assert side effects
    Assert.assertEquals("", peerInfo.getIp());
  }
}
