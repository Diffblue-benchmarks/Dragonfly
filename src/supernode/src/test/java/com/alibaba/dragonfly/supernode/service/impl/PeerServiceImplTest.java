package com.alibaba.dragonfly.supernode.service.impl;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta;
import com.alibaba.dragonfly.supernode.service.impl.PeerServiceImpl;
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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

@RunWith(PowerMockRunner.class)
public class PeerServiceImplTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void addInputNullOutputNullPointerException() {

    // Arrange
    final PeerServiceImpl peerServiceImpl = new PeerServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    peerServiceImpl.add(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final PeerServiceImpl actual = new PeerServiceImpl();

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
    final PeerServiceImpl peerServiceImpl = (PeerServiceImpl)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.impl.PeerServiceImpl");
    Reflector.setField(peerServiceImpl, "peerRepo", null);
    final GcMeta gcMeta =
        (GcMeta)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta");
    Reflector.setField(gcMeta, "isAll", false);
    Reflector.setField(gcMeta, "taskId", "?");
    Reflector.setField(gcMeta, "cids", null);
    final Method isNotEmptyMethod =
        DTUMemberMatcher.method(CollectionUtils.class, "isNotEmpty", Collection.class);
    PowerMockito.doReturn(true)
        .when(CollectionUtils.class, isNotEmptyMethod)
        .withArguments(or(isA(Collection.class), isNull(Collection.class)));

    // Act
    thrown.expect(NullPointerException.class);
    peerServiceImpl.gc(gcMeta);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(CollectionUtils.class)
  @Test
  public void gcInputNotNullOutputTrue() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(CollectionUtils.class);

    // Arrange
    final PeerServiceImpl peerServiceImpl = new PeerServiceImpl();
    Reflector.setField(peerServiceImpl, "peerRepo", null);
    final GcMeta gcMeta =
        (GcMeta)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta");
    Reflector.setField(gcMeta, "isAll", false);
    Reflector.setField(gcMeta, "taskId", "");
    Reflector.setField(gcMeta, "cids", null);
    final Method isNotEmptyMethod =
        DTUMemberMatcher.method(CollectionUtils.class, "isNotEmpty", Collection.class);
    PowerMockito.doReturn(false)
        .when(CollectionUtils.class, isNotEmptyMethod)
        .withArguments(or(isA(Collection.class), isNull(Collection.class)));

    // Act
    final boolean actual = peerServiceImpl.gc(gcMeta);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void gcInputNullOutputFalse() {

    // Arrange
    final PeerServiceImpl peerServiceImpl = new PeerServiceImpl();

    // Act and Assert result
    Assert.assertFalse(peerServiceImpl.gc(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getInputNotNullOutputNullPointerException() {

    // Arrange
    final PeerServiceImpl peerServiceImpl = new PeerServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    peerServiceImpl.get("?");

    // The method is not expected to return due to exception thrown
  }
}
