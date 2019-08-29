package com.alibaba.dragonfly.supernode.rest.controller;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.view.ResultInfo;
import com.alibaba.dragonfly.supernode.rest.controller.PeerController;
import com.alibaba.dragonfly.supernode.rest.request.PullPieceTaskRequest;
import com.alibaba.dragonfly.supernode.rest.request.RegistryRequest;
import com.alibaba.dragonfly.supernode.rest.request.ReportPieceRequest;
import com.alibaba.dragonfly.supernode.rest.request.ReportServiceDownRequest;
import com.alibaba.fastjson.JSON;
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

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class PeerControllerTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final PeerController actual = new PeerController();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({JSON.class, Logger.class})
  @Test
  public void doRegistryInputNotNullOutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(JSON.class);

    // Arrange
    final PeerController peerController = (PeerController)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.controller.PeerController");
    Reflector.setField(peerController, "commonPeerDispatcher", null);
    Reflector.setField(peerController, "progressService", null);
    Reflector.setField(peerController, "peerRegistryService", null);
    Reflector.setField(peerController, "lockService", null);
    Reflector.setField(peerController, "request", null);
    final RegistryRequest req = (RegistryRequest)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.request.RegistryRequest");
    Reflector.setField(req, "identifier", null);
    Reflector.setField(req, "version", null);
    Reflector.setField(req, "ip", null);
    Reflector.setField(req, "superNodeIp", null);
    Reflector.setField(req, "port", null);
    Reflector.setField(req, "taskUrl", null);
    Reflector.setField(req, "md5", null);
    Reflector.setField(req, "cid", null);
    Reflector.setField(req, "hostName", null);
    Reflector.setField(req, "dfdaemon", false);
    Reflector.setField(req, "path", null);
    Reflector.setField(req, "headers", null);
    Reflector.setField(req, "rawUrl", null);
    final Method toJSONMethod = DTUMemberMatcher.method(JSON.class, "toJSON", Object.class);
    PowerMockito.doReturn(null)
        .when(JSON.class, toJSONMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method toJSONStringMethod =
        DTUMemberMatcher.method(JSON.class, "toJSONString", Object.class);
    PowerMockito.doReturn(null)
        .when(JSON.class, toJSONStringMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));

    // Act
    final ResultInfo actual = peerController.doRegistry(req);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Logger.class)
  @Test
  public void doRegistryInputNullOutputNotNull() throws Exception {

    // Arrange
    final PeerController peerController = new PeerController();

    // Act
    final ResultInfo actual = peerController.doRegistry(null);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({JSON.class, Logger.class})
  @Test
  public void doRegistryInputNullOutputNotNull2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(JSON.class);

    // Arrange
    final PeerController peerController = (PeerController)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.controller.PeerController");
    Reflector.setField(peerController, "commonPeerDispatcher", null);
    Reflector.setField(peerController, "progressService", null);
    Reflector.setField(peerController, "peerRegistryService", null);
    Reflector.setField(peerController, "lockService", null);
    Reflector.setField(peerController, "request", null);
    final RegistryRequest req = null;
    final Method toJSONMethod = DTUMemberMatcher.method(JSON.class, "toJSON", Object.class);
    PowerMockito.doReturn(null)
        .when(JSON.class, toJSONMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method toJSONStringMethod =
        DTUMemberMatcher.method(JSON.class, "toJSONString", Object.class);
    PowerMockito.doReturn(null)
        .when(JSON.class, toJSONStringMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));

    // Act
    final ResultInfo actual = peerController.doRegistry(req);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Logger.class)
  @Test
  public void doRegistryWithJsonInputNullOutputNotNull() throws Exception {

    // Arrange
    final PeerController peerController = new PeerController();

    // Act
    final ResultInfo actual = peerController.doRegistryWithJson(null);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, PeerController.class, System.class})
  @Test
  public void pullPieceTaskInputNotNullOutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final PeerController peerController = (PeerController)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.controller.PeerController");
    Reflector.setField(peerController, "commonPeerDispatcher", null);
    Reflector.setField(peerController, "progressService", null);
    Reflector.setField(peerController, "peerRegistryService", null);
    Reflector.setField(peerController, "lockService", null);
    Reflector.setField(peerController, "request", null);
    final PullPieceTaskRequest req = (PullPieceTaskRequest)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.request.PullPieceTaskRequest");
    Reflector.setField(req, "srcCid", null);
    Reflector.setField(req, "status", null);
    Reflector.setField(req, "range", null);
    Reflector.setField(req, "taskId", null);
    Reflector.setField(req, "dstCid", null);
    Reflector.setField(req, "result", null);
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    final ResultInfo actual = peerController.pullPieceTask(req);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, PeerController.class, System.class})
  @Test
  public void pullPieceTaskInputNullOutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final PeerController peerController = (PeerController)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.controller.PeerController");
    Reflector.setField(peerController, "commonPeerDispatcher", null);
    Reflector.setField(peerController, "progressService", null);
    Reflector.setField(peerController, "peerRegistryService", null);
    Reflector.setField(peerController, "lockService", null);
    Reflector.setField(peerController, "request", null);
    final PullPieceTaskRequest req = null;
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    final ResultInfo actual = peerController.pullPieceTask(req);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, StringUtils.class, JSON.class})
  @Test
  public void reportPieceInputNotNullOutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);
    PowerMockito.mockStatic(JSON.class);

    // Arrange
    final PeerController peerController = (PeerController)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.controller.PeerController");
    Reflector.setField(peerController, "commonPeerDispatcher", null);
    Reflector.setField(peerController, "progressService", null);
    Reflector.setField(peerController, "peerRegistryService", null);
    Reflector.setField(peerController, "lockService", null);
    Reflector.setField(peerController, "request", null);
    final ReportPieceRequest req = (ReportPieceRequest)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.request.ReportPieceRequest");
    Reflector.setField(req, "dstCid", null);
    Reflector.setField(req, "pieceRange", null);
    Reflector.setField(req, "cid", null);
    Reflector.setField(req, "taskId", null);
    final Method toJSONMethod = DTUMemberMatcher.method(JSON.class, "toJSON", Object.class);
    PowerMockito.doReturn(null)
        .when(JSON.class, toJSONMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method toJSONStringMethod =
        DTUMemberMatcher.method(JSON.class, "toJSONString", Object.class);
    PowerMockito.doReturn(null)
        .when(JSON.class, toJSONStringMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));

    // Act
    final ResultInfo actual = peerController.reportPiece(req);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, StringUtils.class, JSON.class})
  @Test
  public void reportPieceInputNotNullOutputNotNull2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);
    PowerMockito.mockStatic(JSON.class);

    // Arrange
    final PeerController peerController = (PeerController)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.controller.PeerController");
    Reflector.setField(peerController, "commonPeerDispatcher", null);
    Reflector.setField(peerController, "progressService", null);
    Reflector.setField(peerController, "peerRegistryService", null);
    Reflector.setField(peerController, "lockService", null);
    Reflector.setField(peerController, "request", null);
    final ReportPieceRequest req = (ReportPieceRequest)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.request.ReportPieceRequest");
    Reflector.setField(req, "dstCid", null);
    Reflector.setField(req, "pieceRange", null);
    Reflector.setField(req, "cid", null);
    Reflector.setField(req, "taskId", null);
    final Method toJSONMethod = DTUMemberMatcher.method(JSON.class, "toJSON", Object.class);
    PowerMockito.doReturn(null)
        .when(JSON.class, toJSONMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(true))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method toJSONStringMethod =
        DTUMemberMatcher.method(JSON.class, "toJSONString", Object.class);
    PowerMockito.doReturn(null)
        .when(JSON.class, toJSONStringMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));

    // Act
    final ResultInfo actual = peerController.reportPiece(req);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, StringUtils.class, JSON.class})
  @Test
  public void reportPieceInputNotNullOutputNotNull3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);
    PowerMockito.mockStatic(JSON.class);

    // Arrange
    final PeerController peerController = (PeerController)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.controller.PeerController");
    Reflector.setField(peerController, "commonPeerDispatcher", null);
    Reflector.setField(peerController, "progressService", null);
    Reflector.setField(peerController, "peerRegistryService", null);
    Reflector.setField(peerController, "lockService", null);
    Reflector.setField(peerController, "request", null);
    final ReportPieceRequest req = (ReportPieceRequest)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.request.ReportPieceRequest");
    Reflector.setField(req, "dstCid", null);
    Reflector.setField(req, "pieceRange", null);
    Reflector.setField(req, "cid", null);
    Reflector.setField(req, "taskId", null);
    final Method toJSONMethod = DTUMemberMatcher.method(JSON.class, "toJSON", Object.class);
    PowerMockito.doReturn(null)
        .when(JSON.class, toJSONMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false).doReturn(true))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));
    final Method toJSONStringMethod =
        DTUMemberMatcher.method(JSON.class, "toJSONString", Object.class);
    PowerMockito.doReturn(null)
        .when(JSON.class, toJSONStringMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));

    // Act
    final ResultInfo actual = peerController.reportPiece(req);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, StringUtils.class})
  @Test
  public void reportPieceInputNotNullOutputNotNull4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerController peerController = (PeerController)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.controller.PeerController");
    Reflector.setField(peerController, "commonPeerDispatcher", null);
    Reflector.setField(peerController, "progressService", null);
    Reflector.setField(peerController, "peerRegistryService", null);
    Reflector.setField(peerController, "lockService", null);
    Reflector.setField(peerController, "request", null);
    final ReportPieceRequest req = (ReportPieceRequest)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.request.ReportPieceRequest");
    Reflector.setField(req, "dstCid", null);
    Reflector.setField(req, "pieceRange", null);
    Reflector.setField(req, "cid", null);
    Reflector.setField(req, "taskId", null);
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(false).doReturn(false).doReturn(false))
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final ResultInfo actual = peerController.reportPiece(req);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, JSON.class})
  @Test
  public void reportPieceInputNullOutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(JSON.class);

    // Arrange
    final PeerController peerController = (PeerController)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.controller.PeerController");
    Reflector.setField(peerController, "commonPeerDispatcher", null);
    Reflector.setField(peerController, "progressService", null);
    Reflector.setField(peerController, "peerRegistryService", null);
    Reflector.setField(peerController, "lockService", null);
    Reflector.setField(peerController, "request", null);
    final ReportPieceRequest req = null;
    final Method toJSONMethod = DTUMemberMatcher.method(JSON.class, "toJSON", Object.class);
    PowerMockito.doReturn(null)
        .when(JSON.class, toJSONMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));
    final Method toJSONStringMethod =
        DTUMemberMatcher.method(JSON.class, "toJSONString", Object.class);
    PowerMockito.doReturn(null)
        .when(JSON.class, toJSONStringMethod)
        .withArguments(or(isA(Object.class), isNull(Object.class)));

    // Act
    final ResultInfo actual = peerController.reportPiece(req);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Logger.class)
  @Test
  public void reportServiceDownInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final PeerController peerController = new PeerController();
    final ReportServiceDownRequest req = new ReportServiceDownRequest();

    // Act
    final ResultInfo actual = peerController.reportServiceDown(req);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Logger.class)
  @Test
  public void reportServiceDownInputNullOutputNotNull() throws Exception {

    // Arrange
    final PeerController peerController = new PeerController();

    // Act
    final ResultInfo actual = peerController.reportServiceDown(null);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.rest.controller.PeerController");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(PeerController.class, null, "log"));
  }
}
