package com.alibaba.dragonfly.supernode.service.impl;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta;
import com.alibaba.dragonfly.supernode.common.enumeration.PeerTaskStatus;
import com.alibaba.dragonfly.supernode.service.impl.PeerTaskServiceImpl;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.commons.collections.CollectionUtils;
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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

@RunWith(PowerMockRunner.class)
public class PeerTaskServiceImplTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void addInputNullOutputNullPointerException() {

    // Arrange
    final PeerTaskServiceImpl peerTaskServiceImpl = new PeerTaskServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    peerTaskServiceImpl.add(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final PeerTaskServiceImpl actual = new PeerTaskServiceImpl();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(CollectionUtils.class)
  @Test
  public void gcInputNotNullOutputTrue() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(CollectionUtils.class);

    // Arrange
    final PeerTaskServiceImpl peerTaskServiceImpl = new PeerTaskServiceImpl();
    Reflector.setField(peerTaskServiceImpl, "peerTaskRepo", null);
    final GcMeta gcMeta =
        (GcMeta)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta");
    gcMeta.setAll(false);
    gcMeta.setTaskId("");
    final ArrayList<String> arrayList = new ArrayList<String>();
    gcMeta.setCids(arrayList);
    final Method isNotEmptyMethod =
        DTUMemberMatcher.method(CollectionUtils.class, "isNotEmpty", Collection.class);
    PowerMockito.doReturn(false)
        .when(CollectionUtils.class, isNotEmptyMethod)
        .withArguments(or(isA(Collection.class), isNull(Collection.class)));

    // Act
    final boolean actual = peerTaskServiceImpl.gc(gcMeta);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(CollectionUtils.class)
  @Test
  public void gcInputNotNullOutputTrue2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(CollectionUtils.class);

    // Arrange
    final PeerTaskServiceImpl peerTaskServiceImpl = new PeerTaskServiceImpl();
    Reflector.setField(peerTaskServiceImpl, "peerTaskRepo", null);
    final GcMeta gcMeta =
        (GcMeta)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta");
    gcMeta.setAll(false);
    gcMeta.setTaskId("");
    final ArrayList<String> arrayList = new ArrayList<String>();
    gcMeta.setCids(arrayList);
    final Method isNotEmptyMethod =
        DTUMemberMatcher.method(CollectionUtils.class, "isNotEmpty", Collection.class);
    PowerMockito.doReturn(true)
        .when(CollectionUtils.class, isNotEmptyMethod)
        .withArguments(or(isA(Collection.class), isNull(Collection.class)));

    // Act
    final boolean actual = peerTaskServiceImpl.gc(gcMeta);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCidsByTaskIdInputNotNullOutputNullPointerException() {

    // Arrange
    final PeerTaskServiceImpl peerTaskServiceImpl = new PeerTaskServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    peerTaskServiceImpl.getCidsByTaskId("?");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getInputNotNullNotNullOutputNullPointerException() {

    // Arrange
    final PeerTaskServiceImpl peerTaskServiceImpl = new PeerTaskServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    peerTaskServiceImpl.get("?", "?");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void updatePeerTaskStatusInputNotNullNotNullSuccessOutputNullPointerException() {

    // Arrange
    final PeerTaskServiceImpl peerTaskServiceImpl = new PeerTaskServiceImpl();
    final PeerTaskStatus status = PeerTaskStatus.SUCCESS;

    // Act
    thrown.expect(NullPointerException.class);
    peerTaskServiceImpl.updatePeerTaskStatus("?", "?", status);

    // The method is not expected to return due to exception thrown
  }
}
