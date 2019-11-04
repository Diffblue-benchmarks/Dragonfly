package com.alibaba.dragonfly.supernode.rest.controller;

import com.alibaba.dragonfly.supernode.common.view.ResultInfo;
import com.alibaba.dragonfly.supernode.rest.controller.PeerController;
import com.alibaba.dragonfly.supernode.rest.request.PullPieceTaskRequest;
import com.alibaba.dragonfly.supernode.rest.request.RegistryRequest;
import com.alibaba.dragonfly.supernode.rest.request.ReportPieceRequest;
import com.alibaba.dragonfly.supernode.rest.request.ReportServiceDownRequest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PeerControllerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999726c2394e8a4d813() {

    // Act, creating object to test constructor
    final PeerController actual = new PeerController();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void doRegistryInputNotNullOutputNotNull999a317218d1815bf5d() {

    // Arrange
    final PeerController thisObj = new PeerController();
    final RegistryRequest arg0 = new RegistryRequest();

    // Act
    final ResultInfo actual = thisObj.doRegistry(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(500, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertNull(actual.getData());

  }

  // Test written by Diffblue Cover
  @Test
  public void doRegistryWithJsonInputNotNullOutputNotNull9992fdbc7a981b1295d() {

    // Arrange
    final PeerController thisObj = new PeerController();
    final RegistryRequest arg0 = new RegistryRequest();

    // Act
    final ResultInfo actual = thisObj.doRegistryWithJson(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(500, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertNull(actual.getData());

  }

  // Test written by Diffblue Cover
  @Test
  public void pullPieceTaskInputNotNullOutputNotNull99959007d19448c92e5() {

    // Arrange
    final PeerController thisObj = new PeerController();
    final PullPieceTaskRequest arg0 = new PullPieceTaskRequest();

    // Act
    final ResultInfo actual = thisObj.pullPieceTask(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(500, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertNull(actual.getData());

  }

  // Test written by Diffblue Cover
  @Test
  public void reportPieceInputNotNullOutputNotNull9992ff88c43f4af1d8e() {

    // Arrange
    final PeerController thisObj = new PeerController();
    final ReportPieceRequest arg0 = new ReportPieceRequest();

    // Act
    final ResultInfo actual = thisObj.reportPiece(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(501, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertEquals("some param is empty", actual.getMsg());
    Assert.assertNull(actual.getData());

  }

  // Test written by Diffblue Cover
  @Test
  public void reportServiceDownInputNotNullOutputNotNull999a8eb36ef2e56e058() {

    // Arrange
    final PeerController thisObj = new PeerController();
    final ReportServiceDownRequest arg0 = new ReportServiceDownRequest();

    // Act
    final ResultInfo actual = thisObj.reportServiceDown(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(500, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertNull(actual.getData());

  }
}
