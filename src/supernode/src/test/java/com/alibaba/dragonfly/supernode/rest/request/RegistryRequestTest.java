package com.alibaba.dragonfly.supernode.rest.request;

import com.alibaba.dragonfly.supernode.rest.request.RegistryRequest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class RegistryRequestTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void canEqualInputNotNullOutputFalse999799f4b15347784b7() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.canEqual(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ba3a07e314fd49f0() {

    // Act, creating object to test constructor
    final RegistryRequest actual = new RegistryRequest();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getIp());
    Assert.assertNull(actual.getHostName());
    Assert.assertNull(actual.getRawUrl());
    Assert.assertNull(actual.getHeaders());
    Assert.assertNull(actual.getCid());
    Assert.assertNull(actual.getIdentifier());
    Assert.assertNull(actual.getVersion());
    Assert.assertFalse(actual.isDfdaemon());
    Assert.assertNull(actual.getMd5());
    Assert.assertNull(actual.getPath());
    Assert.assertNull(actual.getPort());
    Assert.assertNull(actual.getSuperNodeIp());
    Assert.assertNull(actual.getTaskUrl());

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse9997181055528775e06() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getCidOutputVoid999b6841428404f9e64() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final String actual = thisObj.getCid();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadersOutputVoid99909d0f704f57a40d7() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final String[] actual = thisObj.getHeaders();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHostNameOutputVoid99965a6f473c11ed63f() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final String actual = thisObj.getHostName();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIdentifierOutputVoid999064635608143fd71() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final String actual = thisObj.getIdentifier();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIpOutputVoid999c66360b745d0128f() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final String actual = thisObj.getIp();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMd5OutputVoid9990e2f24213eff5a5a() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final String actual = thisObj.getMd5();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPathOutputVoid99998251fdf21aa6f03() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final String actual = thisObj.getPath();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPortOutputVoid99907434c0d4a148672() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final String actual = thisObj.getPort();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRawUrlOutputVoid9997d70d718fc9e8764() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final String actual = thisObj.getRawUrl();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSuperNodeIpOutputVoid999aaadeda1a5a380a9() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final String actual = thisObj.getSuperNodeIp();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTaskUrlOutputVoid999f018a4a1372f16d8() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final String actual = thisObj.getTaskUrl();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getVersionOutputVoid99906d395d445306aa3() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final String actual = thisObj.getVersion();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputPositive99957590e6742f55972() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(1_359_851_307, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isDfdaemonOutputFalse999e9c1700d310505e5() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final boolean actual = thisObj.isDfdaemon();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setCidInputNotNullOutputVoid999d092e88e42539132() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setCid(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getCid());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDfdaemonInputTrueOutputVoid999eb7ba7a35c7921e6() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final boolean arg0 = true;

    // Act
    thisObj.setDfdaemon(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isDfdaemon());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadersInput3OutputVoid9993b1876f54a8cf54f() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    thisObj.setHeaders(arg0);

    // Assert side effects
    Assert.assertArrayEquals(new String[]{ "aaaaa", "aaaaa", "aaaaa" }, thisObj.getHeaders());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHostNameInputNotNullOutputVoid999890396533ff58317() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setHostName(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getHostName());

  }

  // Test written by Diffblue Cover
  @Test
  public void setIdentifierInputNotNullOutputVoid999399fdb83afa2a485() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setIdentifier(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getIdentifier());

  }

  // Test written by Diffblue Cover
  @Test
  public void setIpInputNotNullOutputVoid999b6e239ca6794ab2e() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setIp(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getIp());

  }

  // Test written by Diffblue Cover
  @Test
  public void setMd5InputNotNullOutputVoid99961c3bdb9b1f4a815() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setMd5(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getMd5());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPathInputNotNullOutputVoid9992b6b70a2ac41d056() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setPath(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getPath());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPortInputNotNullOutputVoid99957cdf934c03f549d() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setPort(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getPort());

  }

  // Test written by Diffblue Cover
  @Test
  public void setRawUrlInputNotNullOutputVoid999366e194e1207818e() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setRawUrl(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getRawUrl());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSuperNodeIpInputNotNullOutputVoid999dc888d14c1000d7d() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setSuperNodeIp(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getSuperNodeIp());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTaskUrlInputNotNullOutputVoid99954652ff614cc3fc5() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setTaskUrl(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getTaskUrl());

  }

  // Test written by Diffblue Cover
  @Test
  public void setVersionInputNotNullOutputVoid9998f467d2ad7f880da() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setVersion(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getVersion());

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999c4960ef1d75cd8da() {

    // Arrange
    final RegistryRequest thisObj = new RegistryRequest();

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("RegistryRequest(cid=null, ip=null, hostName=null, rawUrl=null, taskUrl=null, md5=null, identifier=null, port=null, path=null, version=null, superNodeIp=null, headers=null, dfdaemon=false)", actual);

  }
}
