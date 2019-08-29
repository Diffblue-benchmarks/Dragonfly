package com.alibaba.dragonfly.supernode.service.impl;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta;
import com.alibaba.dragonfly.supernode.common.enumeration.PeerPieceStatus;
import com.alibaba.dragonfly.supernode.common.view.ResultInfo;
import com.alibaba.dragonfly.supernode.service.impl.ProgressServiceImpl;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.commons.collections.CollectionUtils;
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

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class ProgressServiceImplTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final ProgressServiceImpl actual = new ProgressServiceImpl();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(CollectionUtils.class)
  @Test
  public void gcInputNotNullOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(CollectionUtils.class);

    // Arrange
    final ProgressServiceImpl progressServiceImpl = (ProgressServiceImpl)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.impl.ProgressServiceImpl");
    Reflector.setField(progressServiceImpl, "peerService", null);
    Reflector.setField(progressServiceImpl, "taskService", null);
    Reflector.setField(progressServiceImpl, "peerTaskService", null);
    Reflector.setField(progressServiceImpl, "progressRepo", null);
    final GcMeta gcMeta =
        (GcMeta)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta");
    Reflector.setField(gcMeta, "isAll", true);
    Reflector.setField(gcMeta, "taskId", "?");
    final ArrayList<String> arrayList = new ArrayList<String>();
    Reflector.setField(gcMeta, "cids", arrayList);
    final Method isNotEmptyMethod =
        DTUMemberMatcher.method(CollectionUtils.class, "isNotEmpty", Collection.class);
    PowerMockito.doReturn(true)
        .when(CollectionUtils.class, isNotEmptyMethod)
        .withArguments(or(isA(Collection.class), isNull(Collection.class)));

    // Act
    thrown.expect(NullPointerException.class);
    progressServiceImpl.gc(gcMeta);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(CollectionUtils.class)
  @Test
  public void gcInputNotNullOutputTrue() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(CollectionUtils.class);

    // Arrange
    final ProgressServiceImpl progressServiceImpl = new ProgressServiceImpl();
    Reflector.setField(progressServiceImpl, "peerService", null);
    Reflector.setField(progressServiceImpl, "taskService", null);
    Reflector.setField(progressServiceImpl, "peerTaskService", null);
    Reflector.setField(progressServiceImpl, "progressRepo", null);
    final GcMeta gcMeta =
        (GcMeta)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta");
    gcMeta.setAll(false);
    gcMeta.setTaskId("@@@");
    final ArrayList<String> arrayList = new ArrayList<String>();
    gcMeta.setCids(arrayList);
    final Method isNotEmptyMethod =
        DTUMemberMatcher.method(CollectionUtils.class, "isNotEmpty", Collection.class);
    PowerMockito.doReturn(true)
        .when(CollectionUtils.class, isNotEmptyMethod)
        .withArguments(or(isA(Collection.class), isNull(Collection.class)));

    // Act
    final boolean actual = progressServiceImpl.gc(gcMeta);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, StringUtils.class})
  @Test
  public void initProgressInputNotNullNotNullOutputNotNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressServiceImpl progressServiceImpl = new ProgressServiceImpl();
    Reflector.setField(progressServiceImpl, "peerService", null);
    Reflector.setField(progressServiceImpl, "taskService", null);
    Reflector.setField(progressServiceImpl, "peerTaskService", null);
    Reflector.setField(progressServiceImpl, "progressRepo", null);
    final String taskId = "0000000";
    final String cid = "!!!";
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final ResultInfo actual = progressServiceImpl.initProgress(taskId, cid);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getData());
    Assert.assertNull(actual.getAddition());
    Assert.assertEquals("init progress fail for taskId:0000000,cid:!!!", actual.getMsg());
    Assert.assertEquals(501, actual.getCode());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, StringUtils.class})
  @Test
  public void initProgressInputNotNullNotNullOutputNotNull2() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressServiceImpl progressServiceImpl = new ProgressServiceImpl();
    Reflector.setField(progressServiceImpl, "peerService", null);
    Reflector.setField(progressServiceImpl, "taskService", null);
    Reflector.setField(progressServiceImpl, "peerTaskService", null);
    Reflector.setField(progressServiceImpl, "progressRepo", null);
    final String taskId = "0000000";
    final String cid = "!!";
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final ResultInfo actual = progressServiceImpl.initProgress(taskId, cid);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getData());
    Assert.assertNull(actual.getAddition());
    Assert.assertEquals("init progress fail for taskId:0000000,cid:!!", actual.getMsg());
    Assert.assertEquals(501, actual.getCode());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, StringUtils.class})
  @Test
  public void parseAvaliablePeerTasksInputNotNullNotNullOutputNotNull()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressServiceImpl progressServiceImpl = (ProgressServiceImpl)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.impl.ProgressServiceImpl");
    Reflector.setField(progressServiceImpl, "peerService", null);
    Reflector.setField(progressServiceImpl, "taskService", null);
    Reflector.setField(progressServiceImpl, "peerTaskService", null);
    Reflector.setField(progressServiceImpl, "progressRepo", null);
    final String taskId = "?";
    final String cid = "?";
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final ResultInfo actual = progressServiceImpl.parseAvaliablePeerTasks(taskId, cid);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void parseAvaliablePeerTasksInputNotNullNotNullOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressServiceImpl progressServiceImpl = (ProgressServiceImpl)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.impl.ProgressServiceImpl");
    Reflector.setField(progressServiceImpl, "peerService", null);
    Reflector.setField(progressServiceImpl, "taskService", null);
    Reflector.setField(progressServiceImpl, "peerTaskService", null);
    Reflector.setField(progressServiceImpl, "progressRepo", null);
    final String taskId = "?";
    final String cid = "?";
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    thrown.expect(NullPointerException.class);
    progressServiceImpl.parseAvaliablePeerTasks(taskId, cid);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void processPieceSucInputNotNullNotNullZeroOutputNullPointerException() {

    // Arrange
    final ProgressServiceImpl progressServiceImpl = new ProgressServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    progressServiceImpl.processPieceSuc("?", "?", 0);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.service.impl.ProgressServiceImpl");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(ProgressServiceImpl.class, null, "logger"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void updateDownInfoInputNotNullOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressServiceImpl progressServiceImpl = (ProgressServiceImpl)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.impl.ProgressServiceImpl");
    Reflector.setField(progressServiceImpl, "peerService", null);
    Reflector.setField(progressServiceImpl, "taskService", null);
    Reflector.setField(progressServiceImpl, "peerTaskService", null);
    Reflector.setField(progressServiceImpl, "progressRepo", null);
    final String cid = "?";
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    thrown.expect(NullPointerException.class);
    progressServiceImpl.updateDownInfo(cid);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void updateDownInfoInputNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressServiceImpl progressServiceImpl = new ProgressServiceImpl();
    Reflector.setField(progressServiceImpl, "peerService", null);
    Reflector.setField(progressServiceImpl, "taskService", null);
    Reflector.setField(progressServiceImpl, "peerTaskService", null);
    Reflector.setField(progressServiceImpl, "progressRepo", null);
    final String cid = "!!";
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    progressServiceImpl.updateDownInfo(cid);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, StringUtils.class})
  @Test
  public void updateProgressInputNotNullNotNullNotNullNegativeWaitOutputNotNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressServiceImpl progressServiceImpl = new ProgressServiceImpl();
    Reflector.setField(progressServiceImpl, "peerService", null);
    Reflector.setField(progressServiceImpl, "taskService", null);
    Reflector.setField(progressServiceImpl, "peerTaskService", null);
    Reflector.setField(progressServiceImpl, "progressRepo", null);
    final String taskId = "00";
    final String srcCid = "}}}}}}}}}";
    final String dstCid = "";
    final int pieceNum = -10;
    final PeerPieceStatus pieceStatus = PeerPieceStatus.WAIT;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final ResultInfo actual =
        progressServiceImpl.updateProgress(taskId, srcCid, dstCid, pieceNum, pieceStatus);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getData());
    Assert.assertNull(actual.getAddition());
    Assert.assertEquals("src cid is empty for taskId:00", actual.getMsg());
    Assert.assertEquals(605, actual.getCode());
  }
}
