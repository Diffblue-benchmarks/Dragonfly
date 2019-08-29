package com.alibaba.dragonfly.supernode.rest.request;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.rest.request.RegistryRequest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Array;
import java.util.Arrays;

@RunWith(PowerMockRunner.class)
public class RegistryRequestTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest({RegistryRequest.class, Arrays.class})
  @Test
  public void equalsInputNotNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();
    registryRequest.setIdentifier(null);
    registryRequest.setVersion(null);
    registryRequest.setIp(null);
    registryRequest.setSuperNodeIp(null);
    registryRequest.setPort(null);
    registryRequest.setTaskUrl(null);
    registryRequest.setMd5(null);
    registryRequest.setCid(null);
    registryRequest.setHostName(null);
    registryRequest.setDfdaemon(false);
    registryRequest.setPath(null);
    registryRequest.setHeaders(null);
    registryRequest.setRawUrl(null);
    final RegistryRequest o = new RegistryRequest();
    o.setIdentifier(null);
    o.setVersion(null);
    o.setIp(null);
    o.setSuperNodeIp(null);
    o.setPort(null);
    o.setTaskUrl(null);
    o.setMd5(null);
    o.setCid(null);
    o.setHostName(null);
    o.setDfdaemon(false);
    o.setPath(null);
    o.setHeaders(null);
    o.setRawUrl(null);
    PowerMockito
        .when(
            Arrays.deepEquals(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                              or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class))))
        .thenReturn(false);

    // Act
    final boolean actual = registryRequest.equals(o);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({RegistryRequest.class, Arrays.class})
  @Test
  public void equalsInputNotNullOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();
    registryRequest.setIdentifier(null);
    registryRequest.setVersion(null);
    registryRequest.setIp(null);
    registryRequest.setSuperNodeIp(null);
    registryRequest.setPort(null);
    registryRequest.setTaskUrl(null);
    registryRequest.setMd5(null);
    registryRequest.setCid(null);
    registryRequest.setHostName(null);
    registryRequest.setDfdaemon(false);
    registryRequest.setPath(null);
    registryRequest.setHeaders(null);
    registryRequest.setRawUrl(null);
    final RegistryRequest o = new RegistryRequest();
    o.setIdentifier(null);
    o.setVersion(null);
    o.setIp(null);
    o.setSuperNodeIp(null);
    o.setPort(null);
    o.setTaskUrl(null);
    o.setMd5(null);
    o.setCid(null);
    o.setHostName(null);
    o.setDfdaemon(false);
    o.setPath(null);
    o.setHeaders(null);
    o.setRawUrl(null);
    PowerMockito
        .when(
            Arrays.deepEquals(or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class)),
                              or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class))))
        .thenReturn(true);

    // Act
    final boolean actual = registryRequest.equals(o);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertFalse(registryRequest.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCidOutputNull() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertNull(registryRequest.getCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHeadersOutputNull() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertNull(registryRequest.getHeaders());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHostNameOutputNull() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertNull(registryRequest.getHostName());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIdentifierOutputNull() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertNull(registryRequest.getIdentifier());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIpOutputNull() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertNull(registryRequest.getIp());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getMd5OutputNull() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertNull(registryRequest.getMd5());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPathOutputNull() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertNull(registryRequest.getPath());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPortOutputNull() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertNull(registryRequest.getPort());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRawUrlOutputNull() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertNull(registryRequest.getRawUrl());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSuperNodeIpOutputNull() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertNull(registryRequest.getSuperNodeIp());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTaskUrlOutputNull() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertNull(registryRequest.getTaskUrl());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getVersionOutputNull() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertNull(registryRequest.getVersion());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({RegistryRequest.class, Arrays.class})
  @Test
  public void hashCodeOutputZero() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Arrays.class);

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();
    registryRequest.setIdentifier(null);
    registryRequest.setVersion(null);
    registryRequest.setIp(null);
    registryRequest.setSuperNodeIp(null);
    registryRequest.setPort(null);
    registryRequest.setTaskUrl(null);
    registryRequest.setMd5(null);
    registryRequest.setCid(null);
    registryRequest.setHostName(null);
    registryRequest.setDfdaemon(false);
    registryRequest.setPath(null);
    registryRequest.setHeaders(null);
    registryRequest.setRawUrl(null);
    PowerMockito
        .when(Arrays.deepHashCode(
            or(isA(java.lang.Object[].class), isNull(java.lang.Object[].class))))
        .thenReturn(923_300_399);

    // Act
    final int actual = registryRequest.hashCode();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isDfdaemonOutputFalse() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act and Assert result
    Assert.assertFalse(registryRequest.isDfdaemon());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCidInputNotNullOutputVoid() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act
    registryRequest.setCid("@@@@@@@@");

    // Assert side effects
    Assert.assertEquals("@@@@@@@@", registryRequest.getCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setDfdaemonInputFalseOutputVoid() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act
    registryRequest.setDfdaemon(false);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setHeadersInput0OutputVoid() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();
    final String[] headers = {};

    // Act
    registryRequest.setHeaders(headers);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setHostNameInputNotNullOutputVoid() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act
    registryRequest.setHostName("@@@@@@@@");

    // Assert side effects
    Assert.assertEquals("@@@@@@@@", registryRequest.getHostName());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setIdentifierInputNotNullOutputVoid() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act
    registryRequest.setIdentifier("@@@@@@@@");

    // Assert side effects
    Assert.assertEquals("@@@@@@@@", registryRequest.getIdentifier());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setIpInputNotNullOutputVoid() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act
    registryRequest.setIp("@@@@@@@@");

    // Assert side effects
    Assert.assertEquals("@@@@@@@@", registryRequest.getIp());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setMd5InputNotNullOutputVoid() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act
    registryRequest.setMd5("@@@@@@@@");

    // Assert side effects
    Assert.assertEquals("@@@@@@@@", registryRequest.getMd5());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPathInputNotNullOutputVoid() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act
    registryRequest.setPath("@@@@@@@@");

    // Assert side effects
    Assert.assertEquals("@@@@@@@@", registryRequest.getPath());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPortInputNotNullOutputVoid() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act
    registryRequest.setPort("@@@@@@@@");

    // Assert side effects
    Assert.assertEquals("@@@@@@@@", registryRequest.getPort());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setRawUrlInputNotNullOutputVoid() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act
    registryRequest.setRawUrl("@@@@@@@@");

    // Assert side effects
    Assert.assertEquals("@@@@@@@@", registryRequest.getRawUrl());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setSuperNodeIpInputNotNullOutputVoid() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act
    registryRequest.setSuperNodeIp("@@@@@@@@");

    // Assert side effects
    Assert.assertEquals("@@@@@@@@", registryRequest.getSuperNodeIp());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setTaskUrlInputNotNullOutputVoid() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act
    registryRequest.setTaskUrl("@@@@@@@@");

    // Assert side effects
    Assert.assertEquals("@@@@@@@@", registryRequest.getTaskUrl());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setVersionInputNotNullOutputVoid() {

    // Arrange
    final RegistryRequest registryRequest = new RegistryRequest();

    // Act
    registryRequest.setVersion("@@@@@@@@");

    // Assert side effects
    Assert.assertEquals("@@@@@@@@", registryRequest.getVersion());
  }
}
