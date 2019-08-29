package com.alibaba.dragonfly.supernode.repository;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import com.alibaba.dragonfly.supernode.common.exception.AuthenticationRequiredException;
import com.alibaba.dragonfly.supernode.common.exception.AuthenticationWaitedException;
import com.alibaba.dragonfly.supernode.common.exception.TaskIdDuplicateException;
import com.alibaba.dragonfly.supernode.common.exception.UrlNotReachableException;
import com.alibaba.dragonfly.supernode.common.util.HttpClientUtil;
import com.alibaba.dragonfly.supernode.repository.TaskRepository;
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
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class TaskRepositoryTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, Task.class, TaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void addInputNotNullOutputNotNull()
      throws Exception, InvocationTargetException, TaskIdDuplicateException,
             UrlNotReachableException, AuthenticationRequiredException,
             AuthenticationWaitedException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final TaskRepository taskRepository = new TaskRepository();
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
    final Task actual = taskRepository.add(task);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("", actual.getMd5());
    Assert.assertEquals(new Long(0L), actual.getFileLength());
    Assert.assertNull(actual.getBizId());
    Assert.assertEquals(new Integer(0), actual.getPieceSize());
    Assert.assertEquals(new Long(0L), actual.getHttpFileLen());
    Assert.assertNull(actual.getRealMd5());
    Assert.assertNull(actual.getTaskUrl());
    Assert.assertEquals(new Integer(0), actual.getPieceTotal());
    Assert.assertEquals("0", actual.getCurIp());
    Assert.assertNotNull(((Task)actual).getPieceMd5Map());
    Assert.assertNull(actual.getSourceUrl());
    Assert.assertEquals(CdnStatus.SUCCESS, actual.getCdnStatus());
    Assert.assertEquals("", actual.getTaskId());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, HttpClientUtil.class, StringUtils.class,
                   ConcurrentHashMap.class, TaskRepository.class, URL.class, Logger.class,
                   Task.class})
  @Test
  public void
  addInputNotNullOutputNotNull2()
      throws Exception, InvocationTargetException, TaskIdDuplicateException,
             UrlNotReachableException, AuthenticationRequiredException,
             AuthenticationWaitedException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final TaskRepository taskRepository = new TaskRepository();
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
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("").when(uRL, getProtocolMethod).withNoArguments();
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(200).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    final Method getContentLengthLongMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getContentLengthLong");
    PowerMockito.doReturn(467_292_546_662_399L)
        .when(httpURLConnection, getContentLengthLongMethod)
        .withNoArguments();
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);
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
    final Task actual = taskRepository.add(task);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("", actual.getMd5());
    Assert.assertEquals(new Long(0L), actual.getFileLength());
    Assert.assertNull(actual.getBizId());
    Assert.assertEquals(new Integer(15_728_640), actual.getPieceSize());
    Assert.assertEquals(new Long(467_292_546_662_399L), actual.getHttpFileLen());
    Assert.assertNull(actual.getRealMd5());
    Assert.assertNull(actual.getTaskUrl());
    Assert.assertEquals(new Integer(0), actual.getPieceTotal());
    Assert.assertEquals("0", actual.getCurIp());
    Assert.assertNotNull(((Task)actual).getPieceMd5Map());
    Assert.assertNull(actual.getSourceUrl());
    Assert.assertEquals(CdnStatus.SUCCESS, actual.getCdnStatus());
    Assert.assertEquals("", actual.getTaskId());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, HttpClientUtil.class, StringUtils.class,
                   ConcurrentHashMap.class, TaskRepository.class, URL.class, Logger.class,
                   Task.class})
  @Test
  public void
  addInputNotNullOutputNotNull3()
      throws Exception, InvocationTargetException, TaskIdDuplicateException,
             UrlNotReachableException, AuthenticationRequiredException,
             AuthenticationWaitedException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final TaskRepository taskRepository = new TaskRepository();
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
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("").when(uRL, getProtocolMethod).withNoArguments();
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(200).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    final Method getContentLengthLongMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getContentLengthLong");
    PowerMockito.doReturn(467_292_546_662_399L)
        .when(httpURLConnection, getContentLengthLongMethod)
        .withNoArguments();
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);
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
    final Task actual = taskRepository.add(task);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("", actual.getMd5());
    Assert.assertEquals(new Long(0L), actual.getFileLength());
    Assert.assertNull(actual.getBizId());
    Assert.assertEquals(new Integer(0), actual.getPieceSize());
    Assert.assertEquals(new Long(467_292_546_662_399L), actual.getHttpFileLen());
    Assert.assertNull(actual.getRealMd5());
    Assert.assertNull(actual.getTaskUrl());
    Assert.assertEquals(new Integer(0), actual.getPieceTotal());
    Assert.assertEquals("0", actual.getCurIp());
    Assert.assertNotNull(((Task)actual).getPieceMd5Map());
    Assert.assertNull(actual.getSourceUrl());
    Assert.assertEquals(CdnStatus.SUCCESS, actual.getCdnStatus());
    Assert.assertEquals("", actual.getTaskId());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, HttpClientUtil.class, StringUtils.class,
                   ConcurrentHashMap.class, TaskRepository.class, URL.class, Logger.class,
                   Task.class})
  @Test
  public void
  addInputNotNullOutputNotNull4()
      throws Exception, InvocationTargetException, TaskIdDuplicateException,
             UrlNotReachableException, AuthenticationRequiredException,
             AuthenticationWaitedException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final TaskRepository taskRepository = new TaskRepository();
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
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("").when(uRL, getProtocolMethod).withNoArguments();
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(200).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    final Method getContentLengthLongMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getContentLengthLong");
    PowerMockito.doReturn(209_715_201L)
        .when(httpURLConnection, getContentLengthLongMethod)
        .withNoArguments();
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);
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
    final Task actual = taskRepository.add(task);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("", actual.getMd5());
    Assert.assertEquals(new Long(0L), actual.getFileLength());
    Assert.assertNull(actual.getBizId());
    Assert.assertEquals(new Integer(4_194_304), actual.getPieceSize());
    Assert.assertEquals(new Long(209_715_201L), actual.getHttpFileLen());
    Assert.assertNull(actual.getRealMd5());
    Assert.assertNull(actual.getTaskUrl());
    Assert.assertEquals(new Integer(0), actual.getPieceTotal());
    Assert.assertEquals("0", actual.getCurIp());
    Assert.assertNotNull(((Task)actual).getPieceMd5Map());
    Assert.assertNull(actual.getSourceUrl());
    Assert.assertEquals(CdnStatus.SUCCESS, actual.getCdnStatus());
    Assert.assertEquals("", actual.getTaskId());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({HttpURLConnection.class, HttpClientUtil.class, StringUtils.class,
                   ConcurrentHashMap.class, TaskRepository.class, URL.class, Logger.class,
                   Task.class})
  @Test
  public void
  addInputNotNullOutputNotNull5()
      throws Exception, InvocationTargetException, TaskIdDuplicateException,
             UrlNotReachableException, AuthenticationRequiredException,
             AuthenticationWaitedException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final TaskRepository taskRepository = new TaskRepository();
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
    final URL uRL = PowerMockito.mock(URL.class);
    final Method getProtocolMethod = DTUMemberMatcher.method(URL.class, "getProtocol");
    PowerMockito.doReturn("").when(uRL, getProtocolMethod).withNoArguments();
    final HttpURLConnection httpURLConnection = PowerMockito.mock(HttpURLConnection.class);
    final Method getResponseCodeMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getResponseCode");
    PowerMockito.doReturn(200).when(httpURLConnection, getResponseCodeMethod).withNoArguments();
    final Method getContentLengthLongMethod =
        DTUMemberMatcher.method(HttpURLConnection.class, "getContentLengthLong");
    PowerMockito.doReturn(75_497_472L)
        .when(httpURLConnection, getContentLengthLongMethod)
        .withNoArguments();
    final Method openConnectionMethod = DTUMemberMatcher.method(URL.class, "openConnection");
    PowerMockito.doReturn(httpURLConnection).when(uRL, openConnectionMethod).withNoArguments();
    PowerMockito.whenNew(URL.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenReturn(uRL);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);
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
    final Task actual = taskRepository.add(task);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("", actual.getMd5());
    Assert.assertEquals(new Long(0L), actual.getFileLength());
    Assert.assertNull(actual.getBizId());
    Assert.assertEquals(new Integer(4_194_304), actual.getPieceSize());
    Assert.assertEquals(new Long(75_497_472L), actual.getHttpFileLen());
    Assert.assertNull(actual.getRealMd5());
    Assert.assertNull(actual.getTaskUrl());
    Assert.assertEquals(new Integer(0), actual.getPieceTotal());
    Assert.assertEquals("0", actual.getCurIp());
    Assert.assertNotNull(((Task)actual).getPieceMd5Map());
    Assert.assertNull(actual.getSourceUrl());
    Assert.assertEquals(CdnStatus.SUCCESS, actual.getCdnStatus());
    Assert.assertEquals("", actual.getTaskId());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, Task.class, TaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void addInputNotNullOutputUrlNotReachableException()
      throws Exception, InvocationTargetException, TaskIdDuplicateException,
             UrlNotReachableException, AuthenticationRequiredException,
             AuthenticationWaitedException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final TaskRepository taskRepository = new TaskRepository();
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
    thrown.expect(UrlNotReachableException.class);
    taskRepository.add(task);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Task.class, TaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void addInputNotNullOutputUrlNotReachableException2()
      throws Exception, InvocationTargetException, TaskIdDuplicateException,
             UrlNotReachableException, AuthenticationRequiredException,
             AuthenticationWaitedException {

    // Arrange
    final TaskRepository taskRepository = (TaskRepository)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.repository.TaskRepository");
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    Reflector.setField(task, "notReachable", true);
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
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    thrown.expect(UrlNotReachableException.class);
    taskRepository.add(task);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void getInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final TaskRepository taskRepository = new TaskRepository();

    // Act
    final Task actual = taskRepository.get("!!!!!!!!");

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMd5());
    Assert.assertNull(actual.getFileLength());
    Assert.assertNull(actual.getBizId());
    Assert.assertNull(actual.getPieceSize());
    Assert.assertNull(actual.getHttpFileLen());
    Assert.assertNull(actual.getRealMd5());
    Assert.assertNull(actual.getTaskUrl());
    Assert.assertNull(actual.getPieceTotal());
    Assert.assertNull(actual.getCurIp());
    Assert.assertNull(((Task)actual).getPieceMd5Map());
    Assert.assertNull(actual.getSourceUrl());
    Assert.assertNull(actual.getCdnStatus());
    Assert.assertNull(actual.getTaskId());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeInputNotNullOutputFalse() throws Exception {

    // Arrange
    final TaskRepository taskRepository = new TaskRepository();

    // Act and Assert result
    Assert.assertFalse(taskRepository.remove(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeInputNotNullOutputTrue() throws Exception {

    // Arrange
    final TaskRepository taskRepository = new TaskRepository();

    // Act and Assert result
    Assert.assertTrue(taskRepository.remove(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(TaskRepository.class)
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.TaskRepository");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(TaskRepository.class, null, "logger"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void updateTaskInfoInputNotNullNotNullNullNullSource_errorOutputFalse() throws Exception {

    // Arrange
    final TaskRepository taskRepository = new TaskRepository();
    final CdnStatus cdnStatus = CdnStatus.SOURCE_ERROR;

    // Act and Assert result
    Assert.assertFalse(taskRepository.updateTaskInfo("0", "", null, null, cdnStatus));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void updateTaskInfoInputNotNullNotNullNullNullSource_errorOutputTrue() throws Exception {

    // Arrange
    final TaskRepository taskRepository = new TaskRepository();
    final CdnStatus cdnStatus = CdnStatus.SOURCE_ERROR;

    // Act and Assert result
    Assert.assertTrue(taskRepository.updateTaskInfo("0", "", null, null, cdnStatus));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void updateTaskInfoInputNotNullNotNullNullNullSuccessOutputTrue() throws Exception {

    // Arrange
    final TaskRepository taskRepository = new TaskRepository();
    final CdnStatus cdnStatus = CdnStatus.SUCCESS;

    // Act and Assert result
    Assert.assertTrue(taskRepository.updateTaskInfo("0", "", null, null, cdnStatus));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({TaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void updateTaskInfoInputNotNullNotNullNullNullWaitOutputTrue() throws Exception {

    // Arrange
    final TaskRepository taskRepository = new TaskRepository();
    final CdnStatus cdnStatus = CdnStatus.WAIT;

    // Act and Assert result
    Assert.assertTrue(taskRepository.updateTaskInfo("0", "", null, null, cdnStatus));
  }
}
