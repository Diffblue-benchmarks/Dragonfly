package com.alibaba.dragonfly.supernode.service.impl;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.domain.PeerInfo;
import com.alibaba.dragonfly.supernode.common.exception.ValidateException;
import com.alibaba.dragonfly.supernode.service.impl.PeerRegistryServiceImpl;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class PeerRegistryServiceImplTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final PeerRegistryServiceImpl actual = new PeerRegistryServiceImpl();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void registryCdnNodeInputNullOutputNullPointerException() {

    // Arrange
    final PeerRegistryServiceImpl peerRegistryServiceImpl = new PeerRegistryServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    peerRegistryServiceImpl.registryCdnNode(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, String.class})
  @Test
  public void
  registryTaskInputNotNullNotNullNotNullNotNullNotNullNotNullNotNullNotNullNotNullNullFalseOutputValidateException()
      throws Exception, InvocationTargetException, ValidateException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerRegistryServiceImpl peerRegistryServiceImpl =
        (PeerRegistryServiceImpl)Reflector.getInstance(
            "com.alibaba.dragonfly.supernode.service.impl.PeerRegistryServiceImpl");
    Reflector.setField(peerRegistryServiceImpl, "taskService", null);
    Reflector.setField(peerRegistryServiceImpl, "peerService", null);
    Reflector.setField(peerRegistryServiceImpl, "peerTaskService", null);
    Reflector.setField(peerRegistryServiceImpl, "dataGcService", null);
    Reflector.setField(peerRegistryServiceImpl, "lockService", null);
    Reflector.setField(peerRegistryServiceImpl, "progressService", null);
    Reflector.setField(peerRegistryServiceImpl, "cdnManager", null);
    final String sourceUrl = PowerMockito.mock(String.class);
    PowerMockito.when(sourceUrl.matches(or(isA(String.class), isNull(String.class))))
        .thenReturn(true);
    final char[] myCharArray = {'?'};
    Reflector.setField(sourceUrl, "data", myCharArray);
    Reflector.setField(sourceUrl, "length", 1);
    final String taskUrl = "?";
    final String md5 = "?";
    final String bizId = "?";
    final String port = "?";
    final PeerInfo peerInfo =
        (PeerInfo)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.PeerInfo");
    Reflector.setField(peerInfo, "cid", null);
    Reflector.setField(peerInfo, "hostName", null);
    Reflector.setField(peerInfo, "ip", null);
    final String path = "?";
    final String version = "?";
    final String superNodeIp = "?";
    final String[] headers = null;
    final boolean dfdaemon = false;
    final Method isNumericMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNumeric", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isNumericMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method isEmptyMethod =
        DTUMemberMatcher.method(StringUtils.class, "isEmpty", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isEmptyMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    thrown.expect(ValidateException.class);
    peerRegistryServiceImpl.registryTask(sourceUrl, taskUrl, md5, bizId, port, peerInfo, path,
                                         version, superNodeIp, headers, dfdaemon);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void
  registryTaskInputNotNullNotNullNotNullNotNullNotNullNullNotNullNotNullNotNullNullFalseOutputValidateException()
      throws Exception, InvocationTargetException, ValidateException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerRegistryServiceImpl peerRegistryServiceImpl =
        (PeerRegistryServiceImpl)Reflector.getInstance(
            "com.alibaba.dragonfly.supernode.service.impl.PeerRegistryServiceImpl");
    Reflector.setField(peerRegistryServiceImpl, "taskService", null);
    Reflector.setField(peerRegistryServiceImpl, "peerService", null);
    Reflector.setField(peerRegistryServiceImpl, "peerTaskService", null);
    Reflector.setField(peerRegistryServiceImpl, "dataGcService", null);
    Reflector.setField(peerRegistryServiceImpl, "lockService", null);
    Reflector.setField(peerRegistryServiceImpl, "progressService", null);
    Reflector.setField(peerRegistryServiceImpl, "cdnManager", null);
    final String sourceUrl = "?";
    final String taskUrl = "?";
    final String md5 = "?";
    final String bizId = "?";
    final String port = "?";
    final PeerInfo peerInfo = null;
    final String path = "?";
    final String version = "?";
    final String superNodeIp = "?";
    final String[] headers = null;
    final boolean dfdaemon = false;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    thrown.expect(ValidateException.class);
    peerRegistryServiceImpl.registryTask(sourceUrl, taskUrl, md5, bizId, port, peerInfo, path,
                                         version, superNodeIp, headers, dfdaemon);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, String.class})
  @Test
  public void
  registryTaskInputNotNullNotNullNotNullNotNullNotNullNullNotNullNotNullNotNullNullFalseOutputValidateException2()
      throws Exception, InvocationTargetException, ValidateException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerRegistryServiceImpl peerRegistryServiceImpl =
        (PeerRegistryServiceImpl)Reflector.getInstance(
            "com.alibaba.dragonfly.supernode.service.impl.PeerRegistryServiceImpl");
    Reflector.setField(peerRegistryServiceImpl, "taskService", null);
    Reflector.setField(peerRegistryServiceImpl, "peerService", null);
    Reflector.setField(peerRegistryServiceImpl, "peerTaskService", null);
    Reflector.setField(peerRegistryServiceImpl, "dataGcService", null);
    Reflector.setField(peerRegistryServiceImpl, "lockService", null);
    Reflector.setField(peerRegistryServiceImpl, "progressService", null);
    Reflector.setField(peerRegistryServiceImpl, "cdnManager", null);
    final String sourceUrl = PowerMockito.mock(String.class);
    PowerMockito.when(sourceUrl.matches(or(isA(String.class), isNull(String.class))))
        .thenReturn(true);
    final char[] myCharArray = {'?'};
    Reflector.setField(sourceUrl, "data", myCharArray);
    Reflector.setField(sourceUrl, "length", 1);
    final String taskUrl = "?";
    final String md5 = "?";
    final String bizId = "?";
    final String port = "?";
    final PeerInfo peerInfo = null;
    final String path = "?";
    final String version = "?";
    final String superNodeIp = "?";
    final String[] headers = null;
    final boolean dfdaemon = false;
    final Method isNumericMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNumeric", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isNumericMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    thrown.expect(ValidateException.class);
    peerRegistryServiceImpl.registryTask(sourceUrl, taskUrl, md5, bizId, port, peerInfo, path,
                                         version, superNodeIp, headers, dfdaemon);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, String.class})
  @Test
  public void
  registryTaskInputNotNullNotNullNotNullNotNullNotNullNullNotNullNotNullNotNullNullFalseOutputValidateException3()
      throws Exception, InvocationTargetException, ValidateException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerRegistryServiceImpl peerRegistryServiceImpl =
        (PeerRegistryServiceImpl)Reflector.getInstance(
            "com.alibaba.dragonfly.supernode.service.impl.PeerRegistryServiceImpl");
    Reflector.setField(peerRegistryServiceImpl, "taskService", null);
    Reflector.setField(peerRegistryServiceImpl, "peerService", null);
    Reflector.setField(peerRegistryServiceImpl, "peerTaskService", null);
    Reflector.setField(peerRegistryServiceImpl, "dataGcService", null);
    Reflector.setField(peerRegistryServiceImpl, "lockService", null);
    Reflector.setField(peerRegistryServiceImpl, "progressService", null);
    Reflector.setField(peerRegistryServiceImpl, "cdnManager", null);
    final String sourceUrl = PowerMockito.mock(String.class);
    PowerMockito.when(sourceUrl.matches(or(isA(String.class), isNull(String.class))))
        .thenReturn(true);
    final char[] myCharArray = {'?'};
    Reflector.setField(sourceUrl, "data", myCharArray);
    Reflector.setField(sourceUrl, "length", 1);
    final String taskUrl = "?";
    final String md5 = "?";
    final String bizId = "?";
    final String port = "?";
    final PeerInfo peerInfo = null;
    final String path = "?";
    final String version = "?";
    final String superNodeIp = "?";
    final String[] headers = null;
    final boolean dfdaemon = false;
    final Method isNumericMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNumeric", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isNumericMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method isEmptyMethod =
        DTUMemberMatcher.method(StringUtils.class, "isEmpty", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isEmptyMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    thrown.expect(ValidateException.class);
    peerRegistryServiceImpl.registryTask(sourceUrl, taskUrl, md5, bizId, port, peerInfo, path,
                                         version, superNodeIp, headers, dfdaemon);

    // The method is not expected to return due to exception thrown
  }
}
