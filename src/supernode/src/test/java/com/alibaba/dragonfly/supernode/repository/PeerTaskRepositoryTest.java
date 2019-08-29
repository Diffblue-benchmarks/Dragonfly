package com.alibaba.dragonfly.supernode.repository;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.domain.PeerTask;
import com.alibaba.dragonfly.supernode.common.enumeration.PeerTaskStatus;
import com.alibaba.dragonfly.supernode.repository.PeerTaskRepository;
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
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap$KeySetView;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(PowerMockRunner.class)
public class PeerTaskRepositoryTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void addInputNotNullOutputFalse() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerTaskRepository peerTaskRepository = new PeerTaskRepository();
    final PeerTask peerTask =
        (PeerTask)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.PeerTask");
    peerTask.setPieceSize(null);
    peerTask.setTaskId(null);
    peerTask.setStatus(PeerTaskStatus.WAIT);
    peerTask.setPath(null);
    peerTask.setCid(null);
    peerTask.setPort(0);
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = peerTaskRepository.add(peerTask);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, PeerTaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void addInputNotNullOutputTrue() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerTaskRepository peerTaskRepository = new PeerTaskRepository();
    final PeerTask peerTask =
        (PeerTask)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.PeerTask");
    Reflector.setField(peerTask, "pieceSize", null);
    Reflector.setField(peerTask, "taskId", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    Reflector.setField(peerTask, "status", PeerTaskStatus.WAIT);
    Reflector.setField(peerTask, "path", "!!!!");
    Reflector.setField(peerTask, "cid", "00000");
    Reflector.setField(peerTask, "port", 0);
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = peerTaskRepository.add(peerTask);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PeerTaskRepository.class, ConcurrentHashMap$KeySetView.class,
                   ConcurrentHashMap.class})
  @Test
  public void
  getCidsByTaskIdInputNotNullOutput0() throws Exception {

    // Arrange
    final PeerTaskRepository peerTaskRepository = new PeerTaskRepository();

    // Act
    final List<String> actual = peerTaskRepository.getCidsByTaskId("A");

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PeerTaskRepository.class, ConcurrentHashMap$KeySetView.class,
                   ConcurrentHashMap.class})
  @Test
  public void
  getCidsByTaskIdInputNotNullOutputConcurrentModificationException() throws Exception {

    // Arrange
    final PeerTaskRepository peerTaskRepository = new PeerTaskRepository();

    // Act
    thrown.expect(ConcurrentModificationException.class);
    peerTaskRepository.getCidsByTaskId("@");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PeerTaskRepository.class, ConcurrentHashMap$KeySetView.class,
                   ConcurrentHashMap.class})
  @Test
  public void
  getCidsByTaskIdInputNotNullOutputNullPointerException() throws Exception {

    // Arrange
    final PeerTaskRepository peerTaskRepository = new PeerTaskRepository();

    // Act
    thrown.expect(NullPointerException.class);
    peerTaskRepository.getCidsByTaskId("?");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, PeerTaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void getInputNotNullNotNullOutputNotNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerTaskRepository peerTaskRepository = new PeerTaskRepository();
    final String cid = "@@@@@";
    final String taskId = "00000";
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final PeerTask actual = peerTaskRepository.get(cid, taskId);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(new Integer(0), actual.getPieceSize());
    Assert.assertEquals("", actual.getTaskId());
    Assert.assertEquals(PeerTaskStatus.FAIL, actual.getStatus());
    Assert.assertEquals("", actual.getPath());
    Assert.assertEquals("", actual.getCid());
    Assert.assertEquals(0, actual.getPort());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void getInputNotNullNotNullOutputNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerTaskRepository peerTaskRepository = new PeerTaskRepository();
    final String cid = "@@@@@";
    final String taskId = "00000";
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final PeerTask actual = peerTaskRepository.get(cid, taskId);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void getInputNotNullNotNullOutputNull2() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerTaskRepository peerTaskRepository = new PeerTaskRepository();
    final String cid = "@@@@@";
    final String taskId = "00000";
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final PeerTask actual = peerTaskRepository.get(cid, taskId);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void removeInputNotNullNotNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerTaskRepository peerTaskRepository = new PeerTaskRepository();
    final String taskId = "@@@@@";
    final String cid = "@@@@@";
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = peerTaskRepository.remove(taskId, cid);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, PeerTaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeInputNotNullNotNullOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerTaskRepository peerTaskRepository = new PeerTaskRepository();
    final String taskId = "@@@@@";
    final String cid = "@@@@@";
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = peerTaskRepository.remove(taskId, cid);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(PeerTaskRepository.class)
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PeerTaskRepository");
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void updateStatusInputNotNullNotNullRunningOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerTaskRepository peerTaskRepository = new PeerTaskRepository();
    final String taskId = "";
    final String cid = "!!!!!";
    final PeerTaskStatus status = PeerTaskStatus.RUNNING;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = peerTaskRepository.updateStatus(taskId, cid, status);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, PeerTaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void updateStatusInputNotNullNotNullRunningOutputFalse2() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerTaskRepository peerTaskRepository = new PeerTaskRepository();
    final String taskId = "";
    final String cid = "!!!!!";
    final PeerTaskStatus status = PeerTaskStatus.RUNNING;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = peerTaskRepository.updateStatus(taskId, cid, status);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, PeerTaskRepository.class, ConcurrentHashMap.class})
  @Test
  public void updateStatusInputNotNullNotNullRunningOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerTaskRepository peerTaskRepository = new PeerTaskRepository();
    final String taskId = "";
    final String cid = "!!!!!";
    final PeerTaskStatus status = PeerTaskStatus.RUNNING;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = peerTaskRepository.updateStatus(taskId, cid, status);

    // Assert result
    Assert.assertTrue(actual);
  }
}
