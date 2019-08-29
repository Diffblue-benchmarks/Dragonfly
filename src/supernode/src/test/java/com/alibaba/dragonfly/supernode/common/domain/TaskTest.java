package com.alibaba.dragonfly.supernode.common.domain;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
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
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(PowerMockRunner.class)
public class TaskTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void addAuthIpsInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final String ip = "";
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.addAuthIps(ip);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void constructorInputNotNullNotNullNotNullNotNull0FalseNotNullOutputVoid()
      throws Exception {

    // Arrange
    final String sourceUrl = "@@@";
    final String taskUrl = "!!!!!!!!";
    final String md5 = "!!!!";
    final String bizId = "!!!!";
    final String[] headers = {};
    final boolean dfdaemon = false;
    final String curIp = "  ";
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act, creating object to test constructor
    final Task actual = new Task(sourceUrl, taskUrl, md5, bizId, headers, dfdaemon, curIp);

    // Assert side effects
    Assert.assertEquals("!!!!", actual.getMd5());
    Assert.assertEquals("!!!!", actual.getBizId());
    Assert.assertEquals("!!!!!!!!", actual.getTaskUrl());
    Assert.assertEquals(new Integer(-1), actual.getPieceTotal());
    Assert.assertEquals("  ", actual.getCurIp());
    Assert.assertEquals("@@@", actual.getSourceUrl());
    Assert.assertEquals(CdnStatus.WAIT, actual.getCdnStatus());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void constructorInputNotNullNotNullNotNullOutputVoid() throws Exception {

    // Arrange
    final String taskUrl = "";
    final String md5 = "        ";
    final String bizId = "";
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act, creating object to test constructor
    final Task actual = new Task(taskUrl, md5, bizId);

    // Assert side effects
    Assert.assertEquals("        ", actual.getMd5());
    Assert.assertEquals("", actual.getBizId());
    Assert.assertEquals("", actual.getTaskUrl());
    Assert.assertEquals(new Integer(-1), actual.getPieceTotal());
    Assert.assertEquals(CdnStatus.WAIT, actual.getCdnStatus());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, Task.class})
  @Test
  public void equalsInputNotNullOutputFalse() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final Task obj =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    obj.setNotReachable(false);
    Reflector.setField(obj, "md5", null);
    Reflector.setField(obj, "authIps", null);
    obj.setFileLength(null);
    obj.setBizId(null);
    obj.setPieceSize(null);
    obj.setHttpFileLen(null);
    Reflector.setField(obj, "dfdaemon", false);
    obj.setHeaders(null);
    obj.setRealMd5(null);
    obj.setTaskUrl(null);
    obj.setPieceTotal(-1);
    obj.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap1 =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(obj, "pieceMd5Map", concurrentHashMap1);
    obj.setSourceUrl(null);
    obj.setCdnStatus(CdnStatus.WAIT);
    obj.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withNoArguments()
        .thenReturn(concurrentHashMap)
        .thenReturn(concurrentHashMap1);
    final Method equalsMethod = DTUMemberMatcher.method(StringUtils.class, "equals",
                                                        CharSequence.class, CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, equalsMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)),
                       or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = task.equals(obj);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, Task.class})
  @Test
  public void equalsInputNotNullOutputFalse2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final Task obj =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    obj.setNotReachable(false);
    Reflector.setField(obj, "md5", null);
    Reflector.setField(obj, "authIps", null);
    obj.setFileLength(null);
    obj.setBizId(null);
    obj.setPieceSize(null);
    obj.setHttpFileLen(null);
    Reflector.setField(obj, "dfdaemon", false);
    obj.setHeaders(null);
    obj.setRealMd5(null);
    obj.setTaskUrl(null);
    obj.setPieceTotal(-1);
    obj.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap1 =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(obj, "pieceMd5Map", concurrentHashMap1);
    obj.setSourceUrl(null);
    obj.setCdnStatus(CdnStatus.WAIT);
    obj.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withNoArguments()
        .thenReturn(concurrentHashMap)
        .thenReturn(concurrentHashMap1);
    final Method equalsMethod = DTUMemberMatcher.method(StringUtils.class, "equals",
                                                        CharSequence.class, CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(false))
        .when(StringUtils.class, equalsMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)),
                       or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = task.equals(obj);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, Task.class})
  @Test
  public void equalsInputNotNullOutputTrue() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final Task obj =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    obj.setNotReachable(false);
    Reflector.setField(obj, "md5", null);
    Reflector.setField(obj, "authIps", null);
    obj.setFileLength(null);
    obj.setBizId(null);
    obj.setPieceSize(null);
    obj.setHttpFileLen(null);
    Reflector.setField(obj, "dfdaemon", false);
    obj.setHeaders(null);
    obj.setRealMd5(null);
    obj.setTaskUrl(null);
    obj.setPieceTotal(-1);
    obj.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap1 =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(obj, "pieceMd5Map", concurrentHashMap1);
    obj.setSourceUrl(null);
    obj.setCdnStatus(CdnStatus.WAIT);
    obj.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withNoArguments()
        .thenReturn(concurrentHashMap)
        .thenReturn(concurrentHashMap1);
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method equalsMethod = DTUMemberMatcher.method(StringUtils.class, "equals",
                                                        CharSequence.class, CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(true))
        .when(StringUtils.class, equalsMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)),
                       or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = task.equals(obj);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, Task.class})
  @Test
  public void equalsInputNotNullOutputTrue2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    Reflector.setField(task, "notReachable", false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    Reflector.setField(task, "fileLength", null);
    Reflector.setField(task, "bizId", null);
    Reflector.setField(task, "pieceSize", null);
    Reflector.setField(task, "httpFileLen", null);
    Reflector.setField(task, "dfdaemon", false);
    Reflector.setField(task, "headers", null);
    Reflector.setField(task, "realMd5", null);
    Reflector.setField(task, "taskUrl", null);
    Reflector.setField(task, "pieceTotal", -1);
    Reflector.setField(task, "curIp", null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    Reflector.setField(task, "sourceUrl", null);
    Reflector.setField(task, "cdnStatus", CdnStatus.WAIT);
    Reflector.setField(task, "taskId", null);
    final Task obj =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    Reflector.setField(obj, "notReachable", false);
    Reflector.setField(obj, "md5", "        ");
    Reflector.setField(obj, "authIps", null);
    Reflector.setField(obj, "fileLength", null);
    Reflector.setField(obj, "bizId", "        ");
    Reflector.setField(obj, "pieceSize", null);
    Reflector.setField(obj, "httpFileLen", null);
    Reflector.setField(obj, "dfdaemon", false);
    Reflector.setField(obj, "headers", null);
    Reflector.setField(obj, "realMd5", null);
    Reflector.setField(obj, "taskUrl", "        ");
    Reflector.setField(obj, "pieceTotal", -1);
    Reflector.setField(obj, "curIp", null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap1 =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(obj, "pieceMd5Map", concurrentHashMap1);
    Reflector.setField(obj, "sourceUrl", null);
    Reflector.setField(obj, "cdnStatus", CdnStatus.WAIT);
    Reflector.setField(obj, "taskId", null);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withNoArguments()
        .thenReturn(concurrentHashMap)
        .thenReturn(concurrentHashMap1);
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method equalsMethod = DTUMemberMatcher.method(StringUtils.class, "equals",
                                                        CharSequence.class, CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(true).doReturn(true))
        .when(StringUtils.class, equalsMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)),
                       or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = task.equals(obj);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getBizIdOutputNull() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final String actual = task.getBizId();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getCdnStatusOutputWait() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final CdnStatus actual = task.getCdnStatus();

    // Assert result
    Assert.assertEquals(CdnStatus.WAIT, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getCurIpOutputNull() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final String actual = task.getCurIp();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getFileLengthOutputNull() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final Long actual = task.getFileLength();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getHeadersOutputNull() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final String[] actual = task.getHeaders();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getHttpFileLenOutputNull() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final Long actual = task.getHttpFileLen();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getMd5OutputNull() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final String actual = task.getMd5();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, Task.class})
  @Test
  public void getPieceMd5InputZeroOutputNotNull() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    final Method getMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "get", Object.class);
    PowerMockito.doReturn("")
        .when(concurrentHashMap, getMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final int pieceNum = 0;
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final String actual = task.getPieceMd5(pieceNum);

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, Task.class})
  @Test
  public void getPieceMd5InputZeroOutputNotNull2() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    Reflector.setField(task, "notReachable", false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    Reflector.setField(task, "fileLength", null);
    Reflector.setField(task, "bizId", null);
    Reflector.setField(task, "pieceSize", null);
    Reflector.setField(task, "httpFileLen", null);
    Reflector.setField(task, "dfdaemon", false);
    Reflector.setField(task, "headers", null);
    Reflector.setField(task, "realMd5", null);
    Reflector.setField(task, "taskUrl", null);
    Reflector.setField(task, "pieceTotal", -1);
    Reflector.setField(task, "curIp", null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    final Method getMethod = DTUMemberMatcher.method(ConcurrentHashMap.class, "get", Object.class);
    PowerMockito.doReturn(null)
        .when(concurrentHashMap, getMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    Reflector.setField(task, "sourceUrl", null);
    Reflector.setField(task, "cdnStatus", CdnStatus.WAIT);
    Reflector.setField(task, "taskId", null);
    final int pieceNum = 0;
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final String actual = task.getPieceMd5(pieceNum);

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getPieceMd5MapOutputNotNull() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final ConcurrentHashMap<Integer, String> actual = task.getPieceMd5Map();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getPieceSizeOutputNull() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final Integer actual = task.getPieceSize();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getPieceTotalOutputNegative() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final Integer actual = task.getPieceTotal();

    // Assert result
    Assert.assertEquals(new Integer(-1), actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getRealMd5OutputNull() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final String actual = task.getRealMd5();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getSourceUrlOutputNull() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final String actual = task.getSourceUrl();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getTaskIdOutputNull() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final String actual = task.getTaskId();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getTaskUrlOutputNull() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final String actual = task.getTaskUrl();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, Task.class})
  @Test
  public void hashCodeOutputPositive() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false))
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final int actual = task.hashCode();

    // Assert result
    Assert.assertEquals(17, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, Task.class})
  @Test
  public void hashCodeOutputPositive2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    Reflector.setField(task, "notReachable", false);
    Reflector.setField(task, "md5", "G@");
    Reflector.setField(task, "authIps", null);
    Reflector.setField(task, "fileLength", null);
    Reflector.setField(task, "bizId", "!");
    Reflector.setField(task, "pieceSize", null);
    Reflector.setField(task, "httpFileLen", null);
    Reflector.setField(task, "dfdaemon", false);
    final String[] stringArray = {};
    Reflector.setField(task, "headers", stringArray);
    Reflector.setField(task, "realMd5", null);
    Reflector.setField(task, "taskUrl", "");
    Reflector.setField(task, "pieceTotal", -1);
    Reflector.setField(task, "curIp", "00000000");
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    Reflector.setField(task, "sourceUrl", "0");
    Reflector.setField(task, "cdnStatus", CdnStatus.WAIT);
    Reflector.setField(task, "taskId", null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false))
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final int actual = task.hashCode();

    // Assert result
    Assert.assertEquals(527, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, Task.class})
  @Test
  public void hashCodeOutputPositive3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    Reflector.setField(task, "notReachable", false);
    Reflector.setField(task, "md5", "G@");
    Reflector.setField(task, "authIps", null);
    Reflector.setField(task, "fileLength", null);
    Reflector.setField(task, "bizId", "");
    Reflector.setField(task, "pieceSize", null);
    Reflector.setField(task, "httpFileLen", null);
    Reflector.setField(task, "dfdaemon", false);
    final String[] stringArray = {};
    Reflector.setField(task, "headers", stringArray);
    Reflector.setField(task, "realMd5", null);
    Reflector.setField(task, "taskUrl", "");
    Reflector.setField(task, "pieceTotal", -1);
    Reflector.setField(task, "curIp", "00000000");
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    Reflector.setField(task, "sourceUrl", "0");
    Reflector.setField(task, "cdnStatus", CdnStatus.WAIT);
    Reflector.setField(task, "taskId", null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final int actual = task.hashCode();

    // Assert result
    Assert.assertEquals(16_337, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, Task.class})
  @Test
  public void hashCodeOutputPositive4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    Reflector.setField(task, "notReachable", false);
    Reflector.setField(task, "md5", "");
    Reflector.setField(task, "authIps", null);
    Reflector.setField(task, "fileLength", null);
    Reflector.setField(task, "bizId", "");
    Reflector.setField(task, "pieceSize", null);
    Reflector.setField(task, "httpFileLen", null);
    Reflector.setField(task, "dfdaemon", false);
    Reflector.setField(task, "headers", null);
    Reflector.setField(task, "realMd5", null);
    Reflector.setField(task, "taskUrl", "");
    Reflector.setField(task, "pieceTotal", -1);
    Reflector.setField(task, "curIp", null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    Reflector.setField(task, "sourceUrl", null);
    Reflector.setField(task, "cdnStatus", CdnStatus.WAIT);
    Reflector.setField(task, "taskId", null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final int actual = task.hashCode();

    // Assert result
    Assert.assertEquals(16_337, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void inAuthIpsInputNotNullOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    Reflector.setField(task, "notReachable", false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    Reflector.setField(task, "fileLength", null);
    Reflector.setField(task, "bizId", null);
    Reflector.setField(task, "pieceSize", null);
    Reflector.setField(task, "httpFileLen", null);
    Reflector.setField(task, "dfdaemon", false);
    Reflector.setField(task, "headers", null);
    Reflector.setField(task, "realMd5", null);
    Reflector.setField(task, "taskUrl", null);
    Reflector.setField(task, "pieceTotal", -1);
    Reflector.setField(task, "curIp", null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    Reflector.setField(task, "sourceUrl", null);
    Reflector.setField(task, "cdnStatus", CdnStatus.WAIT);
    Reflector.setField(task, "taskId", null);
    final String ip =
        "??????????????????????????????????????????????????????????????????????????????????????????????????";
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    thrown.expect(NullPointerException.class);
    task.inAuthIps(ip);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void isDfdaemonOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final boolean actual = task.isDfdaemon();

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void isFailOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final boolean actual = task.isFail();

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({CdnStatus.class, Task.class})
  @Test
  public void isFrozenOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    Reflector.setField(task, "notReachable", false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    Reflector.setField(task, "fileLength", null);
    Reflector.setField(task, "bizId", null);
    Reflector.setField(task, "pieceSize", null);
    Reflector.setField(task, "httpFileLen", null);
    Reflector.setField(task, "dfdaemon", false);
    Reflector.setField(task, "headers", null);
    Reflector.setField(task, "realMd5", null);
    Reflector.setField(task, "taskUrl", null);
    Reflector.setField(task, "pieceTotal", -1);
    Reflector.setField(task, "curIp", null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    Reflector.setField(task, "sourceUrl", null);
    final CdnStatus cdnStatus = PowerMockito.mock(CdnStatus.class);
    final Method equalsMethod = DTUMemberMatcher.method(CdnStatus.class, "equals", Object.class);
    PowerMockito.doReturn(false)
        .when(cdnStatus, equalsMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(task, "cdnStatus", cdnStatus);
    Reflector.setField(task, "taskId", null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final boolean actual = task.isFrozen();

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void isFrozenOutputTrue() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final boolean actual = task.isFrozen();

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void isNotReachableOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final boolean actual = task.isNotReachable();

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void isSuccessOutputFalse() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final boolean actual = task.isSuccess();

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void isWaitOutputTrue() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    final boolean actual = task.isWait();

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void setBizIdInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final String bizId = "";
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.setBizId(bizId);

    // Assert side effects
    Assert.assertEquals("", task.getBizId());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void setCdnStatusInputSuccessOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final CdnStatus cdnStatus = CdnStatus.SUCCESS;
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.setCdnStatus(cdnStatus);

    // Assert side effects
    Assert.assertEquals(CdnStatus.SUCCESS, task.getCdnStatus());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void setCurIpInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final String curIp = "";
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.setCurIp(curIp);

    // Assert side effects
    Assert.assertEquals("", task.getCurIp());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void setFileLengthInputNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    Reflector.setField(task, "notReachable", false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    Reflector.setField(task, "bizId", null);
    Reflector.setField(task, "pieceSize", null);
    Reflector.setField(task, "httpFileLen", null);
    Reflector.setField(task, "dfdaemon", false);
    Reflector.setField(task, "headers", null);
    Reflector.setField(task, "realMd5", null);
    Reflector.setField(task, "taskUrl", null);
    Reflector.setField(task, "pieceTotal", -1);
    Reflector.setField(task, "curIp", null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    Reflector.setField(task, "sourceUrl", null);
    Reflector.setField(task, "cdnStatus", CdnStatus.WAIT);
    Reflector.setField(task, "taskId", null);
    final Long fileLength = null;
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.setFileLength(fileLength);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void setHeadersInput0OutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final String[] headers = {};
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.setHeaders(headers);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void setHttpFileLenInputNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    Reflector.setField(task, "notReachable", false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    Reflector.setField(task, "fileLength", null);
    Reflector.setField(task, "bizId", null);
    Reflector.setField(task, "pieceSize", null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    Reflector.setField(task, "headers", null);
    Reflector.setField(task, "realMd5", null);
    Reflector.setField(task, "taskUrl", null);
    Reflector.setField(task, "pieceTotal", -1);
    Reflector.setField(task, "curIp", null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    Reflector.setField(task, "sourceUrl", null);
    Reflector.setField(task, "cdnStatus", CdnStatus.WAIT);
    Reflector.setField(task, "taskId", null);
    final Long httpFileLen = null;
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.setHttpFileLen(httpFileLen);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void setNotReachableInputFalseOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final boolean notReachable = false;
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.setNotReachable(notReachable);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, Task.class})
  @Test
  public void setPieceMd5InputZeroNotNullOutputFalse() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final int pieceNum = 0;
    final String md5 = "";
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = task.setPieceMd5(pieceNum, md5);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, StringUtils.class, Task.class})
  @Test
  public void setPieceMd5InputZeroNotNullOutputTrue() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    final Method putIfAbsentMethod =
        DTUMemberMatcher.method(ConcurrentHashMap.class, "putIfAbsent", Object.class, Object.class);
    PowerMockito.doReturn(0)
        .when(concurrentHashMap, putIfAbsentMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)),
                       or(isA(Object.class), isNull(Object.class)));
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final int pieceNum = 0;
    final String md5 = "";
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = task.setPieceMd5(pieceNum, md5);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void setPieceSizeInputZeroOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final Integer pieceSize = 0;
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.setPieceSize(pieceSize);

    // Assert side effects
    Assert.assertEquals(new Integer(0), task.getPieceSize());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void setPieceTotalInputZeroOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final Integer pieceTotal = 0;
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.setPieceTotal(pieceTotal);

    // Assert side effects
    Assert.assertEquals(new Integer(0), task.getPieceTotal());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void setRealMd5InputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final String realMd5 = "";
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.setRealMd5(realMd5);

    // Assert side effects
    Assert.assertEquals("", task.getRealMd5());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void setSourceUrlInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final String sourceUrl = "";
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.setSourceUrl(sourceUrl);

    // Assert side effects
    Assert.assertEquals("", task.getSourceUrl());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void setTaskIdInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final String taskId = "";
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.setTaskId(taskId);

    // Assert side effects
    Assert.assertEquals("", task.getTaskId());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void setTaskUrlInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    final String taskUrl = "";
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    task.setTaskUrl(taskUrl);

    // Assert side effects
    Assert.assertEquals("", task.getTaskUrl());
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");

    // The method returns void, testing that no exception is thrown
  }
}
