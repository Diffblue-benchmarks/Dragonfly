package com.alibaba.dragonfly.supernode.common.domain;

import com.alibaba.dragonfly.supernode.common.domain.PeerInfo;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;



public class PeerInfoTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c7e8f87210616aa1() {

    // Act, creating object to test constructor
    final PeerInfo actual = new PeerInfo();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getHostName());
    Assert.assertNull(actual.getIp());
    Assert.assertNull(actual.getCid());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCidOutputVoid9995d9cc93830faff10() {

    // Arrange
    final PeerInfo thisObj = new PeerInfo();

    // Act
    final String actual = thisObj.getCid();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHostNameOutputVoid999302d7792dbeca258() {

    // Arrange
    final PeerInfo thisObj = new PeerInfo();

    // Act
    final String actual = thisObj.getHostName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIpOutputVoid9994dcd5e623a2ddb74() {

    // Arrange
    final PeerInfo thisObj = new PeerInfo();

    // Act
    final String actual = thisObj.getIp();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void newInstanceInputNotNullNotNullNotNullOutputNotNull999eac03480808230ec() {

    // Arrange
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";

    // Act
    final PeerInfo actual = PeerInfo.newInstance(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getHostName());
    Assert.assertEquals("aaaaa", actual.getIp());
    Assert.assertEquals("aaaaa", actual.getCid());

  }

  // Test written by Diffblue Cover
  @Test
  public void newInstanceInputNotNullOutputNotNull999f048dd381e3e98c3() {

    // Arrange
    final HashMap<String, String> arg0 = new HashMap<String, String>();
    arg0.put("aaaaa", "aaaaa");

    // Act
    final PeerInfo actual = PeerInfo.newInstance(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getHostName());
    Assert.assertNull(actual.getIp());
    Assert.assertNull(actual.getCid());

  }

  // Test written by Diffblue Cover
  @Test
  public void setCidInputNotNullOutputVoid9994bc6b6ddc00d2de0() {

    // Arrange
    final PeerInfo thisObj = new PeerInfo();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setCid(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getCid());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHostNameInputNotNullOutputVoid9996ab0cf9ce145892c() {

    // Arrange
    final PeerInfo thisObj = new PeerInfo();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setHostName(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getHostName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setIpInputNotNullOutputVoid99945dcb0a730084427() {

    // Arrange
    final PeerInfo thisObj = new PeerInfo();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setIp(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getIp());

  }
}
