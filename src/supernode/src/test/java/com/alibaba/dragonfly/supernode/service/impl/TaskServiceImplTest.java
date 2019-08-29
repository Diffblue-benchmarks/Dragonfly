package com.alibaba.dragonfly.supernode.service.impl;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta;
import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import com.alibaba.dragonfly.supernode.common.exception.AuthenticationRequiredException;
import com.alibaba.dragonfly.supernode.common.exception.AuthenticationWaitedException;
import com.alibaba.dragonfly.supernode.common.exception.TaskIdDuplicateException;
import com.alibaba.dragonfly.supernode.common.exception.UrlNotReachableException;
import com.alibaba.dragonfly.supernode.service.impl.TaskServiceImpl;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.commons.codec.digest.DigestUtils;
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

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class TaskServiceImplTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void addInputNullOutputNullPointerException()
      throws AuthenticationWaitedException, AuthenticationRequiredException,
             UrlNotReachableException, TaskIdDuplicateException {

    // Arrange
    final TaskServiceImpl taskServiceImpl = new TaskServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    taskServiceImpl.add(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final TaskServiceImpl actual = new TaskServiceImpl();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DigestUtils.class, StringUtils.class})
  @Test
  public void createTaskIdInputNotNullNotNullNotNullOutputNotNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);
    PowerMockito.mockStatic(DigestUtils.class);

    // Arrange
    final TaskServiceImpl taskServiceImpl = new TaskServiceImpl();
    Reflector.setField(taskServiceImpl, "taskRepo", null);
    final String taskUrl = "";
    final String md5 = "";
    final String bizId = "";
    final Method sha256HexMethod =
        DTUMemberMatcher.method(DigestUtils.class, "sha256Hex", String.class);
    PowerMockito.doReturn("")
        .when(DigestUtils.class, sha256HexMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final String actual = taskServiceImpl.createTaskId(taskUrl, md5, bizId);

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DigestUtils.class, StringUtils.class})
  @Test
  public void createTaskIdInputNotNullNotNullNotNullOutputNotNull2() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);
    PowerMockito.mockStatic(DigestUtils.class);

    // Arrange
    final TaskServiceImpl taskServiceImpl = new TaskServiceImpl();
    Reflector.setField(taskServiceImpl, "taskRepo", null);
    final String taskUrl = "";
    final String md5 = "";
    final String bizId = "";
    final Method sha256HexMethod =
        DTUMemberMatcher.method(DigestUtils.class, "sha256Hex", String.class);
    PowerMockito.doReturn("")
        .when(DigestUtils.class, sha256HexMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false))
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final String actual = taskServiceImpl.createTaskId(taskUrl, md5, bizId);

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({DigestUtils.class, StringUtils.class})
  @Test
  public void createTaskIdInputNotNullNotNullNotNullOutputNotNull3() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);
    PowerMockito.mockStatic(DigestUtils.class);

    // Arrange
    final TaskServiceImpl taskServiceImpl = new TaskServiceImpl();
    Reflector.setField(taskServiceImpl, "taskRepo", null);
    final String taskUrl = "";
    final String md5 = "";
    final String bizId = "";
    final Method sha256HexMethod =
        DTUMemberMatcher.method(DigestUtils.class, "sha256Hex", String.class);
    PowerMockito.doReturn("")
        .when(DigestUtils.class, sha256HexMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final String actual = taskServiceImpl.createTaskId(taskUrl, md5, bizId);

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void gcInputNotNullOutputNullPointerException() {

    // Arrange
    final TaskServiceImpl taskServiceImpl = new TaskServiceImpl();
    final GcMeta gcMeta = new GcMeta("?", null, true);

    // Act
    thrown.expect(NullPointerException.class);
    taskServiceImpl.gc(gcMeta);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void gcInputNotNullOutputTrue() {

    // Arrange
    final TaskServiceImpl taskServiceImpl = new TaskServiceImpl();
    final ArrayList<String> arrayList = new ArrayList<String>();
    final GcMeta gcMeta = new GcMeta("", arrayList, false);

    // Act and Assert result
    Assert.assertTrue(taskServiceImpl.gc(gcMeta));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void getFullPieceMd5sByTaskInputNotNullOutput0()
      throws Exception, InvocationTargetException {

    // Arrange
    final TaskServiceImpl taskServiceImpl = new TaskServiceImpl();
    Reflector.setField(taskServiceImpl, "taskRepo", null);
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
    final List<String> actual = taskServiceImpl.getFullPieceMd5sByTask(task);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getInputNotNullOutputNullPointerException() {

    // Arrange
    final TaskServiceImpl taskServiceImpl = new TaskServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    taskServiceImpl.get("?");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPieceMd5InputNotNullZeroOutputNullPointerException() {

    // Arrange
    final TaskServiceImpl taskServiceImpl = new TaskServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    taskServiceImpl.getPieceMd5("?", 0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPieceMd5InputNotNullZeroNotNullOutputNullPointerException() {

    // Arrange
    final TaskServiceImpl taskServiceImpl = new TaskServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    taskServiceImpl.setPieceMd5("?", 0, "?");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void updateCdnStatusInputNotNullSource_errorOutputNullPointerException() {

    // Arrange
    final TaskServiceImpl taskServiceImpl = new TaskServiceImpl();
    final CdnStatus cdnStatus = CdnStatus.SOURCE_ERROR;

    // Act
    thrown.expect(NullPointerException.class);
    taskServiceImpl.updateCdnStatus("??", cdnStatus);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void updateTaskInfoInputNotNullNotNullNullNullSource_errorOutputNullPointerException() {

    // Arrange
    final TaskServiceImpl taskServiceImpl = new TaskServiceImpl();
    final CdnStatus cdnStatus = CdnStatus.SOURCE_ERROR;

    // Act
    thrown.expect(NullPointerException.class);
    taskServiceImpl.updateTaskInfo("?", "?", null, null, cdnStatus);

    // The method is not expected to return due to exception thrown
  }
}
